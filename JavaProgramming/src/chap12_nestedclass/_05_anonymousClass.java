package chap12_nestedclass;

import chap12_nestedclass.clazz.Calc;

public class _05_anonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 익명 중첩 클래스 선언과 Calc의 구현
		// 익명 중첩 클래스는 추상클래스나 인터페이스를 구현한 클래스 없이 사용 가능
		Calc cal = new Calc() {
			@Override
			public void calculator(int a, int b) {
				System.out.println("결과는 " + (a + b));
			}
		};
		cal.calculator(10, 20);
	}

}
