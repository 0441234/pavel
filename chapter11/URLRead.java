package day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("https://www.naver.com");
			
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
		    String inputLine;
		    while((inputLine = in.readLine()) !=null)
		    	System.out.println(inputLine);
		    in.close();
		}catch(IOException e) {
			System.out.println("오류발생");
		}

	}

}
