package DealerShipTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Car {
	public static String Make;
	private static String Reg;
	private static String Model;
	private static String Colour;
	
	public Car(String make, String model, String regi, String colour) {
		this.Make = make;
		this.Model = model;
		this.Reg = regi;
		this.Colour = colour;
	}
	public static ArrayList<Car> addCar(ArrayList<String> Makes, Integer CarCounter, ArrayList<Car> Cars) {
		Integer Select;
		boolean TF=false;
		for (int i = 0; i < Makes.size(); i++) {
			System.out.println(i + ": " + Makes.get(i));
		}
	            Scanner choice = new Scanner(System.in);
	             {
	                System.out.println("Enter Numeric Choice: ");
	                while (!choice.hasNextInt()) {
	                    System.out.println("Error Please Enter Numeric Choice Again: ");
	                    choice.next();
	                }
	                Select = choice.nextInt();
	            }
        
	    if (Select >= Makes.size()) { 
	    	System.out.println("No records exist (Number entered too large)");
	    } else {
			for (int i2 = 0; i2 < Makes.size(); i2++) {
	              if(Makes.get(i2) == Makes.get(Select)){
	                   TF = true;
	              }
			}
	                
	        	if(TF == true) {
	        		 Make = Makes.get(Select);
	        		 Reg = Input.getString("What is the registration: ");
	        		 Model = Input.getString("What is the Model: ");
	        		 Colour = Input.getString("What is the Colour: ");
	        		 Cars.add(new Car(Make, Model, Reg, Colour));
	        	 } else {
	        		 System.out.println("Make is unavailable Please Try Again");
	        	 }
	                
	    }
	
		return Cars;
	    }
	
	}
