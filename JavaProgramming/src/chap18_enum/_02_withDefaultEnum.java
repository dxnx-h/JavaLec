package chap18_enum;

import chap18_enum.enums.DefaultMonth;

public class _02_withDefaultEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DefaltMonth형의 변수 선언
		DefaultMonth jan = DefaultMonth.JAN;
		//^ DefaltMonth.JAN을 값으로 받는 enum(열거형)객체 생성 완료!
		
		
		//DefaltMonth의 열거형 객체의 이름(상수의 이름)
		System.out.println(jan);
		
		//ordinal() => 해당 상수의 인덱스
		System.out.println(jan.ordinal()); //0 출력
		//^enum은 0부터 인덱스가 매겨지고, 1월은 첫번째이므로 0 출력
		
		//DefaltMonth의 열거의 객체의 이름(상수의 이름)
		//출력 후에는 바로 삭제됨. 왜냐면 맨 위처럼 여기에 객체를 따로 생성을 안했으니까
		System.out.println(DefaultMonth.AUG);
		
		
		
		
	}

}
