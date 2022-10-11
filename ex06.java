package chapter02;

public class ex06 {

	public static void main(String[] args) {
		int a =10;
		a = a + 10;
		System.out.println("a :" + a);
		
		int b = 10;
		b +=10;
		System.out.println("b :" + b);
		
		int a1 = 10;
		System.out.println("a+=5 :" +(a1+=5));
		System.out.println("a-=5 :" +(a1-=5));
		System.out.println("a*=5 :" +(a1*=5));
		System.out.println("a/=5 :" +(a1/=5));
		System.out.println("a%=3 :" +(a1%=3));

	}

}
