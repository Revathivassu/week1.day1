package week1.day1;

public class FibonacciSeries {

	  
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// input(range): 8 output: 0, 1, 1, 2, 3, 5, 8,13
		 
		int	no1=0 ;
		int no2 =1;
		int no3;
		int range = 8;
		no3=no1+no2 ;
		
     
         for (int i= 1; i <= 8; i++)
         {
        	 no3=no1+no2;
        	 System.out.println(no3); 
        	 no1=no2;
        	 no2=no3;
        
        	
         }
		
	     }
	
	

}
