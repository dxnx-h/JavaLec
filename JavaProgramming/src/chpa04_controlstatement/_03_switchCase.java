package chpa04_controlstatement;

public class _03_switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade = "C";  // 선언한 grade가 나올 때까지 case 따라 쭉쭉 내려갈거다
		
		switch(grade) {  //조건이 맞는 구문까지 계속 넘어가자. 매 case마다 들어가는 break를 뺴면 아래~default 까지 다 실행됨(조건이 맞는 구문~ 끝까지)
			case"A":
				System.out.println("점수는 90점" + "이상입니다");
				
				break; //일치하는 조건을 만나면 swith문 종료한다는 뜻. 메 case 뒤에 적용해야 하고, defalt에도 동일하게 적용해야 함
			case"B":
				System.out.println("점수는 90점" + "미만 80점 이상입니다");
				
				break;
			case"C":
				System.out.println("점수는 80점" + "미만 70점 이상입니다");
				
				break;
				
			default:
				System.out.println("점수는 70점" + "미만입니다");
				
				break;
				
				
				
		
		}

	}

}
