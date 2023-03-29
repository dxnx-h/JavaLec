package chap15_usefulClass;

public class _04_String03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "bit-naver-cloud";
		String str2 = "kiaCar";
		String str3 = "aBcDeF";
		int num1 = 1234;
		double num2 = 1234.5678;
		boolean a = true;
		
		//특정 문자로 자르기
		String[] strArr = str1.split("-");
		
		for(String s : strArr) { //향상된 for문. 하나씩 꺼내기
			System.out.println(s);
		}
		
	
		//인덱스로 문자열 자르기
		System.out.println(str2.substring(4));//4부터 끝까지 출력
		System.out.println(str2.substring(2, 4)); //2~4 
		System.out.println(str2.substring(str2.indexOf('a'))); //a부터 끝까지
		System.out.println(str2.substring(1, str2.length()-1)); //1부터 뒤에서 2번째까지
		
		
		System.out.println("----------------------------");
		//소문자로 치환
		System.out.println(str3.toLowerCase());
		//대문자로 치환 => 파일 업로드할 때 많이 사용, 확장자 비교 .jpg & .JPG
		System.out.println(str3.toUpperCase());
		
		
		System.out.println("----------------------------");
		//문자열의 앞뒤 공백 없애기
		String str4 = "           aaabbb dddd   ";
		System.out.println(str4.trim());
		
		
		System.out.println("----------------------------");
		//다른 타입의 값을 String으로 변환
		String s1 = String.valueOf(num1);
		String s2 = String.valueOf(num2);
		String s3 = String.valueOf(a);
		
		String s4 = Integer.valueOf(num1).toString();
		
		System.out.println(s1 + ", " + s2 + ", " + s3 + ", " + s4);
		
	}

}
