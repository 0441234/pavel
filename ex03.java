package chapter02;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String age = sc.next();
		String date = sc.next();

		System.out.println("이름, 핸드폰번호, 나이 , 오늘의 날짜를 빈칸으로 분리하여 입력해주세요.");
		System.out.println("당신의 이름은" + name + "입니다");
		System.out.println("당신의 나이는" + age + "살입니다");
		System.out.println("오늘의 날짜는" + date + "입니다");
		sc.close();

	}

}
