package com.ProductManagemmentSystem.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Category {

	@Id
	@GeneratedValue 
	private int id;
	private String name;
	
	
}
