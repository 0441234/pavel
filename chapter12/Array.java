package day12;

import java.util.ArrayList;
import java.util.List;

public class Array {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("길동");
		list.add("길동");
		list.add("길동");
		list.add("길동");
		list.add("길동");
		list.add("길동");
		System.out.println("list long" + list.size());
		System.out.println("-------------------------");
		String name = list.get(2);
		System.out.println("세번째 객체 이름 :" + name);
		System.out.println("-------------------------");
	}

}
