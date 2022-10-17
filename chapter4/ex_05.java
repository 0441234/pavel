package day04;

public class ex_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] oldArray = {1,2,3};
		int[] newArray = new int[5];
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		for(int i = 0; i<oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}
		System.out.println("새로운 배열 값 :");
		for(int i =0;i<newArray.length;i++) {
			System.out.print(newArray[i]+ " ");
		}

	}

}
