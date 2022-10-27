package day9;

public class Child03 extends Parent03{
	private String id = "Child";
	
	public void m() {
		System.out.println(super.lastName);
		System.out.println(super.firstName);//private 은 안됨
		System.out.println(super.getFirstName());

	}

}
