package day03;

import java.util.Scanner;

public class ex06_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i=0;
		int count = 0;
		int sum = 0;
		
		while(i!=0) {
			i=sc.nextInt();
			count ++;
			sum +=i;
		}
		System.out.println(count);
		System.out.println(sum/count);

	}

}
