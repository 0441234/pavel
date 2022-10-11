package chapter02;

import java.util.Scanner;

public class ex10_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age>=60) {
			System.out.println("요금은 무료입니다.");
		}else if(age>=20) {
			System.out.println("성인요금입니다");
		}else if(age>=13) {
			System.out.println("청소년요금입니다");
		}else if(age>=8) {
			System.out.println("어린이요금입니다");
		}else {
			System.out.println("유아무료");
		}
		System.out.println("프로그램을 종료합니다");
		sc.close();
	}
}

