package chap06_class.calc;

public class Add extends Calc{  //calc를 상속받은 add
	//멤버변수
	private int num1;
	private int num2;
	private int result;  //alt shift s  -> generate getters setters~ 누르고 select all 클릭 -> 접근권한 설정 가능
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {   //10이 여기로 들어올거임
		this.num1 = num1;      //this는 여기. instance에서 넣은 10이 여기로 들어옴. 
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	

	public int add() {
		result = num1 + num2;
		return result;
	}
	
	//오버라이딩: 부모클래스에 존재하는 메소드를 재정의
	public int add(int a, int b) {
		return (a * a) + (b * b);
	}
}
