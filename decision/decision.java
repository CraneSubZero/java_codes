import java.util.Scanner;

public class decision {

  public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);

    int imo_age; 
    int majority=18; // CONSTANT
    int senior=60; 

    System.out.println("Enter your age: ");
    imo_age = sc.nextInt();
    

	  if (imo_age >= senior) {

        System.out.println("You are a SENIOR Citizen!"); // TRUE path

    } else if (imo_age >= majority) {  
    
    	  System.out.println("You are an ADULT!"); // TRUE path
    
    } else {
    
    	  System.out.println("You are a MINOR."); // FALSE path
    
    }  
  
  }

}