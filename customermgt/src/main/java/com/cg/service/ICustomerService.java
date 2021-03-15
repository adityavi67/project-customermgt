package com.cg.service;

import com.cg.entities.Customer;

public interface ICustomerService {
	
	public Customer findById(long customerId);
	
	public Customer createCustomer(String name);	
	
	public Customer addAmount(Long customerId, double amount);
	


}


