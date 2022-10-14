package day03;

import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 1. 1부터 100까지의 합을 구하시오.
		int i;
		int sum = 0;
		for (i = 1; i <= 100; i++) {
			sum += i;

		}
		System.out.println("합계 : " + sum);

//2. 1부터 100까지의 합을 구하되 합계가 1000이 넘어서면 연산을 중단하고 합계출력
//break; 사용하면 될듯?
		int j;
		int sum1 = 0;
		for (j = 1; j <= 100; j++) {
			sum1 += j;
			if (sum1 >= 1000) {
				break;
			}
		}
		System.out.println("합계 : " + sum1);

//3. 로그인 기능을 구현하시오.
		String id = "id";
		String pwd = "pwd";
		Scanner sc = new Scanner(System.in);
		if (sc.equals(id)) {
			System.out.println("로그인 성공");

		} else {
			System.out.println("아이디를 확인해주세요");
		}

//4.구구단 짝수단을 출력
		for (int k = 2; k < 10; k += 2) {
			System.out.println(k + "단");
			for (int l = 1; l < 10; l++) {
				System.out.println(k + "X" + l + "=" + k * l);
			}
		}
//5. 가위바위보;
		System.out.println("0.가위 1.바위 2.보 ");
		double A = (int) (Math.random() * 3);
		if (sc.nextInt() < 3) {
			if (sc.nextInt() == A) {
				System.out.println("비겼습니다");
			} else if (sc.nextInt() < A) {
				System.out.println("졌습니다");
			} else {
				System.out.println("이겼습니다");
			}
		} else {
			System.out.println("잘못된 입력입니다");
		}

//6.은행 예금

		System.out.println("원하시는 항목을 선택해주세요 ");
		System.out.println("1.예금 2.출금 3.잔액조회");
	    int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("예금입니다. 입금액을 넣어주세요");
			sc.hasNextInt();
			System.out.println("예금완료");
			break;
		case 2:
		case 3:
		return ;

		}
//7. 
	}
}