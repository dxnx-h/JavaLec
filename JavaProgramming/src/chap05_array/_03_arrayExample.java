package chap05_array;

public class _03_arrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chArr = {'B', 'c', 'T', 'p', 'P', 'i'};
		char[] convertArr = new char[6]; //왜냐? 6개가 있으니까 6!
		
		//소문자는 대문자로, 대문자는 소문자로 변경 후 convertArr에 저장 
		//1) 순서도 어떻게 짜야할까?
		//  (1) 상단에 변수 선언까지 쌤과 함께함
		//  (2) 그렇다면 내가할 건 초기화부터.   //while문 안써도 대. for문이편할거야
		//  (3) 그 다음엔 하나씩 접근해야 해. 반복문으로소문자->대문자, 대문자->소문자로 변경해서 caArr2를 만들어볼까?

		
		for(int i = 0; i < chArr.length; i++) { //(3) 시작
			if(chArr[i] >- 'A' && chArr[i] <= 'Z') { //하나씩 꺼내올건데(chArr[i]) 만약 A~Z 사이면
				convertArr[i] = (char)(chArr[i] + 32); //convertArr i번 해당하는 숫자번째에 넣구
				               //이건 문자열이구
			} else {                                    //하나씩 꺼내올건데(chArr[i]) 만약 A~Z 사이가 아니면
				convertArr[i] = (char)(chArr[i] - 32);	//i번에 해당하는 숫자번째에 대치해줘.			
			}
					
			System.out.print(convertArr[i] + ",");    // 그래서 순서대로 넣어바
		}
		

	}

}
