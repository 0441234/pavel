package day11;

import java.net.MalformedURLException;
import java.net.URL;

public class ParseURL {

	public static void main(String[] args) {
		URL opinion = null;
		URL homepage = null;
		try {
			homepage = new URL("https://naver.com/");
			opinion = new URL("https://naver.com/");
		} catch (MalformedURLException e) {
			System.out.println("잘못된 url입니다");
		}
		System.out.println("프로토콜:" + opinion.getProtocol());
		System.out.println("호스트 :" + opinion.getHost());
		System.out.println("포트 :" + opinion.getPort());
		System.out.println("path :" + opinion.getPath());
		System.out.println("filename :" + opinion.getFile());

	}

}
