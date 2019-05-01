package DealerShipTest;

import java.util.ArrayList;
import java.util.Scanner;

public class DealershipTest {

	public static void main(String[] args) {
		ArrayList<Car> Cars = new ArrayList<Car>();
		ArrayList<String> Makes = new ArrayList<String>();
		String data;
		Integer CarCounter;
		String Search;
		boolean TF=false;
		CarCounter = 0;
		Integer choice;
		do {
            System.out.println("0: End Session");
            System.out.println("1: Search For Make/manufacturer of Car");
            System.out.println("2: Remove a make of Car");
            System.out.println("3: Display All Makes/Manufacturers");
            System.out.println("4: Add a New Make/Manufacturer of Car");
            System.out.println("5: Add a New Car");
            
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Enter Choice: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Error Please Enter Choice Again: ");
                    sc.next();
                }
                choice = sc.nextInt();
            } while (choice <= 0);
            
            switch (choice){
            case 0:
            	
            	System.out.println("Session Ended");
            	System.exit(0);
            	
            	break;
            case 1:
            	Search = Input.getString("Search for car Manufacturers/Makes: ");    
            	
            	for(int i=0;i<Makes.size();i++){
                    if(Makes.get(i) == Search){
                        TF=true;
                        break;
                    }
                   }
            	if(TF) {
            	     System.out.println(Search + " : We sell this make");
            	 } else {
            		 System.out.println("Make '" + Search + "' is unavailable please try something else");
            	 }
            
            	break;
            case 2:
            	
            	Search = Input.getString("Search Make/Manufacturer to Remove: ");
            	if (Makes.contains(Search)) {
            		Makes.remove(Search);
            		System.out.println("Removed Successfully");
            	} else {
            	    System.out.println("Error No Match Found");
            	}
            
            	break;
            case 3:
            	
        		if (Makes.isEmpty()) {
        			System.out.println("Error No Records");
        		} else {
                	for (int i = 0; i < Makes.size(); i++) {
            			System.out.println(Makes.get(i));
            		}
        		}
                
            	break;
            case 4:
            	
            	data = Dealership.NewMake();
            	if(!Makes.contains(data)) {
            	       Makes.add(data);
            	       System.out.println(data + " Added Successfully");
            	} else if ((Makes.contains(data))){
            		   System.out.println("Error Already Exists");
            	} else
            		   System.out.println("Error Unsuccessful");
            	
            		
            	break;
            case 5:
            	
            	Cars = Car.addCar(Makes, CarCounter, Cars);
            	CarCounter ++;
            	
            	break;
            default:
            	
            	System.out.println("Error Please Enter Choice Again: ");
            }
		}while(choice!=0);

 }
}