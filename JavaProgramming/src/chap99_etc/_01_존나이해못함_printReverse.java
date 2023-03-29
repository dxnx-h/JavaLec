package chap99_etc;

public class _01_존나이해못함_printReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "AbcDeF";
		// 길이는 6,   012345
		//대소문자 변환 된 문자열
		String capStr="";
		
		//Q) fEdCBa로 변환하시오
		
		//대문자 소문자 바꿔주는 작업
		//i가 영부터 시작해서 str 길이보다 1 작을때까지 반복. 단어 6개니까 0~5까지만!
		//char은 문자열 중 하나를 꺼내올 수 있음. 0일땐 A를 담아오고, 1일땐 b를 담아오고~
		for(int i = 0; i< str.length(); i++) {
			char ch = str.charAt(i);
			
			char capCh = ch >= 'A' && ch <= 'Z' ?  // true면 : 앞을, false면 : 뒤를 연산함
					(char)((int)ch + 32) : (char)((int)ch - 32);
			//                소문자로 바뀜             대문자로 바뀜
			
			//capSTr = SapStr + capCh;
			//capStr = a;
			//capStr = a + B;   ===> aB;
			//capStr = aB + C; ===> aBC
			//...
			//capStr = aBCdE + f ====> aBCdEf		
			capStr +=capCh;
			//처음부터 역순으로 담으려면, capStr = capCh + capStr;    <==아래까지 할 필요 없음
			//capStr = a + "";   ==> a
			//cap Str = B + a;   ==> Ba
			//capStr = C +Ba;    ==> CBa
			
		}
		
		//반대로 출력
		//capStr = "aBCdEf";
		for(int i = capStr.length() -1; i >=0; i--) {  //length가 6이니까 -1을 하면 5번 윈덱스. f값을 먼저 찾을 수 있음.
			//                            0까지 가야 함
			System.out.println(capStr.charAt(i));
		}
	}

}
