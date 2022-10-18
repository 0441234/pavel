package day05;

public class quiz_08 {

	public static void main(String[] args) {
		gugudan();
		// TODO Auto-generated method stub

	}
	static void gugudan() {
		for(int i=2 ; i<9;i++) {
			for(int j= 1; j<=9 ; j++) {
				System.out.printf("%d + %d = %d",i, j, (i*j));
			}
		}
	}

}
