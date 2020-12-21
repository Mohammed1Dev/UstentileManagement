package com.gestionUstensile.app;

import com.gestionUstensile.models.*;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;

import com.gestionUstensile.database.*;

public class App {
	

	
	public static void main(String[] args) {
		
		try {
			Database database = new Database();
			
			Ustensile myRoundVessel;
			Ustensile mySquareVessel;
			Ustensile mySpoon;
			Scanner take = new Scanner(System.in);
			
			ResultSet resultlist;
			
			String name="", keep="", query="", date="";
	
			int id, constructionYear;
			int choice1, choice2;
			double radius, corner, length;
			boolean res;
			
			do {
				 System.out.println(" if you want to add Ustentile Enter 1 ");
				 System.out.println(" if you want to Update Ustensile Date Enter 2 ");
				 System.out.println(" if you want to See All Ustentile with Prices & surface Enter 3 ");
				
				 
				 choice1  = take.nextInt();
				 
				 switch(choice1) {
				 case 1:
					 System.out.println("Enter 1 to add a Round Vessel...");
					 System.out.println("Enter 2 to add a Square Vessel...");
					 System.out.println("Enter 3 to add a Spoon...");
					 break;
				 case 2:
					 System.out.println("Enter 1 to Update a Round Vessel Date...");
					 System.out.println("Enter 2 to Update a Square Vessel Date...");
					 System.out.println("Enter 3 to Update a Spoon Date...");
					 break;
				 case 3:
						query = "select * from roundvessel";
						database.connexion();
						resultlist = database.showLists(query);
						System.out.println("Round-Vessel List");
						System.out.println("   id_ustensile || Year Bulding  ||   name_ustensile || Radius ||      Surface     || Price  ||");
						while(resultlist.next())
						{
							System.out.println(resultlist.getInt("id")+" | "+resultlist.getInt("construction_year")+" | "+resultlist.getString("name")+" | "+resultlist.getInt("radius")+" | "+resultlist.getDouble("surface")+"|"+resultlist.getInt("price")+"\n");
							
						}
						query = "select * from squarevessel";
						database.connexion();
						resultlist = database.showLists(query);
						System.out.println("Square-Vessel List");
						System.out.println("   id_ustensile || Year Bulding  ||   name_ustensile || Radius ||      Surface     || Price  ||");
						while(resultlist.next())
						{
							System.out.println(resultlist.getInt("id")+" | "+resultlist.getInt("construction_year")+" | "+resultlist.getString("name")+" | "+resultlist.getInt("corner")+" | "+resultlist.getDouble("surface")+"|"+resultlist.getInt("price")+"\n");
							
						}
						query = "select * from spoon";
						database.connexion();
						resultlist = database.showLists(query);
						System.out.println("Spoon List");
						System.out.println("   id_ustensile || Year Bulding || length|| Price  ||");
						while(resultlist.next())
						{
							System.out.println(resultlist.getInt("id")+" | "+resultlist.getInt("construction_year")+" | "+resultlist.getDouble("length")+" | "+resultlist.getInt("price")+"\n");
							
						}
						database.deConnexion();
					 break;
			
				
				 }
			
				 choice2 = take.nextInt();
				 
			if(choice1 == 1)
			{
				switch(choice2) {
				case 1:
					System.out.println("Enter the Ustantile Construction Year ");
					constructionYear = take.nextInt();
					System.out.println("Enter the Ustantile name");
					take.nextLine();
					name += take.next();
					System.out.println("Enter the Ustantile Radius");
					take.nextLine();
					radius = take.nextInt();
					myRoundVessel = new RoundVessel(constructionYear, name, radius);
					query = "insert into roundvessel values(null," +constructionYear +",'"+ name+"',"+radius+","+((Vessel) myRoundVessel).calculeSurface()+","+myRoundVessel.getPrice()+")";
					database.connexion();
					res = database.insertOne(query);
					if(res == true)
						System.out.println("Adding Succes");
					else
						System.out.println("Adding Failed");
					database.deConnexion();
					
					break;
				case 2:
					System.out.println("Enter the Ustantile Construction Year ");
					constructionYear = take.nextInt();
					System.out.println("Enter the Ustantile name");
					take.nextLine();
					name += take.next();
					System.out.println("Enter the Ustantile Corner");
					take.nextLine();
					corner = take.nextInt();
					mySquareVessel = new SquareVessel(constructionYear, name, corner);
					query = "insert into squarevessel values(null," +constructionYear +",'"+ name+"',"+corner+","+((Vessel) mySquareVessel).calculeSurface()+","+mySquareVessel.getPrice()+")";
					database.connexion();
					res = database.insertOne(query);
					if(res == true)
						System.out.println("Adding Succes");
					else
						System.out.println("Adding Failed");
					database.deConnexion();
					break;
				case 3:
					System.out.println("Enter the Ustantile Construction Year");
					constructionYear = take.nextInt();
					System.out.println("Enter the Ustantile name");
					take.nextLine();
					name += take.next();
					System.out.println("Enter the Ustantile length");
					take.nextLine();
					length = take.nextInt();
					mySpoon = new Spoon(constructionYear, length);
					query = "insert into spoon values(null," +constructionYear +","+length+","+mySpoon.getPrice()+")";
					database.connexion();
					res = database.insertOne(query);
					if(res == true)
						System.out.println("Adding Succes");
					else
						System.out.println("Adding Failed");
					database.deConnexion();
					break;
				}
			}else if(choice1 == 2) {
				switch(choice2) {
				case 1:
					query = "select * from roundvessel";
					database.connexion();
					resultlist = database.showLists(query);
					System.out.println("   id_ustensile || Year Bulding  ||   name_ustensile || Radius ||      Surface     || Price  ||");
					while(resultlist.next())
					{
						System.out.println(resultlist.getInt("id")+" | "+resultlist.getInt("construction_year")+" | "+resultlist.getString("name")+" | "+resultlist.getInt("radius")+" | "+resultlist.getDouble("surface")+"|"+resultlist.getInt("price")+"\n");
						
					}
					
					System.out.println("Enter the id Ustantile you wish Update");
					id = take.nextInt();
					System.out.println("Enter the new Ustantile Construction Year");
					constructionYear = take.nextInt();
					
					query = "UPDATE roundvessel set construction_year ="+constructionYear+" where id="+id;
					res = database.updateContractDate(query);
					if(res == true)
						System.out.println("Updating year Successfuly");
					else
						System.out.println("Updating year Failed");
					database.deConnexion();
					break;
				case 2:
					query = "select * from squarevessel";
					database.connexion();
					resultlist = database.showLists(query);
					System.out.println("   id_ustensile || Year Bulding  ||   name_ustensile || Radius ||      Surface     || Price  ||");
					while(resultlist.next())
					{
						System.out.println(resultlist.getInt("id")+" | "+resultlist.getInt("construction_year")+" | "+resultlist.getString("name")+" | "+resultlist.getInt("corner")+" | "+resultlist.getDouble("surface")+"|"+resultlist.getInt("price")+"\n");
						
					}
					
					System.out.println("Enter the id Ustantile you wish Update");
					id = take.nextInt();
					System.out.println("Enter the new Ustantile Construction Year");
					constructionYear = take.nextInt();
					
					query = "UPDATE squarevessel set construction_year ="+constructionYear+" where id="+id;
					res = database.updateContractDate(query);
					if(res == true)
						System.out.println("Updating year Successfuly");
					else
						System.out.println("Updating year Failed");
					database.deConnexion();
					break;
				case 3:
					query = "select * from spoon";
					database.connexion();
					resultlist = database.showLists(query);
					System.out.println("   id_ustensile || Year Bulding || length|| Price  ||");
					while(resultlist.next())
					{
						System.out.println(resultlist.getInt("id")+" | "+resultlist.getInt("construction_year")+" | "+resultlist.getDouble("length")+" | "+resultlist.getInt("price")+"\n");
						
					}
					
					System.out.println("Enter the id Ustantile you wish Update");
					id = take.nextInt();
					System.out.println("Enter the new Ustantile Construction Year");
					constructionYear = take.nextInt();
					
					query = "UPDATE spoon set construction_year ="+constructionYear+" where id="+id;
					res = database.updateContractDate(query);
					if(res == true)
						System.out.println("Updating year Successfuly");
					else
						System.out.println("Updating year Failed");
					database.deConnexion();
					break;
				}
			}
				
				
				
				System.out.println("iF you wish to continue Enter YES or No to quit");
				keep = take.next();
					
				}while(keep.equalsIgnoreCase("yes"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}
	
	

}
