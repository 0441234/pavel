package day9;

public class Tv2 extends Product{
	Tv2(){
	super(100);
	}
	public String toString() {
		return "Tv2";
	}
}
class Computer extends Product {
	Computer(){
		super(200);
	}
	public String toString() {
		return "Compter";
	}
}
class Audio extends Product {
	Audio(){
		super(300);
	}public String toString() {
		return "Audio";
	}
}