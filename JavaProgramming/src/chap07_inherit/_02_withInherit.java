package chap07_inherit;

import chap06_class.Car.Car;
import chap07_inherit.car.HyundaiCar;
import chap07_inherit.car.KiaCar;
import chap07_inherit.car.KiaCarinherit;

public class _02_withInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 객체생성
		Car car = new Car();
		KiaCar kCar = new KiaCar();
		HyundaiCar hCar = new HyundaiCar();
		
		car.company = "GM";
		kCar.company = "Kia";
		hCar.company = "Hyundai";
		
		//자식클래스는 부모의 형태도 가지고 있기 때문에
		//부모클래스로 만들어진 변수에 대입가능하다.
		Car car1 = new KiaCarinherit();
		car1.company = "Kia";
		//다형성의 기초
		//같은 모양의 객체로 전혀 다른 결과값을 발현하는 성질
		car1.carInfo();
		car1.speedUp();
		car1.speedDown();
		
		car1 = new HyundaiCarinherit();
		car1.company = "Hyundai";
		car1.carInfo();
		car1.speedUp();
		car1.speedDown();
	}

}

