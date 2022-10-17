package day04;

public class quiz_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.
		System.out.println("1.");
		int[][] arr = {{5,5,5,5,5},{10,10,10},{20,20,20,20},{30,30}};
		System.out.println(arr[3].length);
		
		//2.
		System.out.println("2.");
		int[] array = new int[] {10,15,47,23,51};
		int sum = 0;
		for(int i =0;i<array.length;i++) {
			sum += array[i];
		}
		
		System.out.println("배열의 합계는 : " + sum);
		
		//3.
		System.out.println("3.");
		int[][] arr3 = {{5,5,5,5,5},{10,10,10,10,10},{20,20,20,20,20},{30,30,30,30,30}};
		int sum3 = 0;
		int count3 = 0;
		for(int i1=0; i1<arr3.length;i1++) {
			for(int j1=0; j1<arr3[i1].length;j1++) {
				sum3 += arr3[i1][j1];
				count3 ++;
			}
		}
		System.out.println("총합 : " + sum3);
		System.out.println("평균 : " +(sum3/count3));
		
		//4.
		System.out.println(4.);

		
		
	}
	
	
	

}
