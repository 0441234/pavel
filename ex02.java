package chapter02;

import java.util.Scanner; // Ctrl+ Shift + o

public class ex02 {

	public static void main(String[] args) throws Exception {
		Scanner sc= new Scanner(System.in);
		String inputData;
		
		    inputData = sc.nextLine();
		    System.out.println("\"입력된 문자열:" + inputData + "\"");
		sc.close();
	}

}
