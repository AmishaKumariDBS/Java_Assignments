package com.training;

public class Person {
	private String name;
	private String address;
	
	public Person() {
		System.out.println("Default");
	}
	
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString()
	{
		return "Person's [name =" + name + ", address =" + address + "]";
	}
	
	

}
