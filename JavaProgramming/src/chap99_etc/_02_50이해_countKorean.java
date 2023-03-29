package chap99_etc;

public class _02_50이해_countKorean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q) "가A나B다C라D"에서 한글의 갯수를 찾는 순서도 작성 및 로직을 짜보자.
		
		//1. 변수 선언 및 초기화
		String str = "가A나B다C라D"; // 문자 하나씩 꺼내서 한글 판별할 변수
		char ch;  // 하나씩 꺼내쓸 캐릭터 하나를 ch라고 정의하겠다. 암튼 아래 ch가 나올 것이다.
		int kCnt = 0;  //kcnt = korean count = 한글 갯수를 셀 것이다. 근데 그건 0부터 시작한다
		
		//2. 로직 처리
		//반복문으로 문자 하나씩 꺼내서 한글 여부 판별
		for(int i = 0; i < str.length(); i++) { //for(초기화식; 조건식; 증감식)
			//i는 0부터 셀 것이다; i는 str의 길이보다는 짧다; i는 1씩 증가할 것이다.
			//length() : 문자열의 길이를 알고싶다.
			
			ch = str.charAt(i);  //[실행문임] i번째거를 하나씩 꺼내서 담아주기 // charAt() : string 타입의 데이터(문자열)에서 특정 문자를 char 타입으로 변환할 때 사용
			                     // 위에 선언한 str 중에 i번쨰 단어를 끄집는 로직을 ch라고 정의하겠다.
			
			if(ch >= 44032 && ch <= 55203) { //암튼 한글의 아스키코드는 44,032부터 55,203이다
				kCnt++;   //만약, ch가 한글 아스키코드에 해당한다면 몇갠지 세어봐라!!!!!!!!!!!!!!!!!!!!!!
				//kcnt +1; 도 맞고 
				//kCnt = kCnt +1;

					}

		}
		//3. 출력 go. 이건 모든 조건이 끝난 다음에 해야 알 수 있으니까 위치는 여기!!!!!!!!
		System.out.println(kCnt);

	}

}

