package day03;

public class ex01 {

	public static void main(String[] args) {
		// 1부터 10까지 출력해보자
		for (int i = 1; i < 11; i++) {
			System.out.println("i:" + i);
		}
		// 1부터 10까지 덧셈으로 표시
		int sum = 0;
		for (int i = 0; i < 11; i++) {
			sum += i;
		}
		System.out.println("for 합계 :" + sum);

	}

}
