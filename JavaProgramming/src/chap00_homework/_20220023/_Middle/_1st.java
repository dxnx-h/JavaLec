package chap00_homework._20220023._Middle;

public class _1st {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
    1. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
    비어있는 바이트의 공간을 b, i, t가 반복되어 들어가도록 모두 채우세요.
		 */
		
		StringBuffer sb = new StringBuffer("hello");
		sb.setLength(30);
		
		/*
		전체 길이에서 문자열이 있는 길이를 빼서 공백 시작 인덱스를 구하고,
		거기서부터 i에 대한 값을 시작해서(i+index) 30에서 멈추면 될거 같은데
		*/
		for(int i = 0; i < 30; i++) {
			if(sb.charAt(i) == 0) {
				if(i % 2 == 0 ) {
				sb.setCharAt(i, 'i');
			} else if(i % 3 == 0) { 
				sb.setCharAt(i, 't');	
		} else {
			sb.setCharAt(i, 'b');	
		}
			}
			
			System.out.println(sb);
			
			
		
		//Sting Pattern을 써야할듯. 근데 반복글자는 char로 채울 수가 없으니 
		// 공백을 제거하고 넣자!!!!!!!!!!!!!!
		/*
 		StringBuffer sb = new StringBuffer(arr[0]);
		System.out.println(sb.append(arr[1])
				             .append(arr[2]));
				             
		 */
		/*	
		String str = sb.toString();
		String noSpaceStr = str.trim();
		System.out.println(noSpaceStr);
		*/
		}
	}
}
		
		
		/*
		for(int i = 0; i < 30; i++) {
			if(sb.charAt(i) == 0) {
				sb.setCharAt(i,'');
			}
			
			System.out.println();
		}
		
		*/
 

