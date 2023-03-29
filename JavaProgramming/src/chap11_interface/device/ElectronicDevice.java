package chap11_interface.device;

public interface ElectronicDevice  {
	void powerOn();
	void powerOff();

	default void reset() { //디폴트 메소드로 구현부까지 넣을 수 있늠
		System.out.println("장치를 리셋합니다.");
	}
	
	public static void warn() {
		System.out.println("알람을 울리다.");
	}
}
