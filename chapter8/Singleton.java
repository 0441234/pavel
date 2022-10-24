package day8;

public class Singleton {
	private Singleton() {}
	private int number;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}



public static void main(String[] args) {
	Singleton s = Singleton.getInstance();
	
	s.setNumber(100);
	System.out.println(s.getNumber());
}}
