package day06;

public class CarMain2 {
	public static void main(String[] args) {
		Car car1 = new Car();
	    Car car2 = new Car();
	    
	    System.out.println("차량의 색상 " + car1.color);
	    System.out.println("차량의 색상 " + car2.color);
	    
	    System.out.println("---------------도색후");
	    
	    car1.color = "black";
	    car2.color = "pink";
	    System.out.println("차량의 색상 : " + car1.color);
	    System.out.println("차량의 색상 : " + car2.color);
	}

}
