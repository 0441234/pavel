package day9;

public class ex05 {
	public static void main(String[] args) {
		Child05 child = new Child05();
		child.takeOff();
		child.fly();
		child.flyMode=child.SUPERSONIC;
		child.fly();
		child.flyMode=child.NORMAL;
		child.fly();
		child.land();
	}

}
