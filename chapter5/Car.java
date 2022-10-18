package day05;

public class Car {
	int gas;

	void SetGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("가스가 없습니다");
			return false;
		} else
			System.out.println("가스가 있습니다.");
		return true;
	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("남은 가스 : " + gas);
				gas -= 1;
			} else {
				System.out.println("멈춥니다. 남은가스 : " + gas);
				return;
			}
		}
	}

}
