package chap00_homework._20230322.Basic;

import java.util.Scanner;

/*
 3. 사용자가 입력한 문자열에서 알파벳의 모음을 제거하여 출력하세요.
   대문자 모음, 소문자 모음 모두 제거. 모음은 a, e, i, o, u
 */
public class _3rd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 모음 제거 후 출력: ");
		String str = sc.nextLine();
		
		str.toLowerCase(); 
		
		System.out.println(str);
		
		System.out.println(str.replace("a", "")
						      .replace("e", "")
							  .replace("i", "")
							  .replace("o", "")
							  .replace("u", ""));
		

		   
		
		
		
		
		
		
		
	}

	private static String replace(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}

}
