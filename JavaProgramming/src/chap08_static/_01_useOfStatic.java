package chap08_static;

import chap08_static.clazz.Car;

public class _01_useOfStatic {

	public static void main(String[] args) {
		//(car 클래스에 이어서)3.클래스 변수와 메소드의 사용
		//             객체 생성 없이 바로 사용가능
		
		Car.grade = "A"; //클래스 변수
		Car.printCurrentGrade(); //클래스 메소드 - static영역에 저장. 프로그램 시작부터 끝까지 사용가능
		
		//인스턴스 변수와 인스턴스 메소드는 객체가 생성됐을때만 사용 가능
		Car c = new Car(); //<<<<<<<< 이거(객체생성) 없으면 사용 불가.
		c.company = "현대"; 
		c.model = "제네시스";
		c.carInfo(); 
		

	}

}
