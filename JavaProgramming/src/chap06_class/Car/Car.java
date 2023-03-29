package chap06_class.Car;

public class Car {
	   // 제조사(company), 모델(model), 색상(color), 가격(price)
	   // public
	   
	
	
		//기본 생성자 - 매개 변수가 없다
		public Car() {
			System.out.println("기본 생성자 호출");
			/*String은 null로 초기화되기때문에, 데이터에 null이 존재하면 예외가 발생할 확률이 높아지므로 ""(빈 문자열)로 초기화해주기  */
		}
	
		//매개변수가 있는 생성자
		public Car(String c) {
			company = c; /////초기화하는중
			System.out.println("매대변수가 하나인 생성자 호출");
		}
	
		public Car(String c, String m) {
			company = c;
			model = m;
			System.out.println("매개변수가 2개인 생성자 호출");
		}
		
		//매개변수명은 어떤 멤버변수의 초기화할지 명확하게 하기 위해서 멤버변수명과 일치시켜준다
		public Car(String comapany, String model, String color) {
			this.company = company;
			//^생성된 객체를 가르치는 this 키워드를 사용해서멤버변수를 지칭하도록 한다.
			this.model = model; //2개만 초기화할건지
			this.color = color;
			System.out.println("매개변수가 3개인 생성자 호출");
		}
		
		
		public Car(String company, String model, String color, int price) {
			this.company = company;
			//^생성된 객체를 가르치는 this 키워드를 사용해서멤버변수를 지칭하도록 한다.
			this.model = model; //3개만 초기화할ㄹ건지
			this.color = color;
			this.price = price;
			System.out.println("매개변수가 4개인 생성자 호출");
		}
		
	   // void carInfo() -> 입력한 자동차 정보를 출력
	   // 제조사: 현대
	   // 모델: 제네시스
	   // 색상: 검정
	   // 가격: 5000
	
		public String company;
		public String model;
		public String color;
				public int price;
		
		
		                 //위에 선언을 안하구 안에 넣어버릴 수도 있나?? 나중에 확인 ㄱㄱ
		public void carInfo() {
			System.out.println("제조사: " + company);
			System.out.println("모델: " + model);
			System.out.println("색상: " + color);
			System.out.println("가격: " + price);

		}
		
		
		
		
}
