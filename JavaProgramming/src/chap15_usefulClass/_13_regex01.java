package chap15_usefulClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _13_regex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "010.*-[0-9]{4}.*-[0-9]{4}"; 
		               //010으로 시작하면서 모든 문자열이 오는뎅
					  //- 다음엔 0-9까지 4자리수
		String test = "010-1111-2222";
		
		Pattern pt = Pattern.compile(pattern);
		Matcher m = pt.matcher(test);
		
		if(m.matches()) {
			System.out.println("전화번호 양식이 맞았습니다.");
		} else {
			System.out.println("다시 입력하세요.");
		}
	}

}
