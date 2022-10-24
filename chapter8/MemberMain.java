package day8;

import java.util.Scanner;
public class MemberMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean j=true;
		while(j) {
			System.out.println("----메뉴----");
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.종료");
			int i = sc.nextInt();
			switch(i) {
			case 1:
				System.out.println("----회원가입----");
				
				break;
				
			
				
			case 2:
				System.out.println("----로그인----");
				break;
			case 3:
				System.out.println("----종료----");
				j=false;
				break;
			}
			
		}
	

	}

}
