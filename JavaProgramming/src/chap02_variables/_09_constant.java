package chap02_variables;

public class _09_constant {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		/*상수는 선언만 하고 나중에 값을 저장해도 된다.
		
		final int MAX_VALUE;
		MAX_VALUE = 10;
		*/
		
		
		//한 번 지정된 상수의 값은 변경할 수 없다.
		//MAX_CONNECTION = 30;
		
		//DB 커넥션 풀의 최대 DB 연결 개수 = 20
		final int MAX_CONNECTION = 20;  //상수선언. final. 변하지 않는 값
		int userCnt = 0;  // userCnt는 0부터 시작을 세알릴 것이다. 
		
		while(true) {
			userCnt++;
			
			System.out.println("현재 사용자 수: " + userCnt);  // 아래 수가 없다면 무한 반복. 무제한 올라감. 그렇기 때문에 아래 if값을 넣어 break를 넣는 거임.
			
			if(userCnt > MAX_CONNECTION) {
				break;
			}
			Thread.sleep(1000); //1초동안 일시정지. 1초마다 반복
		}
		
		System.out.println("DB 연결이 모두 사용중입니다");
	}
	
}
