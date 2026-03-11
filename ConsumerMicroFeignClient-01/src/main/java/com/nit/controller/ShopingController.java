package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.client.IBillingServiceRestConsumer;

@RestController
@RequestMapping("/shopping/api")
public class ShopingController {
	
	@Autowired
	private IBillingServiceRestConsumer consumer;
	
	@GetMapping("/details")
	public String displayShoppingDetails() {
		
		System.out.println("ShoppingController::client comp class name::"+consumer.getClass());
		
		return "pongol shopping for family...."+consumer.fetchBillDetails();
		
	}

}


// when you run this feighn client first run eureka after that producer. 
//when eureka run in chrome or edge u can use http://localhost:8761/
//then showing instance value after that u click this instance and put requestmapping and get mapping value then one micsroservice connect to anothermicroservice.



//Instances currently registered with Eureka
//Application	AMIs	Availability Zones	Status
//CONSUMERMICROFEIGNCLIENT-01	n/a (1)	(1)	UP (1) - 172.16.0.176:ConsumerMicroFeignClient-01:6600
//PRODUCERMICROFEIGNCLIENT-01	n/a (1)	(1)	UP (1) - ProducerMicroFeignClient-01:84f1355b9a7da6013b3d0e4a6d27dc25

// after that u can click consumerclass and put this url like http://172.16.0.176:6600/shopping/api/details
// output comes like pongol shopping for family....we accept card payment,upi payment,netBanking payment,COD-->port::9900--InstanceId::ProducerMicroFeignClient-01:edd9e9fcb8a7e5d88f8b120011bfa3ad