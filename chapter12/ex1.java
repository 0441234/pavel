package day12;

import java.util.TreeSet;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set = new TreeSet<>();
		
		set.add("고길동");
		set.add("김길동");
		set.add("박길동");
		set.add("홍길동");
		set.add("신길동");
		set.add("최길동");

		System.out.println("첫번째 이름 " + set.first());
		System.out.println("마지막 이름 " + set.last());
		System.out.println("신길동 아래 이름 " + set.lower("신길동"));
	}

}
