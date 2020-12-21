package com.gestionUstensile.models;



public class SquareVessel extends Vessel{
	
	private double corner;

	public SquareVessel(int constructionYear, String name, double corner) {
		super(constructionYear, name);
		this.corner = corner;
		super.price = ustensilePrice();
	}

	public double getCorner() {
		return corner;
	}

	public void setCorner(double corner) {
		this.corner = corner;
	}
	
	
	public double calculeSurface() {

		return Math.pow(this.corner, 2);
	}

	//Call of inherited abstract method Calculeprice
	public int ustensilePrice() {
		
		int currentYear = 2020;
		int ustensileOld = (currentYear - super.constructionYear);
		int result = 0;
		if(ustensileOld >= 50)
		{
			result = (ustensileOld -50) * 5;
		}
		
		return result;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+"=>|SquareVessel [corner=" + corner + "]";
	}

	
	
	
	
	

}
