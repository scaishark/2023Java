package ch7;

public class Car {
	double speed = 1;
	double position = 0;
	HankookTire hTire;
	KumhoTire kTire;
	
	public Car(HankookTire hTire){	
		this.hTire = hTire;
	}
	
	public Car(KumhoTire kTire) {
		this.kTire = kTire;
	}
	
	public void run() {
		if(hTire != null)
			hTire.roll();
		if(kTire != null)
			kTire.roll();
	}
	
	public void SetTire(HankookTire hTire)
	{
		this.hTire = hTire;
	}
	
	public void SetTire(KumhoTire kTire)
	{
		this.kTire = kTire;
	}

	public void SetSpeed(double speed) {
		this.speed = speed;
	}
	
	public void Move() {
		position += speed;
	}
}
