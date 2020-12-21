package com.gestionUstensile.models;



public class Spoon extends Ustensile{

	private double length;

	
	//Constructor
	public Spoon(int constructionYear, double length) {
		super(constructionYear);
		this.length = length;
	}

	
	//Getters & Setters
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	
	//Call of inherited abstract method Calculeprice
	public int ustensilePrice() {
		
		int currentYear = 2020;
		int ustensileOld = (currentYear - super.constructionYear);
		int result = 0;
		if(ustensileOld >= 50)
		{
			result = ustensileOld -50;
		}
		
		return result;
	}
	

	@Override
	public String toString() {
		return super.toString()+"=>|Spoon [length=" + length + "]";
	}
	
	
	
	
}
