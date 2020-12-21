package com.gestionUstensile.models;



public abstract class Vessel extends Ustensile{
	
	private String name;
	
	public Vessel(int constructionYear, String name) {
		super(constructionYear);
		this.name = name;
		
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	//abstract method
	public abstract double calculeSurface();
	

	@Override
	public String toString() {
		return super.toString()+"=>|Vessel [name=" + this.name + "]";
	}



	
	

	
}
