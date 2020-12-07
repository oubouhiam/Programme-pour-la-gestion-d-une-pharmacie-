package com.pharmacieintelligente.model;

public class Medicament {

	private int id;

	private String name;

	private String prix;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

	public Medicament(int id, String name, String prix) {
		super();
		this.id = id;
		this.name = name;
		this.prix = prix;
	}
	
	

}
