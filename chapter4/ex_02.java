package day04;

import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("양수 5개를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int[] num = new int[5];
		for(int i =0;i<5;i++) {
			num[i]=sc.nextInt();
			if(max<num[i]) {
				max=num[i];
			}
		}
		System.out.println("최댓값은 : " + max);
		sc.close();

	}

}
