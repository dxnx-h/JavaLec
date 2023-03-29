package chap10_abstraction.product;

public class LgTv extends Tv {
	
		public void powerOn() {
			System.out.println("lgTv 켬");
		}
		
		public void powerOff() {
			System.out.println("lgTv 끔");
		}
		
		public void operate(int channel) {
			System.out.println("lgTv 채널" + channel + "로 이동");
			
			super.lastChannel = channel;
		}
	}	
