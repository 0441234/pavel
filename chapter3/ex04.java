package day03;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int sum=0;
		int avg=0;
		int count =0;
		for(i=1; i<=100; i++) {
			if(i%7==0) {
				count++;
				sum +=i;
				}
			}
		avg = sum/count;
		System.out.println("7의 갯수 :" + count);
		System.out.println("7의 배수의 합 :" +sum);
		System.out.println("평균 :" + avg);
		}

	}


