package chap06_class.phone;

public class Phone_answer {
	// 이름 100개와 전화번호 100개를 담을 수 있는 배열 2개(String으로 만들기)
	String[] namearr = new String[100];
	String[] phoneNumarr = new String[100];
	// 배열의 현재 인덱스를 담고 있을 변수 = 길이
	int currentIndex = 0; 
	

	// 전달받은=매개변수로 전달해야해) 이름과 전화번호를 저장하는 메소드
	// insertPhoneNum

	public void insertPhoneNum(String name, String phoneNum) {
		/*
		 * for(i = 0; i <100; i++) { // for을 쓰는 것이 아님 (인덱스)이름 저장하는 방으 n번쨰는 000이 된다. 근데
		 * 하나씩 뽑아올거라 for문은 좋지 않아 namearr[i] = ("홍길동" + i); phoneNumarr[i] = (i + i + i +
		 * i + i)
		 */
		this.namearr[currentIndex] = name; //받아온 값을 저장
		this.phoneNumarr[currentIndex] = phoneNum; //값을 저장
		//index가 0인건 이제 찼으니까. 아래 인덱스 증가에 따른 값을 저장할 필요가 있음 ++
		currentIndex++; 
	}

	// 저장된 = 저장 안된 부분은 잘라야 함) 모든 전화번호를 출력하는 메소드 - printAllPhoneNum
	// ex) 이름: 홍길동, 전화번호: 00000000000
	// 이름: 홍길동1,전화번호: 11111111111
	// 이름: 홍길동3,전화번호: 22222222222
	public void printAllPhoneNum() { //모든 내용을 출력할거라 별도의 매개변수()는 필요없음
		for(int j = 0; j < currentIndex; j++) { //j < currentIndex <==저장되지 않은 부분은 잘라줘라.
			System.out.println("이름: " + namearr[j] + ", " + "전화번호" + phoneNumarr[j]);
		
			}
		}

// 전달받은 인덱스의 번호의 해당하는걸 알아야 함 (String num), 해당하는지 알려면 비교를 해야 해 이름과전화번호를 출력하는 메소드 - printPhoneNum
// ex) 이름: 홍길동1, 전화번호: 11111111111
// -------------------------------------------------------
	public void printPhoneNum(int index) { //인덱스를 1~100까지 받아야 함
		if(name[index -1] == null) { 
			System.out.println("해당 인덱스의 종류가 존재하지 않습니다");
		} else {
			System.out.println("이름: " + name[index -1] + ", " + "전화번호" + phoneNum[index -1]);
		}
		
	}


}
