package chap10_abstraction.product;

public class SamsungTv extends Tv{
	public void powerOn() {
		System.out.println("samsungTv 전원켜기");
		/*super.powerOn(); /TV클래스에 동작할 기능이 없음. **/ 
	}
	
	public void powerOff() {
		System.out.println("samsungTv 전원켜기"); //이 자식클래스에서 오버라이딩을 통해 구현
	}
	
	public void operate(int channel) {
		System.out.println("samsungTv 채널" + channel + "로 이동");
	
		super.lastChannel = channel;
	}
}
