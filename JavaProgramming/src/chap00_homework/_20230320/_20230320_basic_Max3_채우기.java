package chap00_homework._20230320;

import java.util.Scanner;

public class _20230320_basic_Max3_채우기 {

	public static void main(String[] args) {
		//3개의 정숫값을 입력하고 최댓값을 구합니다. 
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값：");	int a = stdIn.nextInt();
		System.out.print("b의 값：");	int b = stdIn.nextInt();
		System.out.print("c의 값：");	int c = stdIn.nextInt();
		int max = a;
		
		//하단에 적절한 코드 넣기
		//max 자체가 걍 최댓값을 의미하는 지정문자?인가봐
		
		if(b > max) {
			max = b;
			}
		if(c > max) {
			max = c;
			}
		
		//상단에 적절한 코드 넣기
		System.out.println("최댓값은 " + max + "입니다.");

	}

}
