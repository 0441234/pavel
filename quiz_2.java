package chapter02;

import java.util.Scanner;

public class quiz_2 {

	public static void main(String[] args) {
		// 1. 세 개의 정수를 입력받아서 최대값, 최소값, 평균
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();



		// 2. 150 가능 150미만
		int a = 160;
		if (a >= 150) {
			System.out.println("놀이기구 탑승가능");
		} else {
			System.out.println("부모와 함께 있을때 탑승가능");
			System.out.println("부모와 함께 있지 않으면 탑승 불가");
		}

		// 3. 7의 배수인지 판단
		

		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		if (num % 7 == 0) {
			System.out.println("7의 배수입니다.");
		} else {
			System.out.println("7의 배수가 아닙니다.");
		}
		// 4 1학년 부터 4학년까지 중간고사 , 4학년은 70 이상합격, 그이외 학년은 60이상이면 합격 점수가 0미만 100초과면x
		int grade = sc.nextInt();
		int score = sc.nextInt(); // 변수 2개 학년 , 성적
		if (score < 0 || score > 100) {
			System.out.println("잘못된 입력입니다.");
		} else {
			if (grade == 4) {
				if (score >= 70) {
					System.out.println("합격입니다");
				} else {
					System.out.println("불합격입니다");
				}
			} else {
				if (score >= 60) {
					System.out.println("합격입니다.");
				} else {
					System.out.println("불합격입니다.");
				}
			}
		}
	}

}
