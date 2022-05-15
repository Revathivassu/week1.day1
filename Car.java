package week1.day1;

public class Car {
	
	
	public void applyBrake () {
		System.out.println( "Apply Brake");
	}
	
	public void applyGear ()  {
		System.out.println( "Apply Gear");
	}
	
	public void switchOnAc () {
		System.out.println("Switch on AC");
	}
 
	public static void main(String[] args) {
	     
		Car Car1 = new Car () ;
		Car1.applyBrake();
		Car1.applyGear();
		Car1.switchOnAc();

	}

}
