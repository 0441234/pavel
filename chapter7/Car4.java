package day7;

public class Car4 {
	String company = "현대";
	String model;
	String color;
	int maxSpeed;
	
  Car4(){}
  
  Car4(String model){
	  this(model,"은색",3000);
  }
  
  Car4(String model, String color){
	  this(model,color,3000);
  }
  Car4(String model, String color, int maxSpeed){
	  this.model = model;
	  this.color = color;
	  this.maxSpeed = maxSpeed;
  }
  
 

	public static void main(String[] args) {
		Car4 Car1 = new Car4();
		System.out.println("Car1.company :" +Car1.company);
		System.out.println("Car1.model :" + Car1.model);
		System.out.println("Car1.maxSpeed :" + Car1.maxSpeed);
		System.out.println();
		
		Car4 Car2 = new Car4("싼타페");
		System.out.println("Car2.company :" +Car2.company);
		System.out.println("Car2.model :" + Car2.model);
		System.out.println("Car2.maxSpeed :" + Car2.maxSpeed);
		System.out.println();
		
		Car4 Car3 = new Car4("아반떼","white");
		System.out.println("Car3.company :" +Car3.company);
		System.out.println("Car3.model :" + Car3.model);
		System.out.println("Car3.maxSpeed :" + Car3.maxSpeed);
		System.out.println();
		
		Car4 Car4 = new Car4("제네시스","black",3000);
		System.out.println("Car4.company :" +Car4.company);
		System.out.println("Car4.model :" + Car4.model);
		System.out.println("Car4.maxSpeed :" + Car4.maxSpeed);
		System.out.println();
	

	}

}
