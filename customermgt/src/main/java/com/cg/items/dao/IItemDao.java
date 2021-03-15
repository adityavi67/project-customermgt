package com.cg.items.dao;

import com.cg.items.entity.Item;

public interface IItemDao {
	public Item add(Item item);
	public Item update(Item item);
	public Item findById(String itemId);

}
