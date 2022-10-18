package day05;

import java.util.Scanner;

public class ex_03 {

	private static int maxNumber;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 두 개 입력해주세요");
		System.out.print(">");
		int ai = scan.nextInt();
		
		System.out.print(">");
		int bi = scan.nextInt();
		
		maxNumber( ai, bi);
	}
	static void maxNumber(int a, int b) {
		if(a>b) {
			 maxNumber = a;
		}
		else {
			maxNumber = b;
		}
		System.out.println(a+"와" + b +"중에 큰수는 ==>" + maxNumber);
	}

}
