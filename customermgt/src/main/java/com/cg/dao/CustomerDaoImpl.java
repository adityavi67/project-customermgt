package com.cg.dao;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.entities.Customer;

@Repository
public class CustomerDaoImpl implements ICustomerDao{
	
	@PersistenceContext
	private EntityManager entityManager;

	
	@Override
	public Customer add(Customer customer) {
		entityManager.persist(customer);
		return customer;
	}

	@Override
	public Customer findById(Long customerId) {
		Customer customer = entityManager.find(Customer.class, customerId);
		return customer;
	}

	
	@Override
	public Customer update(Customer customer) {
		return null;
	}

}
