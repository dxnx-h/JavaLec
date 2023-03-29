package chap11_interface;

import chap11_interface.device.ElectronicDevice;
import chap11_interface.device.LgTv;
import chap11_interface.device.Tv;

public class _03_multiInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv = new LgTv(); 
		tv.powerOff();
		tv.reset();
		
		
		//스태틱은 원형 그대로 사용
		//스태틱 메소드를 사용하려면 static메소드가 선언된 클래스를 사용해서
		//호출한다.
		ElectronicDevice.warn(); 
 		//static 메소드는 상속받은 자식클래스에서 호출 불가능. 아래는 에러
		/* Tv.warn();
		   Display.warn(); */
	}

}
