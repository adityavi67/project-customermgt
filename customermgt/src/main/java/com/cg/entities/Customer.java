package com.cg.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.cg.items.entity.Item;

@Entity
public class Customer {
	
	@GeneratedValue
	@Id
	private Long id;
	private String name;
	
	@OneToOne
	private Account account;
	
	@OneToMany(fetch = FetchType.EAGER)
	private Set<Item> boughtItems;
	
	public Customer() {
		
	}
	
	public Customer(String name, Account account) {
		this.name = name;
		this.account = account;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	public Set<Item> getBoughtItems(){
		return boughtItems;
	}
	
	public void setBoughtItems(Set<Item> boughtItems) {
		this.boughtItems = boughtItems;
		
	}


	

}
