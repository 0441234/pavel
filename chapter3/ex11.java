package day03;

public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 5까지 출력하는 구문
		for(int cnt=1;cnt<=5;cnt++) {
			System.out.println("cnt :" +cnt);
		}
System.out.println("");
System.out.println("break use");
for(int cnt=1;cnt<=5;cnt++) {
	if(cnt == 4) break;
	System.out.println("cnt : " + cnt);
}

System.out.println("");
System.out.println("continue use");
for(int cnt=1; cnt<=5; cnt++) {
	if(cnt == 4) continue;
	System.out.println("cnt : " + cnt);
}
	}

}
