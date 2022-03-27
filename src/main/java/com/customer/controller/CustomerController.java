package com.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.bean.UserResponse;
import com.customer.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customer")
	public List<UserResponse> getCustomer() {
		
		return customerService.getCustomer();
	}
	
	@GetMapping("/sort/customer")
	public List<UserResponse> getCustomerSorted() {
		
		return customerService.getSortedCustomer();
	}
}
