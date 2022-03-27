package com.cutomer.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.customer.controller.CustomerController;

@SpringBootTest
public class CustomerControllerTest {
	@Autowired
	CustomerController customerController;
	
	@Test
	public void testGetCustomer() {
		System.out.println(customerController.getCustomer());
	}
	
	@Test
	public void testGetCustomerSorted() {
		System.out.println("sorted list : "+customerController.getCustomerSorted());
	}

}
