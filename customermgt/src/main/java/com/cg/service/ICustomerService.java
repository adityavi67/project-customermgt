package com.cg.service;

import com.cg.entities.Customer;
import com.cg.items.entity.Item;

import java.util.Set;

public interface ICustomerService {
	
	public Customer findById(Long customerId);
	
	public Customer createCustomer(String name);	
	
	public Customer addAmount(Long customerId, double amount);
	
	Set<Item> itemsBoughtByCustomer (Long customerId);
	


}


