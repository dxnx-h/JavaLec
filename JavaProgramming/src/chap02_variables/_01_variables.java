package chap02_variables;

public class _01_variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. 변수: 자료형 변수형
		  - 변수는 직관적으로
		    ex) int likeCnt => 좋아요 개수  / Cnt = count
		  1) 정수 리터럴: 정수     ->  byte, char, short, int, long
		  2) 실수 리터럴: 소수점    -> float, double
		  3) 문자 리터럴(작은따옴표) -> char
		  4) 논리 리터럴( T/F )   -> boolean
		    ex) boolean isUserLike; => 로그인한 사용자가 좋아요 눌렀는지 여부
		 */

		
		
		/* 2. 변수의 선언
		  1) 첫 글자는 문자, $, _만 허용, 첫글자는 무조건 소문자, 뒤에 붙는 첫 단어의 글자는 대문자 */
		int $price;
		int _bit;
		int naverCloud;
		
		/* 아래 예시는 변수로 선언이 불가함.
		int %bit;
		int 2023year;
		int @coding;
		*/
		
		/*2) 변수명: 카멜케이스 + 직관적 변수명 
		  - 카멜케이스: 소문자로 시작해서 단어 구분이 바뀌면 첫 문자는 대문자로
		    hihello (X)  hiHello (O) 
		  - 아래는 변수명 예시*/
		int likeCnt2;          
		int boardCnt;       	// 게시물 개수
		int osOutPrintCnt;      //OS 출력장치의 출력횟수
		//- 변수명은 대소문자 구분
		int lunchTime;
		int LunchTime;	
		int luNchTime;
		
	
	
		/* 3. 변수의 사용
		//변수에 값 대입(저장)
		//최초의 값 저장은 초기화라고 한다.
		 */
		likeCnt = 125;
		//변수의 선언과 동시에 초기화
		int studentnt = 30;
		//상수를 제외한 변수는 값의 변경이 가능하다.
		int studenCnt = 51;
		
		//초기화되지 않은 변수 사용 시 에러 발생
		int errorVal;
		
		//syso 입력 후 ctrl + space
		//System.out.println(errorVal);
		
		//변수의 사용은 변수명을 통해 메모리에 저장된 값을 가져와서 사용한다.
		System.out.println(likeCnt);
		//System.out.println(studentCnt);
		
		
		//4. 이스케이프 문자
		//큰 따옴표나 작은 따옴표를 변수의 값으로 저장하거나 출력하고 싶을 때는 이스케이프 문자 사용
		//리터럴로 인식시키기 위해선 큰따옴표 앞에 하나만 역슬래시(원화표시)를 넣어주면 인식 가능
		//System.out.println("리터럴은 \"초기화"\"코드에 자주 등장한다");
		System.out.println('\'');
		//string tempStr = "aaaa \"bbbbb]""\"";
		
		//탭 키만큼 공백 줄 때 \t
		//줄바꿈이 필요할 때는 \n
		System.out.println("12시 50분부터 \t 점심시간 \n 맛점하세요. \n");
				

		
	}

}
