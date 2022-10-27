package day9;

public class Child01 extends Parent01 {

	int channel;

	Child01(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

	void turnOn() {
		System.out.println("채널 :" + channel);
	}

	void changeChannel(int channel) {
		System.out.println();
	}

	void turnOff() {
		System.out.println("방송중단");
	}
}
