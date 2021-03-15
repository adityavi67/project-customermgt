package com.cg.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.entities.Customer;
import com.cg.items.entity.Item;
import com.cg.items.service.IItemService;
import com.cg.service.ICustomerService;
@Component
public class CustomerUi {
	@Autowired
	
	private ICustomerService service;
	@Autowired
	private IItemService iService;
	public static void main(String[] args) {
		CustomerUi app = new CustomerUi();
		app.start();
	}
	
	
	public void start() {
		Customer c1 = service.createCustomer("Aditya");
		System.out.println(c1);
		Customer findC1 = service.findById(2);
		System.out.println("customer found with id" + findC1.getId() + "Name = " + findC1.getName());
		Item item1 = iService.create(100.0, "Bournville");
		System.out.println("Item " + item1.getId() + " " + item1.getDescription() + " " + item1.getPrice() + " " + item1.getAddedDate());
		
	}

}
