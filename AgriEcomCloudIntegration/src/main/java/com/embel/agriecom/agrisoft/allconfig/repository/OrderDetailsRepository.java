package com.embel.agriecom.agrisoft.allconfig.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.embel.agriecom.agrisoft.allconfig.entity.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Long>
{
	@Query
	(value = "Select MAX(pk_cloud_order_id) from order_details", nativeQuery = true)
	String getMaxPkOrderId();
}
