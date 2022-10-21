package day7;

public class Card {
	int x;
	boolean y;

	Card(int x, boolean y) {
		x = 1;
		y = false;
	}

	Card() {
	}

	public void info() {
		if (y == false) {
			System.out.println(x);
		} else {
			System.out.println(x + "k");
		}
	}
}
