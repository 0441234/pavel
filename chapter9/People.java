package day9;

public class People {
	public void printInfo() {
		System.out.println("나는 사람입니다");
	}

	class Man extends People {
		@Override
		public void printInfo() {
			super.printInfo();
			System.out.println("그리고 남자입니다");
		}

		public void enlist() {
			System.out.println("11123");
			System.out.println("1234");
		}
	}

	class Woman extends People {
		public void printInfo() {
			super.printInfo();
			System.out.println("그리고 여자입니다");
		}

		public void working() {
			System.out.println("88888");
			System.out.println("88788");
		}
	}
	public static void func(People people) {
		people.printInfo();
	}
	public static void main(String[] args) {
		People man = new Man();
		People woman = new Woman();
		func(man);
		
	}
}
