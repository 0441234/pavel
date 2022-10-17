package day04;

public class ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[][] = {{12,12} ,{12,12}, {12,12}, {12,12}};
		int sum = 0;
		int count = 0;
		for(int i=0; i<score.length;i++) {
			for(int j=0; j<score[i].length;j++) {
				sum += score[i][j];
				count ++;
			}
	  
		}
		 System.out.println("총합 : " + sum);
		 System.out.println("평균 : " + (sum/count));

	}

}
