package chap11_interface.multiinherit;

//MultiflexStadium이 스타디움과 콘서트홀의 형태를 가지고 있기 때문에
//서울멀티플랙스스타디움도 스타디움과 콘서트홀의 형태를 가지게 된다. 
//stadium 타입의 변수다 concerthal 타입의 변수도 사용 가능하다. 
public class SeoulMulitflexStadium 
				implements MultiflexStadium{
	//unimplements method를 선택하면 아래 내용들이 나옴
	@Override
	public void getSportsSchedule(int month) {
		// TODO Auto-generated method stub
		System.out.println(month + "월에 예정된 경기는 수원 대 서울입니다.");
		
	}

	@Override
	public int getSportsticketPrice(int people) {
		// TODO Auto-generated method stub
		return people * 7000;
	}

	@Override
	public void getSupportersItem(int people) {
		// TODO Auto-generated method stub
		System.out.println(people + "명의 아이템 구매 가격은"
							+ (people * 15000) + "원 입니다."); 
	}

	@Override
	public void printSchedule(int month) {
		// TODO Auto-generated method stub
		System.out.println(month + "월에 예정된 콘서트는 싸이 콘서트입니다.");
		
	}

	@Override
	public int getTicketPrice(int people) {
		// TODO Auto-generated method stub
		return people * 96000;
	}

	@Override
	public void getRemainSeat() {
		// TODO Auto-generated method stub
		System.out.println("남아있는 총 좌석은 1000자리입니다.");
	}

	@Override
	public void playSportsAndConcert() {
		// TODO Auto-generated method stub
		System.out.println("수원 대 서울 경기에서 싸이콘서트도 동시에 진행 될 예정입니다.");
		
	}

}
