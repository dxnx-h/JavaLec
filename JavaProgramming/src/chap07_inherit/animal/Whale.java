package chap07_inherit.animal;

public class Whale extends Animal {
	//고래만의 특성이 뭐가 있을까? 어느 바다에 사는지. 숨을 얼마나 참는지
	//Sea, Breath
	
	
	public String sea;
	public int breath;
	
	public Whale(int age, int size, int legCnt, boolean hasWing, 
			String sea, int breath) {
		super(age, size, legCnt, hasWing);	
		// this.~로 한 번 더 땡겨올 필요는없지만 whale 안에서 한 번 더 정의는 해줘야대
		//^4개의 값들을 보내줘야 함. 저 위에 괄호 안쪽은 '정의부'. 호출할때 넣어죠야해애애애애애앵앵
		//super는 항상 맨 위에. 부모니까!
		
		this.sea = sea;
		this.breath = breath; 
	
		
	}
	

	
	

}
