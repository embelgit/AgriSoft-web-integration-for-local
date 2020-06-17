package com.embel.agriecom.agrisoft.allconfig.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.embel.agriecom.agrisoft.allconfig.entity.OrderDetails;
import com.embel.agriecom.agrisoft.allconfig.repository.OrderDetailsRepository;

@Service
public class OrderDetailsService
{
	@Autowired
	public OrderDetailsRepository repoOrderDetailsI;
	
	public void saveOrderListToLocalAgrisoftDb(List<OrderDetails> order)
	{
		repoOrderDetailsI.saveAll(order);
	}
	
	public Long getMaxOrderId()
	{
		Long maxOrderIdFinal = 0l;
		String maxOrderId = repoOrderDetailsI.getMaxPkOrderId();
		if(maxOrderId == null)
		{
			maxOrderIdFinal++;
		}
		else
		{
			maxOrderIdFinal = Long.parseLong(maxOrderId);
		}
		
		return maxOrderIdFinal;
	}	
}
