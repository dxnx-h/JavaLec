package chap03_operator;

public class _02_arithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 대입연산자
		//왼쪽항에 오른쪽 항의 값을 대입(저장)한다
		//변수를 사용해서 변수값도 대입 가능
		int num1 = 100;
		int num2 = 255;
		int num3 = 313;
		//오른쪽 항에 변수명을 사용해서 해당 변수의 값도 대입할 수 있음
		int num4 = num3;
		
		//2. 산술연산자
		int result;
		
		//덧셈
		result = num1 + num2;
		System.out.println("num1 + num2 =" + result);
		
		//뺼셈
		result = num1 - num2;
		System.out.println("num1 - num2 =" + result);
		
		//곱셈
		result = num1 * num2;
		System.out.println("num1 * num2 =" + result);
		
		//나눗셈
		result = num1 / num2;
		System.out.println("num1 / num2 =" + result);
		
		//나머지
		result = num1 % num2;
		System.out.println("num1 % num2 =" + result);
		
		
		//3. 복합대입연산자 ---> 위에서 타고 내려가면서 num3이 계속 변함. 고정값 하고 싶으면 상수값으로 선언을 했어야 하나바
		num3 = 100;
		num4 = 15;
		
		num3 += num4; // => num3 = num3 + num4
		System.out.println("num3 += num4 =" + num3);
		
		num3 -= num4; // => num3 = num3 - num4
		System.out.println("num3 -= num4 =" + num3);
		
		num3 *= num4; // => num3 = num3 * num4
		System.out.println("num3 *= num4 =" + num3);
		
		num3 /= num4; // => num3 = num3 / num4
		System.out.println("num3 /= num4 =" + num3);
		
		num3 %= num4; // => num3 = num3 % num4
		System.out.println("num3 %= num4 =" + num3);
		
		
		
		
		
		
		
		
		
		
		
	}

}
