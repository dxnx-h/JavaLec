package chpa04_controlstatement;

import java.util.Scanner;

public class _08_duplicatedFor_한번ㄱㄱ {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		
		Scanner sc = new Scanner(System.in);//ctrl shift o 눌러서 메인함수 추가
		
		while(true) {     ///참이면 계속 반복한다
			System.out.println("2~9까지 입력. 0, 1 종료: "); ///참이면 반복할 것 첫번째. 
			num = sc.nextInt();           //1. 안내 문구를 출력하고 출력 및 숫자를 입력할 수 있도록 한다
			
			if(num == 0 || num == 1) { // 2-1.0이거나 1이면
				System.out.println("종료되었습니다."); //2-1-1. 이 문구를 출력하고
				break;                      //2-1-2. while문 종료종료
			} if(num <= 9) {

				for(int j = 1; j <=9; j++) { //2-2-1. 그래서, i 가 암튼 2보다 크면, 곱할값인 j는 1-9까지고, 1에서 하나씩 증가함
					System.out.println(num + "*" + j + "=" + num * j + "\t");
				} 
					
				} else {
				System.out.println("숫자를 확인해주세요.");
			}
		}
	}

}

