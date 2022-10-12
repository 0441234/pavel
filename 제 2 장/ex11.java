package chapter02;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		if (number > 0) {
			System.out.println("양수입니다.");
		} else if (number < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0 입니다.");
		}
		sc.close();

	}

}
