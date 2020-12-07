package com.pharmacieintelligente.model;

public class Person {
	
	private int id;

	private String firstName;

	private String lastName;

	private String tel;
	
	

	public Person(int id, String firstName, String lastName, String tel) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tel = tel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	

}
