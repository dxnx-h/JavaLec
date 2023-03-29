package chap05_array;

import java.util.Random;
import java.util.Scanner;

public class _04_또존노_arrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);  //System.in = 키보드로 입력하겠다
		Random rd = new Random();
		
		//해당 판의 승무패를 담아줄 배열(w, d, l)
		char[] wdlArr = new char[10];
		
		for(int i = 0; i < 10; i++) {   //i가 몇 번째 판인지 결과값을 가지고 있다
			int com = rd.nextInt(3); //3? 0, 1, 2 => 입력할 정수값이 3개
			
			//가위, 바위, 보 10판 진행
			//배열에 각 판의 승무패 저장
			//배열에 저장된 승, 무, 패를 세서
			//몇승 몇무 몇패인지 출력
			System.out.print("가위, 바위, 보 중 하나를 입력하세요. : ");
			String input = sc.nextLine();  //nextLine(): enter치기 전까지 쓴 문자열을 모두 리턴 /next(): space 치기 전까지를 리턴
			int inputNum = 0; // inputNum 초기화 
			
			if(input.equals("가위")) {   // 넣은 값과 같다 = 가위란 문자는 숫자 0을 넣은 것과 같다.
				inputNum = 0;
			} else if(input.equals("바위")) {
				inputNum = 1;
			} else if(input.equals("보")) {
				inputNum = 2;
			}
			
			if(com == inputNum) {
				wdlArr[i] = 'd';
				System.out.println("비겼습니다.");
			} else {
				if((inputNum == 0 && com == 2) ||
					(inputNum == 1 && com == 0) ||
					(inputNum == 2 && com == 1)) {
					wdlArr[i] = 'w';
					System.out.println("이겼습니다.");
				} else {
					wdlArr[i] = 'l';
					System.out.println("졌습니다.");
				}
			}
		}
		sc.close();
		
		//몇승 몇무 몇패 출력
		int winCnt = 0;
		int drawCnt = 0;
		int loseCnt = 0;
		
		for(int i = 0; i < wdlArr.length; i++) {
			if(wdlArr[i] == 'w') {
				winCnt++;
			} else if(wdlArr[i] == 'd') {
				drawCnt++;
		} else if(wdlArr[i] == 'l') {
			loseCnt++;
	}

}
	}
		
System.out.println(winCnt + "승, " + drawCnt + "무, " + loseCnt + "패");
