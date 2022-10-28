package day10;

public class Car extends Tire{
	Car(String location, int max) {
		super(location, max);
	}
	Tire frontLeftTire = new Tire("앞왼쪽",6);
	Tire frontRightTire = new Tire("앞오른쪽",2);
	Tire backLeftTire = new Tire("뒤왼쪽",3);
	Tire backRightTire = new Tire("뒤왼쪽",3);
}
