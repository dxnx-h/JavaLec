package chap09_polymorphism;

import chap09_polymorphism.product.LgTv;
import chap09_polymorphism.product.SamsungTv;
import chap09_polymorphism.product.Tv;

public class _03_withPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 다형성을 이용해 tv 바꾸기
		//부품만 교체하면 된다.
		Tv tv = new LgTv();
		
		tv.powerOn();
		tv.operate(11);
		tv.powerOff();
		tv.powerOn();
		
		Object o = new LgTv();
		o = new SamsungTv();
		o = new Tv();
		
		//Map<key, value>
		//키는 보통 string으로 value에는 보통 리시트로 들어가서 엄청난 확장성을 가짐
		
		//{company: ["현대"}
		System.out.println(tv.toString());

	}

}
