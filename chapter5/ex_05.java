package day05;

import java.util.Scanner;

public class ex_05 {
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
	public static int maxNumber(int a, int b) {
		int max;
		if (a>b) {
			max = a;
		} else {
			max = b;
		}return max;
	}
}
