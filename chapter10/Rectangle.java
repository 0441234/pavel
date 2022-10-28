package day10;

abstract class Shape {
	public abstract void draw();

}
public class Rectangle extends Shape{
	public void draw() {
		System.out.println("사각형 그리기 메소드");
	}
}