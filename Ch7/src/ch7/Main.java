package ch7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HankookTire hTire = new HankookTire();
//		Car sc = new Car(hTire);
//		sc.run();
//		KumhoTire kTire = new KumhoTire();
//		sc.SetTire(kTire);
//		sc.run();
		
		Tire tire = new HankookTire();
		NewCar sc = new NewCar(tire);
		sc.run();
		tire = new KumhoTire();
		sc.SetTire(tire);
		sc.run();
	}

}
