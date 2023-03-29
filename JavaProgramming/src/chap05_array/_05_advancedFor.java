package chap05_array;

public class _05_advancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {100, 84, 93, 65, 71};
		
		int sum = 0;
		double avg;          //평균을 낼 변수를 선언. 왜 더블?
		
		
		for(int s : score) {  // 인덱스를 s라고 명명할거임
			System.out.println(s);
			sum += s;  ///하나씩 더해서 불러야징
		}
		
		System.out.println("점수의 총합: " + sum);;
		
		avg = (double)sum / score.length;
		System.out.println("평균 점수: " + avg);
	}

}
