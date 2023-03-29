package chap01_java; //첫 줄은 내가 최초 설정한 pakage 주소가 세팅

public class _01_HelloJava { //2번째 줄은 내가 설정한 클래스 명이 세팅됨

	public static void main(String[] args) { //main메소드를 설정했기 때문에 자동으로 설정됨(5-6행)
		// TODO Auto-generated method stub
		
		/* < System.out.println()을 분석해보기 >
		  1. System: 현재 사용중인 운영체제
		  2. out: 운영체제에서 사용중인 출력장치(모니터)
		  3. println(): 괄호 안의 내용을 출력한 후 라인(ln, line)을 변경해라. = 다음 명령은 다음 줄부터 표출된다.          

		 **printf(): 형식 지정 출력 방식
		 **형식 참고: %d => 정수, %f => 실수, %c => 문자, %n => 줄바꿈
		 */
		
		System.out.println("Hello Java"); 
		//println이기 떄문에 다음 값은 다음 줄에 출력됨. 만약 print였다면 다음 값은 현재값 바로 옆에 출력됨
		
		System.out.printf("%d %n", 1);

		
		System.out.printf("%d %n %f %n %c", 1, 3.14, 'A');
		//              정수 줄바꿔 실수 줄바꿔 문자

	}

}
