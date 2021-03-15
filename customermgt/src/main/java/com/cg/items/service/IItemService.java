package com.cg.items.service;

import com.cg.items.entity.Item;

public interface IItemService {

	public Item create(double price, String description);

	public Item findById(String itemID);

	public Item buyItem(String itemID, Long customerID);
}