package chapter02;

import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		//1, 2번
		int a =3;
		int b =6;
		
		System.out.println("사각형의 넓이 :" +(a*b));
		System.out.println("삼각형의 넓이 :" +(a*b)/2);
		
		//3번
		int c = 40;
	    int d = 30;
		int e = 10;
		
		System.out.println("성적의 평균 :" +(c+d+e)/3);
		
		//4번
		int a1 = 100;
		
		System.out.println(a1*12*0.8);
		//5번
		int t = 286;
	    
		System.out.println(t/60 + "분 " + t%60 + "초");
		//6번
		int x = 10;
		int y = 5;
		boolean result;
		
		result = (x>7) && (y<=5);
		System.out.println("result = " +result);
		result = (x%3==0)|| (y%2 !=1);
		System.out.println("result = " +result);
		
		//7번
		int x1 = 534;
		int y1 = 30;
		System.out.println("학생당 " + x1/y1 +"개를 가질수 있고 " + x1%y1 + "개가 남는다.");
	    
		//8번
		int value = 356;
		System.out.println(value - 56);
		
		//9번 xxxxxx
		int m = 176840;
		int m1 = m/50000;
		int m2 = (m-(50000*m1))/10000;
		int m3 = (m-(50000*m1)-(m2*10000))/1000;
		System.out.println(m + "원을 화폐 매수대로 나누면 5만원권 : " + m1 +"매 만원권 : " + m2 + "매  천원권 : " + m3 +"매가 나온다." );
		
		//10번
		Scanner sc =new Scanner(System.in);
		int subject;
		subject=sc.nextInt();
		if(subject>=90) {
			System.out.println("A 학점입니다");
		}
		else if(subject>=80) {
			System.out.println("B학점입니다");
		}
		else if(subject>=70) {
			System.out.println("C학점입니다");
		}
		else if(subject>=60) {
			System.out.println("D학점입니다");
		}
		else{
			System.out.println("F학점입니다");
		}
		sc.close();
		
		
		
	    
		

	}

}
