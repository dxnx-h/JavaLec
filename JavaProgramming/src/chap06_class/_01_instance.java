package chap06_class;

import chap06_class.calc.Add;
import chap06_class.calc.Calc;
import chap06_class.calc.Divide;
import chap06_class.calc.Minus;
import chap06_class.calc.Multiple;

public class _01_instance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체화(인스턴화)
		Add add = new Add(); //ctrl shift o  
		//^^ 설계도로 부품을 만드는 작업 == 인스턴스화, 객체화
		//인스턴스화: 생성자를 통해서 객체를 생성하고 heap 메모리 영역 저장. 항상 new 키워드와 함께 사용
		
		/*
		add.num1 = 10;  ---> privite이라 당겨지지 않음
		add.num2 - 20;
		add.result = add.num1 + add.num2;
		*/
		
		add.setNum1(10);  //Add 클래스에서 getter 처리를 해두면, privite라고 해도 끌어올 수 있음 
		add.setNum2(20);
		// 끌어오는 예시) add.setResult(add.getNum1() + add.getNum2());
		System.out.println(add.add());
		
		
		Minus min = new Minus();
		Multiple multi = new Multiple();
		Divide divi = new Divide();
		
		min.setNum1(10);
		min.setNum2(20);
		System.out.println(min.Minus());
		
		multi.setNum1(10);		
		multi.setNum2(20);
		System.out.println(multi.Multiple());
		
		divi.setNum1(10);		
		divi.setNum2(20);
		System.out.println(divi.Divide());
		
		System.out.println("----extends 상속-------");
		Calc cal2 = new Add(); 
		System.out.println(cal2.add(4, 3));
		
		Calc cal3 = new Minus(); 
		System.out.println(cal3.minus(4, 3));
		
	}

}
