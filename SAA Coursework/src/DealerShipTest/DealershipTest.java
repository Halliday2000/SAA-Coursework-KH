package DealerShipTest;

import java.util.ArrayList;

public class DealershipTest {

	public static void main(String[] args) {
		String[] Cars;
		ArrayList<String> Makes = new ArrayList<String>();
		String data;
		Integer CarCounter;
		String Search;
		boolean TF=false;
		CarCounter = 1;
		Integer choice;
		do {
            System.out.println("0: Quit");
            System.out.println("1: Add a new make of car");
            System.out.println("2: Display makes of car available");
            System.out.println("3: Remove make of car");
            
            choice = Input.getInteger("Enter Choice: ");
            switch (choice){
            case 0:
            	data = Dealership.NewMake();
            	if(!Makes.contains(data))
            	       Makes.add(data);
            
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
            		 System.out.println(Search + " : Make unavailable");
            	 }
            
            	break;
            case 2:
            	
            	Search = Input.getString("Search Make/Manufacturer to Remove: ");
            	if (Makes.contains(Search)) {
            		Makes.remove(Search);
            	} else {
            	    System.out.println("Error No Match Found");
            	}
            
            	break;
            case 3:
            	
        		for (int i = 0; i < Makes.size(); i++) {
        			System.out.println(Makes.get(i));
        		}
                
            	break;
            default:
            	System.out.println("The choice you have entered is invalid please try another");
            }
		}while(choice!=0);

 }
}