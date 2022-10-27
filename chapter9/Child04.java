package day9;

public class Child04 extends Parent04 {
	int age = 25;
	@Override
	public void info() {
		super.info();
		System.out.println(this.age);
	}

}
