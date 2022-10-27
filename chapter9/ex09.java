package day9;

public class ex09 {
	public static void main(String[]args) {
		Parent06 parentA = new Child06();
		method1(parentA);
		
		Parent06 parentB = new Parent06();
		method1(parentB);
		
	}
	public static void method1(Parent06 parent) {
		if(parent instanceof Child06) {
			Child06 Child = (Child06) parent;
			System.out.println("변환성공");
			
		}else {
			System.out.println("변환실패");
		}
	}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	