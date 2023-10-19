package ch7;

public class NewCar {
	double speed = 1;
	double position = 0;
	Tire tire;
	
	public NewCar(Tire tire){	
		this.tire = tire;
	}
	
	
	public void run() {
		tire.roll();
	}
	
	public void SetTire(Tire tire)
	{
		this.tire = tire;
	}
}
