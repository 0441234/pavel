package day05;

public class Gugudan {
	int dan;
	static void Gugudanf(int dan) {
		if (!(dan >= 2 && dan <= 9)) {
			System.out.println("구구단");
			return;
		}
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
	}
}
