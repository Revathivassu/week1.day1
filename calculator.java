package week1.day2;

public class calculator {
         
	      public  int add (int a ,int b) {
	    	  int add = a+b ;
	    	 return add ;
	      }
	      public double sub (double a , double b) {
	    	  double sub = a-b ;
	    	  return sub ;
	      }
	      public double multi (double a, double b) {
	    	  double multi = a*b ;
	    	  return multi ;
	    	  
	      }
	      public int divi (int a , int b) {
	    	  int divi = a/b ;
	    	  return divi ;
	      }      
	      
	public static void main(String[] args) {
	        
		calculator cal = new calculator() ;
        System.out.println(cal.add(9, 8));
        System.out.println(cal.sub(15.2,6.4));
        System.out.println(cal.multi(18.5,5.5));
        System.out.println(cal.divi(84,6));
	}
	

	}


