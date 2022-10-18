package day05;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.SetGas(5);
		boolean gasState = car.isLeftGas();
		if (gasState) {
			System.out.println("출밣바니다.");
			car.run();
		}
		if (car.isLeftGas()) {
			System.out.println("가스를 주입할 필요가 없습니다.");
		} else
			System.out.println("gas를 주입하세요");

	}

}
