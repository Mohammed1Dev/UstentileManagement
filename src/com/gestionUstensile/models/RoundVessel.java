package com.gestionUstensile.models;



public class RoundVessel extends Vessel{
	
	private double radius;
	private final double PI;

	public RoundVessel(int constructionYear, String name, double radius) {
		super(constructionYear, name);
		this.PI = Math.PI;
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	//Call of inherited abstract method CalculeSurface
	public double calculeSurface() {
		
		return Math.pow(this.radius, 2)* this.PI;
		
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
		return super.toString()+"=>|RoundVessel [radius=" + radius + "]";
	}
	
	
	

}
