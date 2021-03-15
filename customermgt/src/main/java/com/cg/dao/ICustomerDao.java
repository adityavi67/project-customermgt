package com.cg.dao;

import com.cg.entities.Customer;

public interface ICustomerDao {
    Customer add(Customer customer);
	
	Customer findById(Long customerId);
	
	Customer update(Customer customer);

}
