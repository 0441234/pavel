package chapter02;

public class ex12 {

	public static void main(String[] args) {
		//02. switch
		String lang = "Java";
		switch(lang) {
		case "python" :
			System.out.println("파이썬입니다");
		case "Java" :
			System.out.println("자바입니다");
		case "C#" :
			System.out.println("씨샵입니다");
		case "C++" :
			System.out.println("씨쁠쁠입니다");
		default :
			System.out.println("기타언어입니다");
		}

	}

}
