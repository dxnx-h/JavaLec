package chap00_homework._20230327;

import java.util.ArrayList;
import java.util.Scanner;

public class _01_basic01 {
/*
1. 정수형 데이터를 저장할 수 있는 ArrayList를 생성하고 
사용자가 입력한 5개의 정수를 저장하고 출력하세요.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList list = new ArrayList();
		
		for(int i = 0; i < 5; i++) {
			list.add(sc.nextInt());
		}

		// 크기 순서대로 정렬하고 싶으면 Collections.sort(list)
		
		System.out.println(list);
		
			
		
		
		
	}

}
