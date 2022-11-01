package day12;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,3};
		try {
			System.out.println(num[5]/0);
		}catch(Exception e) {
			System.out.println("예외 발생");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스의 범위 초월");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}

	}

}
