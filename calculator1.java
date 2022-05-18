package week1.day2;

public class calculator1 {
	  
    public  int add (int num1,int num2 ,int num3) {
  	  int add = num1+num2+num3;
  	 return add ;
    }
    public int sub (int num1 , int num2 ) {
  	  int sub = num1-num2 ;
  	  return sub ;
    }
    public double multi (double num1, double num2) {
  	  double multi = num1*num2 ;
  	  return multi ;
  	  
    }
    public float divi (float num1 , float num2 ) {
  	  float divi = num1/num2 ;
  	  return divi ;
    }   
	public static void main(String[] args) {
	
	       
			calculator1 cals = new calculator1() ;
	        System.out.println(cals.add(9, 8, 15));
	        System.out.println(cals.sub(153,96));
	        System.out.println(cals.multi(1864.566,5534.588));
	        System.out.println(cals .divi(840f,62f));
		}
	}


