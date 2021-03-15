package com.cg.items.dao;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.items.entity.Item;
@Repository
public class ItemDaoImpl implements IItemDao {
	@Autowired
	private EntityManager entityManager;
	public String generatedString() {
		String s = "item";
		s = s + Math.random();
		return s;
	}
	
	@Override
	public Item add(Item item) {
		String id = generatedString();
		item.setId(id);
		entityManager.persist(item);
		return item;
	}
	
	@Transactional
	@Override
	public Item update(Item item) {
		item = entityManager.merge(item);
		return item;
		
	}
	@Override
	public Item findById(String itemId) {
		Item item = entityManager.find(Item.class, itemId);
		return item;
	}

	

}
