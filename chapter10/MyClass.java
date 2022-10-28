package day10;

public class MyClass {
	RemotControl rc = new Television();
	
	MyClass(){};
	MyClass(RemotControl rc){
		this.rc =rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	void methodA() {
		RemotControl rc = new audio();
		rc.turnOn();
		rc.setVolume(7);
	}
	void methodB() {
		rc.turnOn();
		rc.setVolume(3);
	}


	}
