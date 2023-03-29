package chap06_class.phone;

public class PhoneInfo {
	// 이름 100개와 전화번호 100개를 담을 수 있는 배열 2개(String으로 만들기)
	String[] namearr = new String[100];
	String[] phoneNumarr = new String[100];
	// 배열의 현재 인덱스를 담고 있을 변수 = 길이
	int i; //초기화 되면 안댐. 아파트에 방이 100개 있다고 하면 100개 중 몇개 방이 차있는지ㅣ 확인
	       //추후에 j로 실제 내용에 대한 걸 알아올 수 잇음
	

	// 전달받은 이름과 전화번호를 저장하는 메소드
	// insertPhoneNum

	public void insertPhoneNum(String name, String phoneNum) {
		/*
		 * for(i = 0; i <100; i++) { // for을 쓰는 것이 아님 (인덱스)이름 저장하는 방으 n번쨰는 000이 된다. 근데
		 * 하나씩 뽑아올거라 for문은 좋지 않아 namearr[i] = ("홍길동" + i); phoneNumarr[i] = (i + i + i +
		 * i + i)
		 */
		this.namearr[i] = name;
		this.phoneNumarr[i] = phoneNum;

		i++; /// 다음 방으로 넘어간다. 아니면 i 하나에서 고정이 됨. 방 끝!
		// 방을 다 만들었으니까 이제 꺼내오는 걸 만들어함. 다음 메소드로 ㄱㄱ
	}

	// 저장된 모든 전화번호를 출력하는 메소드 - printAllPhoneNum
	// ex) 이름: 홍길동, 전화번호: 00000000000
	// 이름: 홍길동1,전화번호: 11111111111
	// 이름: 홍길동3,전화번호: 22222222222
	public void printAllPhoneNum() {
		for(int j = 0; j < i; j++) { ///i는 순서값을 갖고 있어야 하니까 i가 아닌 다른 변수를 써야 함
						//인덱스를 넘어갈 순 없음. i보단 작아야댐
			System.out.println("이름: " + namearr[j] + ", " + "전화번호" + phoneNumarr[j]);
			  ///i는 인덱슥. j가 우리가 매겨놓은 값. 
				
			}
		}

// 전달받은 인덱스의 해당하는걸 알아야 함 (String num), 해당하는지 알려면 비교를 해야 해 이름과전화번호를 출력하는 메소드 - printPhoneNum
// ex) 이름: 홍길동1, 전화번호: 11111111111
// -------------------------------------------------------
	public void printPhoneNum(int num) { //ㅑi랑 타입이 같아야 해서 int
		if(num < i) { //num은 무조건 i보단 작아야 함. 0~i안에 있어야 함
			System.out.println("이름: " + namearr[num] + ", " + "전화번호" + phoneNumarr[num]);
		} else {
			System.out.println("오류입니다");
		}
		
	}


}
