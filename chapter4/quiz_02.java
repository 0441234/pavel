package day04;

import java.util.Scanner;

public class quiz_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//.5
		int[] num= {78,54,89,57,84,95,74,91,84,67,52,94,82};
		int max =0;
		for(int i =0;i<num.length;i++) {
			if(max<num[i]) {
				max = num[i];
			}
		}
		System.out.println("최댓값은 : " + max);
		
		//.6
//		Scanner sc = new Scanner(System.in);
//	
		
		//.7
		int[] arr = new int[] {3,2,5};// 배열의 숫자를  *로 변환 =>
		
		for(int j =0;j<arr.length;j++) {
			System.out.print(arr[j]+":");
			for(int k=0;k<arr[j];k++) {
				System.out.print("*");
			}System.out.println("");
		}
		//8.
		int a[] = {10,20,30};
		int b[] = {40,50,60};
		int c[] = {a[0],b[0],a[1],b[1],a[2],b[2]};
		int l;
		System.out.print("c = {");
		for(l=0; l<c.length-1;l++) {
			System.out.print(c[l]+",");
		}
		System.out.print(c[l=5]);
		System.out.print("}");
		
		
		
	}

		

	}


