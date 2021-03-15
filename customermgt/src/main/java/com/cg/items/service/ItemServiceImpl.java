package com.cg.items.service;

import java.time.LocalDateTime;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ICustomerDao;
import com.cg.entities.Customer;
import com.cg.items.dao.*;
import com.cg.items.entity.Item;

@Service
public class ItemServiceImpl implements IItemService {

	@Autowired
	private IItemDao itemdao;
	@Autowired
	private ICustomerDao customerdao;

	@Transactional
	@Override
	public Item create(double price, String description) {
		Item item = new Item(price, description);
		LocalDateTime currentTime = LocalDateTime.now();
		item.setAddedDate(currentTime);
		return itemdao.add(item);
	}

	@Override
	public Item findById(String itemId) {
		Item item = itemdao.findById(itemId);
		return item;
	}

	@Transactional
	@Override
	public Item buyItem(String itemID, Long customerID) {
		Customer c = customerdao.findById(customerID);
		Item item = findById(itemID);
		item.setBoughtBy(c);
		itemdao.update(item);
		customerdao.update(c);
		return item;

	}

}
