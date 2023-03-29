package chap00_homework._20230321.Basic;

public class HybridCar3 implements ElectronicCar2, FuelCar2 {

	@Override
	public void speedUp() {
		System.out.println("속도가 올라갑니다.");
	}

	@Override
	public void speedDown() {
		System.out.println("속도가 내려갑니다. ");

	}

	@Override
	public void addFuel() {
		System.out.println("연료를 추가합니다.");
		
	}


	@Override
	public void getfuel(int fuel) {
		System.out.println("연료를 " + fuel +"ml 추가합니다.");
		
	}
	
	@Override
	public void charge() {
		System.out.println("충전중입니다.");

	}



}
