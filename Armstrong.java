package week1.day2;

public class Armstrong {

	      
	    public  static void main(String[] args) {
		
	    int input = 153 ;	
	     int  output = 0 ;
         int orgNumber = input ;
	     
        while (input > 0) {
        	int rem = input% 10 ;
        	output = output + (rem * rem* rem) ;
        	input = input/10 ;
        }
        
        System.out.println(output);
        
        if (orgNumber == output) {
        	System.out.println("Armstrong number");
        }
        else {
        	System.out.println("Not an Armstrong number");
        }
	    
        
	    }
	    
  
	    }
	    
