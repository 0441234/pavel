package day10;

public class GoodCalc extends Calculator{

	public static void main(String[] args) {
		Calculator c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int[] {1,2,3,4,5}));
		

	}
	
	public int add(int a, int b) {
		return a+b;
	};
	public int subtract(int a, int b) {
		return a-b;
	}
	public  double average(int[]a){
		double sum =0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];
	}
		return sum/a.length;
	}

	

}
