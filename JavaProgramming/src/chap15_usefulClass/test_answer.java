package chap15_usefulClass;

import java.util.Scanner;

public class test_answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//비트, 네이버, 클라우드 찾아서 제거
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(str);
		
		System.out.println(str.replace("비트", "")
							  .replace("네이버", "")
							  .replace("클라우드", ""));
		
		
		sc.close();
		     
		
	}


}
