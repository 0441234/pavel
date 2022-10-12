package day03;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = -1; //why -1 로 줘야하는지
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			if ((n = sc.nextInt()) > 0) {
				sum += n;
			} else	continue;
		}
		System.out.println(sum);
	}

}
