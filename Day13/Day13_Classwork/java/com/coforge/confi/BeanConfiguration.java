package com.coforge.confi;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coforge.model.Customer;
import com.coforge.model.DeliveryAddress;

@Configuration
public class BeanConfiguration {
	
	@Bean(name = "customer1")
	public Customer getcustomer() {
		Customer customer = new Customer();
		customer.setCustomerId(1);
		customer.setCustomerName("Siuuu");
		customer.setEmails(Arrays.asList("valan@gmail.com","Valan1@gmail.com"));
		customer.setDeliveryAddress(Arrays.asList(getDeliveryAddress(),getDeliveryAddress2()));
		return customer;
		
	}
	
	
	@Bean(name = "deliveryAddress1")
	public DeliveryAddress  getDeliveryAddress() {
		DeliveryAddress deliveryAddress = new DeliveryAddress();
		deliveryAddress.setCity("City-1");
		deliveryAddress.setState("State-1");
		
		return deliveryAddress;
		
	}
	
	@Bean(name = "deliveryAddress2")
	public DeliveryAddress  getDeliveryAddress2() {
		DeliveryAddress deliveryAddress2 = new DeliveryAddress();
		deliveryAddress2.setCity("City-2");
		deliveryAddress2.setState("State-2");
		
		return deliveryAddress2;
		
	}
}
