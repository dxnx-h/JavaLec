package chap02_variables;

public class _07_덥쳌_booleanType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "bitNaver5";  ///id는 문자열인 bitNaver5라고 정의하자
		boolean idValidation = false; //id를 판별하자
		
		if(id.length() >=5 && id.length() <20) {    //만약 ()에 들어갈 id 길이가 5초과고 and 20 미만이면
			idValidation = true;                    //아이디 판별했을때 사용할 수 있는거시다.
		} if(idValidation == true) {
			System.out.println("사용할 수 있는 아이디입니다");
		}  else {
			System.out.println("아이디는 5자 이상 20자 미만으로 만들어주세요");
		}
		//idValidation -- true =>
		//idValidation -- false => !idValidation = !부정. idValidation이 거짓이다
	}

}
