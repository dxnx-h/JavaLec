package chap11_interface.multiinherit;

public interface MultiflexStadium 
						extends Stadium, ConcertHall {
	void playSportsAndConcert(); //경기와 콘서트 동시에 진행.
	//스타디움과 콘서트의 기능도 받은 인터페이스
	
}
