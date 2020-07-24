package com.embel.agriecom.agrisoft.allconfig.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import com.embel.agriecom.agrisoft.allconfig.entity.OrderDetails;
import com.embel.agriecom.agrisoft.allconfig.service.OrderDetailsService;

/* SAGAR */

@RestController
public class CloudToLocalController
{
	@Autowired
	public OrderDetailsService repoOrderDetails;	
	
	@Autowired(required = true)
	public RestTemplate restTemplate;
	
	List<OrderDetails> orderListFromCloud;
	Long cloudPkorderIdStart = 0l;
	Long cloudPkorderIdEnd = 0l;
	
	@Scheduled(initialDelay = 0, fixedRate = 60000)//for testing 1 minute
	//@Scheduled(initialDelay = 0, fixedRate = 300000)//5 Minutes
	@Transactional
	public void getCloudOrdersList()throws IOException
	{ 
		System.out.println("scheduler called");
		
		final String url = "http://localhost:8080/getAllCloudOrdersForLocal";
		//final String url = "http://agrisoft.embel.co.in/getAllCloudOrdersForLocal";
		
		OrderDetails[] order2 = null;
		try
		{
			ResponseEntity<OrderDetails[]> response = restTemplate.getForEntity(url,OrderDetails[].class);
			order2 = response.getBody();
		
			orderListFromCloud = Arrays.asList(order2);
			
			if(orderListFromCloud.size() > 0)
			{
				cloudPkorderIdStart = repoOrderDetails.getMaxOrderId();				
				repoOrderDetails.saveOrderListToLocalAgrisoftDb(orderListFromCloud);
				System.out.println(orderListFromCloud.size() +" NEW ORDERS");
				updateIsOnLocalYOnCloudPkIdRange(cloudPkorderIdStart);
			}
			else
			{
				System.out.println(orderListFromCloud.size() +" NEW ORDERS");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/* SAGAR */
	/* update Is On Local Y On Cloud Pk Id Range after inserting records to local agrisoft */
	public void updateIsOnLocalYOnCloudPkIdRange(Long cloudPkorderIdStart)throws IOException
	{
		try
		{			
			cloudPkorderIdEnd = repoOrderDetails.getMaxOrderId();
			
			List<Long> pkIdRange = new ArrayList<Long>();
			
			pkIdRange.add(cloudPkorderIdStart);
			pkIdRange.add(cloudPkorderIdEnd);
			
			final String url = "http://localhost:8080/updateCloudIsOnLocalYUsingRange/";
			//final String url = "http://agrisoft.embel.co.in/updateCloudIsOnLocalYUsingRange/";
			
			restTemplate.postForObject(url, pkIdRange, String.class);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
}