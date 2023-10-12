package Culman;

public class Car {
	static int numOfCars = 0;
	static double maxSpeed = 100;
	static double minSpeed = 0;
	
	private double speed;
	
	public Car(){
		numOfCars++;
	}
	
	public void SetSpeed(double speed) {
		if(speed > maxSpeed) speed = maxSpeed;
		if(speed < minSpeed) speed = minSpeed;
		this.speed = speed;
	}
	
}
