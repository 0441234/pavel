package day7;

import java.util.Scanner;

public class quiz_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Book[] book = new Book[2];
		for(int i=0;i<book.length;i++) {
		System.out.println("제목>>>");
		String a =sc.next();
		System.out.println("저자>>>");
		String b =sc.next();
		
		book[i] = new Book(a,b);
	}
for(int i=0;i<book.length;i++) {
	System.out.println(book+",");
}
}}
