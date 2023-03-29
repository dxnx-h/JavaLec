package chap00_homework._20230327;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_basic02 {
	/*
2. 정수형 데이터를 저장할 수 있는 LinkedList를 생성하고 사용자가 입력한 5개의 정수를 저장하고 
index가 3, 4번 요소를 값은 100, 200으로 변경하고 출력하세요.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList list = new ArrayList();
		
		for(int i = 0; i < 5; i++) {
		list.add(sc.nextInt());
		}
		
		list.set(2, 100);
		list.set(3, 200);
		
		System.out.println(list);
		
		
		
	}

}
