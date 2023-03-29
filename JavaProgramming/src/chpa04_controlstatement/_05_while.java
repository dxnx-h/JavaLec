package chpa04_controlstatement;

public class _05_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num = 1;
		
		while(num <= 100) { //while 조건이 참일 경우 무한 루프. 웹서버처럼 멈추면 안되는 서비스에 이용   
			sum += num++;  //후위증감연산자 => 1이 더해지고, 2가 더해지고, 3이 더해지고~
			               //while 조건: 100이 될 떄까지. 101이 된 순간 끝남.  
		}
		
		System.out.println("1~100까지의 합: " + sum);
		System.out.println(num);
	}

	
}
