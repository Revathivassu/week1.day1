package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// input = 5
		 // output: 5*4*3*2*1 = 120
		  int input1=5;
		  int factorial =1 ;

		  
		  
		  for (int i=1 ; i<input1 ; i++)
		  
		  {
			  factorial = factorial*(i+1) ;
	
			  
			  //System.out.println(i);
			  System.out.println(factorial);
		  }
		  System.out.println("Factorial of ");
		  System.out.println(input1);
		  System.out.println("is ");
		  System.out.println(factorial);
	}

}
