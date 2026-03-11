package com.nit.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("ProducerMicroFeignClient-01")
public interface IBillingServiceRestConsumer {
	
	@GetMapping("/billing/api/info")
	public String fetchBillDetails();

}
