package day12;

public class ex10 {
	static void method() throws NullPointerException{
	String data = null;
	System.out.println(data.toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method();
		}catch(Exception e) {
			System.out.println("예외발생");
		}
		

	}

}
