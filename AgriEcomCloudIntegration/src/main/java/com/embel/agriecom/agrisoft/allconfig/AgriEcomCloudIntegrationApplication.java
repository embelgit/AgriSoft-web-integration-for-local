package com.embel.agriecom.agrisoft.allconfig;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.embel.agriecom.agrisoft.allconfig.controller.CloudToLocalController;
import com.embel.agriecom.agrisoft.allconfig.entity.OrderDetails;

@SpringBootApplication
@EnableScheduling
public class AgriEcomCloudIntegrationApplication
{
	public static void main(String[] args) throws RestClientException, IOException
	{
		SpringApplication.run(AgriEcomCloudIntegrationApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
}
