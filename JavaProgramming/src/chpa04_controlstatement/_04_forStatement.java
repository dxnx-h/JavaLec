
package chpa04_controlstatement;

public class _04_forStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~100까지의 합을 담아줄 변수
		int sum = 0; // sum은 0이라고 초기화 해줄거야. 0부터 시작되는거지.
		int i;  //i를 밖에 선언해서 마지막에 어떻게 나오는지 확인해보쟈! 내가 최종적으로 찾을 값이거든!
		
		for(i = 1; i <= 100; i++) {
			//for(초기화식; 조건식; 증감식)
			//    i는 1부터 시작할것이다; i는 100 이하다; i는 1씩 증가할것이다
			/* sum = 0 + 1
			   sum = 1 + 2
			   sum = 3 + 3
			   ...
			   sum = 4950 + 100
			   이후, i =101이 리턴되면서 false가 되고 여기서 종료가 됨 = 100에서 끝나는 것이 아니라 1번 더 가서 확인 후 끝남(A) */
			sum += i; // sum = sum + i
		}
		
		System.out.println("1~100까지의 합: " + sum);
		System.out.println("마지막 i의 값: " + i);        //A 참고
		
		
		int num = 0;
		
		for(int j = 0; j <= 1000; j++) {
			if(j % 13 ==0 && j % 23 ==0)
				num +=
				j;
			
				if(num > 500) {
					break;
					

				}	
		System.out.println("12, 13의 공배수 합이 500을 넘어갈 때의" + "합: " + sum);
		System.out.println("for문 밖의 j:" + j);
		}

	}

}
