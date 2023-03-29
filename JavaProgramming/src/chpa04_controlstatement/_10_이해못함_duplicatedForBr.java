package chpa04_controlstatement;

public class _10_이해못함_duplicatedForBr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//외내부 for문이 몇번 실행됐는지 담을 변수
		int iCnt = 0;
		int jCnt = 0;
		
		//외부 for문의 break는 전체 for문을 종료
		for(int i = 0; i < 5; i++) { //i가 2일때까지 3번(0, 1, 2)
			if(i == 3) {
				break;
			}
			iCnt++;
			//내부 for문의 break는 내부 for문만 종료
			for(int j = 0; j < 5; j++) { //i가 0일때 2번, 1일때 2번, 2일때 2번 총 6번
				if(j == 2) {
					break;
				}
				jCnt++;
			}
		}
		
		System.out.println(iCnt);
		System.out.println(jCnt);

	}

}
