package chap99_etc;

import java.util.Random;
import java.util.Scanner;

public class _04_objRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//(썜)컴퓨터 랜덤값 담아줄 배열
		int[] com = new int[3];  // 컴퓨터 랜덤값은 숫자3개까지 부를거다!!!!!!!!!!!!
		
		//사용자 입력값 저장할 배열
		int[] user = new int[3]; //유저 입력값도 숫자3개까지 부를거다!!!!!!!!!!!!
		
		Scanner sc = new Scanner(System.in); //내가 타이핑 하는걸 세어줘!
		Random rd = new Random(); //랜덤 함수 선언
	
		System.out.println(com[0] + ", " + com[1] + ", " + com[2]);
				
	}
}

