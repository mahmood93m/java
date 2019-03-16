package new1;

import java.util.Scanner;



public class game12 {
private static Scanner myObj;

public static void main(String[] args) {
	
	
	 myObj = new Scanner(System.in); 
	    System.out.println("Enter just number\nRock = 0 , Paper = 1 , Scissors = 2 \n");

	    String userName = myObj.nextLine();  
	   
	    String s = userName, R = "0" , P = "1" , C = "2";
	    
	    if (s.equals(R))
	    {
	    	 System.out.println("Your Chose is : " + "Rock " + userName);  
	    	
	    }
	    
	    else 
	    {
	    	
	    }
	   
	    if (s.equals(P))
	    {
	    	 System.out.println("Your Chose is : " + "Paper " + userName);  
	    	
	    }
	    
	    else 
	    {
	    	
	    	
	    	
	    }
	   
	    
	    if (s.equals(C))
	    {
	    	 System.out.println("Your Chose is : " + "Scissor " + userName);  
	    	
	    }
	    
	    else 
	    {
	    	
	    	
	    	
	    }
	   
	   
	int number;
	number = (int)(Math.random()*3);
	
	
	
	  if (number == 0)
	    {
			 System.out.println("Gussing Number : " + "Rock " + number);
		  
	    	
	    }
	    
	    else 
	    {
	    	
	    }
	   
	    if (number == 1)
	    {
	    	 System.out.println("Gussing Number : " + "Paper " + number);
	    	
	    }
	    
	    else 
	    {
	    	
	    	
	    	
	    }
	   
	    
	    if (number == 2)
	    {
	    	 System.out.println("Gussing Number : " + "Scissor " + number); 
	    	
	    }
	    
	    else 
	    {
	    	
	    	
	    	
	    }
	
	
	
	
if (number == 0 && s.equals(R))
    {
    	 System.out.println("Result :" + "Nobody won");  
    	
    }
    
    else 
    {
    	
    }
	
	 if (number == 0 && s.equals(P))
	    {
	    	 System.out.println("Result :" +"You won");  
	    	
	    }
	    
	    else 
	    {
	    	
	    }
	
	 if (number == 0 && s.equals(C))
	    {
	    	 System.out.println("Result :" +"You lost");  
	    	
	    }
	    
	    else 
	    {
	    	
	    }
	 
	 
	 if (number == 1 && s.equals(P))
	    {
	    	 System.out.println("Result :" +"Nobody won");  
	    	
	    }
	    
	    else 
	    {
	    	
	    }
	 
	 
	 if (number == 1 && s.equals(R))
	    {
	    	 System.out.println("Result :" +"You Won");  
	    	
	    }
	    
	    else 
	    {
	    	
	    }
	
	 if (number == 1 && s.equals(C))
	    {
	    	 System.out.println("Result :" +"You lost");  
	    	
	    }
	    
	    else 
	    {
	    	
	    }
	 
	 
	 if (number == 2 && s.equals(R))
	    {
	    	 System.out.println("Result :" +"You Won");  
	    	
	    }
	    
	    else 
	    {
	    	
	    }
	 
	 if (number == 2 && s.equals(P))
	    {
	    	 System.out.println("Result :" +"You Lost");  
	    	
	    }
	    
	    else 
	    {
	    	
	    }
	 
	 if (number == 2 && s.equals(C))
	    {
	    	 System.out.println("Result :" +"Nobody won");  
	    	
	    }
	    
	    else 
	    {
	    	
	    }
	 
	 
		
		
		
	 
	 
	 
	 
}

}

