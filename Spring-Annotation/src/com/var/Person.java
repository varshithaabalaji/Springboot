package com.var;

import org.springframework.beans.factory.annotation.Autowired;

public class Person implements PersonIntf {
	private String name;
	private Address address;
	
	public Person() {
		name="";
		address= null;
	
	}
	@Autowired
	public Person(String name,Address address) {
		this.name = name;
		this.address = address;
	}
	
	public void showPersonDetails() {
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
	}
	
	
}
