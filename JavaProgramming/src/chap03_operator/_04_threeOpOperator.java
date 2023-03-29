package chap03_operator;

public class _04_threeOpOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 삼항 조건 연산자
		int num1 = 111;
		int num2 = 10;
		int result = num1 / num2 > 8 ?  //num1을 num2로 나눈 값이 8보다 크니?  
				num1 - 11 : // 크다면 이걸 출력해죠
				num2 - 11;  // 크지 않다면 이거로 출력해줘
		
		System.out.println(result);
		
		
		//2. 삼항 조건 연산자의 중첩
		result = num1 / num2 > 8 // 값을 새로 선언하는거라 int는 뺴야함
				?                //num1을 num2로 나눈 값이 8보다 크니?           
						num1 - 11 == 100 ?  //크다면, 이 수식을 풀어봐. 값이 100이니?
								num1 * 2 :  //맞으면 이걸 출력하고
								num1 /2     //아니면 이걸 출력해줘
				:
					num2 - 11<0 ?           //크지 않다면 이 수식을 풀어봐. 0보다 작니?
							num2 *2 :       //작다면 이걸 출력하고
							num2 /2;        //작지 않다면 이걸 출력해줘
		
				System.out.println(result);
	}

}


