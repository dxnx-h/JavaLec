package chap00_homework._20230322.Basic;

import java.util.Scanner;

public class _1st {
/*
 1. 사용자가 입력한 문자열을 받아서 가운데 문자를 출력하세요. 
    문자열의 길이가 짝수면 가운데 두 글자 출력. 
    ex) 비둘기 -> 둘, 비트캠프 -> 트캠
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요: ");
		String str = sc.nextLine();
		
		System.out.println(str.length() % 2);
		
		//str의 길이는 str.length()
		if(str.length() % 2 == 0) { //2로 나눈 나머지 0은 짝수문자열
			System.out.println("짝수 문자열이고 맨 앞 뒤 제거한 문자열은 " 
		                    + str.substring(1, str.length()-1));
								//index는 0부터 시작. 마지막 index는 길이-1
		} else {
			System.out.println("홀수 문자열이고 맨 앞 뒤 제거한 문자열은 " 
                    + str.substring(1, str.length()-1));
		}
		



		

	}

}
