package main;
import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    
//define menu selection variable
	    int menuSelection = 0;
//asking user to choose menu
	    

	//if not 4 ; do calculation     
	    
    while (menuSelection != 4 && menuSelection < 5) {
    	System.out.println("Please select an option:");
    	System.out.println("1. Cups to Teaspoons");
    	System.out.println("2. Miles to Kilometers");
    	System.out.println("3. US Gallons to Imperial Gallons");
    	System.out.println("4. Quit");
    	
//   	 get user input
    	menuSelection = sc.nextInt();
    	
    	double unit;
    	switch(menuSelection) {
    	  case 1:
    		  System.out.println("How many cups"); 
    		 
    		  unit = sc.nextDouble();
    		  System.out.println(unit +  " cups is " + unit * 48 + " Teaspoons" + "\n"); 
    		  
    		  break;
    	  case 2:
    		  System.out.println("How many Miles"); 
     		 
    		  unit = sc.nextDouble();
    		  System.out.println(unit +  " Miles is " + unit * 1.609 + " Kilometers" + "\n"); 
    		  break;
    	  case 3:
       		  System.out.println("How many  US Gallons"); 
      		 
    		  unit = sc.nextDouble();
    		  System.out.println(unit +  " US Gallons is " + unit/1.201 + " Imperial Gallons" + "\n"); 
    		  break;
    	  case 4:
    		  menuSelection = 4;
    		  System.out.println( "You quit the program"); 
    		  break;
    	  default:
    		  System.out.println( "Invalid input" + "\n"); 
    	}
 

    	
    	}
  

	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
