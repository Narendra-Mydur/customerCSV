package com.customer.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.bean.UserResponse;
import com.customer.dao.CustomerDao;

@Service
public class CustomerService {
	@Autowired
	private CustomerDao customerDao;
	
	public List<UserResponse> getCustomer(){
		
		return customerDao.readCsvData();
	}
	
	public List<UserResponse> getSortedCustomer(){
		List<UserResponse> userResponses=customerDao.readCsvData();
		Collections.sort(userResponses);
		return userResponses;
	}

}
