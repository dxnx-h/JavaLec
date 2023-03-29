package chpa04_controlstatement;

import java.util.Scanner; //import java.util.*; *이 만능 문자 => 걍 * 써

public class _06_infiniteWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//스캐너 객체
		Scanner sc = new Scanner(System.in);  //ctil shift 영문자o를 해서 3행의 저 문장을 불러와야지 로직 구성이 가능함.
		//스캐너를 사용할 때
		//next 메소드를 혼용하여 사용하는 것은좋지 않다
		
		//nextInt, nextLine  <= 혼용은 좋지않아. 이렇게 되면 매번 받아주는 인수가 필요
		//그러니까, 하나의  next메소드만 사용하여 형변환을 해주는 것이 낫다.
		
		while(true) { //true이기 때문에, while 안의 조건문은 무한반복
			System.out.println("1은 종료. 나머지는 계속 반복");
			String inputStr = sc.nextLine();  //입력한 문자열은 next line
		
			if(inputStr.equals("1")) {
				System.out.println("종료되었습니다.");
				break;    // true의 경우 무한반복이 되기 때문에, 조건을 만족할 경우 break로 강종
			}
			
			System.out.println(inputStr);
		}
	} 

}
