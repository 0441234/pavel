package day7;

public class quiz_2 {

	public static void main(String[] args) {

		Student student1= new Student("고길동",3,17,92,63,74);
		student1.name ="고길동";
		student1.ban = 3;
		student1.no = 17;
		student1.kor = 92;
		student1.eng =63;
		student1.math=74;
		
		System.out.println("이름 : " +student1.name);
		System.out.println("이름 : " +student1.getTotal());
		System.out.println("이름 : " +student1.getAverage());
        
		student1.info();
	}

}
