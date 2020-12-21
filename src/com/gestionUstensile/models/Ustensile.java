package com.gestionUstensile.models;


//abstract class 
public abstract class Ustensile {

	private int id;
	protected int constructionYear;
	protected int price;
	
	

	//Constructor
	public Ustensile(int constructionYear) {
		
		this.id++;
		this.constructionYear = constructionYear;
		this.price = ustensilePrice();
		
	}

	//Getters & Setters
	public int getConstructionYear() {
		return this.constructionYear;
	}

	public void setConstructionYear(int constructionYear) {
		this.constructionYear = constructionYear;
	}
	
	
	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	//abstract method for calcule ustensilePrice
	public abstract int ustensilePrice();
	
	
	
	//Show method 
	@Override
	public String toString() {
		return "Ustensile [id=" + id + ", constructionYear=" + this.constructionYear + ", price=" + this.price + "]";
	}
	
	
	
	
	
	
}
