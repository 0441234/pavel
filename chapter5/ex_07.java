package day05;

public class ex_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		info("고길동");
		info("고길동", 25);
		info("asdf",1234);
		info(123,"코드 컴플리트");
	}
	private static void info(String name) {
		System.out.println("이름 : " + name);
	}
	private static void info(String name, int age) {
		System.out.println("이름 : " + name);	
		System.out.println("나이 : " + age);	
	}
	private static void info(String id,String pw ) {
		System.out.println("아이디 :" + id);
		System.out.println("pw :" + pw);
	}
	private static void info(int number, String title) {
		System.out.println("number :" + number);
		System.out.println(" title :" + title);
	}

}
