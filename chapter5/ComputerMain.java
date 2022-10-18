package day05;

public class ComputerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer com = new Computer();
		int[] values = {1,2,3};
		int result = com.sum1(values);
		System.out.println("result :" + result);
		
		int result2 = com.sum1(new int[] {1,2,3,4,5});
		System.out.println("result2 :" + result2);
		
		int result3 = com.sum2(values);
		System.out.println("result3 :" + result3);
		
		int result4 = com.sum2(1,2,3,4,5);
		System.out.println("result4 :" + result4);

	}

}
