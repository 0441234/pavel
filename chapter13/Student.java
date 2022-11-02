package test;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public Student() {}

	//2.
	public int getTotal() {
	   	int sum =  this.kor+this.eng+this.math;
		return sum;
	}
	//3.
	public float getAverage() {
		float avg = Math.round(getTotal()/3.0f*10)/10.0f;
		return avg;

}
	public void info() {
		System.out.println("이름 : "+name);
		System.out.println("반 : "+ban);
		System.out.println("번호 : "+no);
		System.out.println("국어점수 : "+kor);
		System.out.println("영어점수 : "+eng);
		System.out.println("수학점수 : "+math);
		System.out.println("총점 : "+getTotal());
		System.out.println("평균 : "+getAverage());
	}
	//4.
	public static void main(String[] args) {
		Student st1 = new Student("홍길동",4,22,77,77,77);
		st1.info();}
}
