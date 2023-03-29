package SStudy;

public class _chap02_07_간단버전 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "00i";  

		
		if(id.length() >=5 && id.length() <20) {   
			System.out.println("사용할 수 있는 아이디입니다");
		}  else {
			System.out.println("아이디는 5자 이상 20자 미만으로 만들어주세요");
		}

	}

}

