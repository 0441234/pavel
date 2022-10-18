package day05;

public class ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {1,2,3};
		int sum = sum1(values);
		System.out.println("메인 합 :" + sum);
	}
	public static int sum1(int[] values) {
		int sum = 0;
		for(int i =0; i<values.length;i++) {
			sum += values[i];
		}
		System.out.println("매서드 합 :" + sum);
		return sum;
	}

	}


