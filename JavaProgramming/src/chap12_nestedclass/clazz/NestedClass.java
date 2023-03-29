package chap12_nestedclass.clazz;

public class NestedClass {
	//인스턴스 중첩 클래스. 
	//외부클래스의 객체를 생성한 후 접근 가능
	public class Mul {
		//static 변수나 메소드 선언 불가
		//final static 변수나 메소드는 상수라 선언 가능
		int num1 = 10; //퍼블릭이 아닐때 gettersetter로 해야 함
		int num2 = 20; //^ alt shifr s -> select all
		
		public int getNum1() {
			return num1;
		}

		public void setNum1(int num1) {
			this.num1 = num1;
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

		int result = num1 * num2; 
	}
	
	//정적 중첩 클래스
	//스태틱클래스는 외부 클래스 객체 없이도 바로 만들수 있음. 접근 가능.
	public static class Div {
		//static 변수나 메소드를 선언 가능
		static int num3 = 10; //num3 num4 getter~
		static int num4 = 5;
		public int getNum3() {
			return num3;
		}
		public void setNum3(int num3) {
			this.num3 = num3;
		}
		public int getNum4() {
			return num4;
		}
		public void setNum4(int num4) {
			this.num4 = num4;
		}
		
		
		public static int result = num3 / num4;
		/* public int num3 = 10;
		public int num4 = 5;
		
		public static int result = num3 / num4; */
		//에러남. 
	}
}

