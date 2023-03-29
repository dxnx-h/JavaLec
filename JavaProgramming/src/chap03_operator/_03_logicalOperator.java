package chap03_operator;

public class _03_logicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 관계연산자
		// 두 수의 크기를 비교하거나 두 수의 동일여부를 판단
		int num1 = 110;
		int num2 = 215;
		
		System.out.println("num1 < num2 :" + (num1 < num2)); //ture 반환
		
		System.out.println("num1 >= num2 :" + (num1 >= num2)); //false 반환
		
		System.out.println("num1 == num2 :" + (num1== num2)); //false 반환
		
		
		//String은 참조형 변수임. 값의 동일여부를 판단할 때 ==을 사용하지 않음
		//==을 사용하면 같은 값인지 비교하는 게 아니라 같은 객체를 참조하고 있는지 비교함.
		//값의 동일여부를 비교하고 싶으면 .equals() 메소드 사용  <=== 점 앞에 모가 들어가는고징?
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		//같은 객체를 참조하는지 연산  ---> 다른 데서 끌어온 헬로니까 펄스ㅡㅡㅡ
		System.out.println(str1 == str2); 
		
		//같은 값인지 연산   -----> 같은 단어라 트루우우
		System.out.println(str1.equals(str2)); 

		
		//2. 논리연산자(&&, ||, !)
		int num3 = 10;
		int num4 = 33;
		
		System.out.println("num1 < num2 && " 
				+ "num3 / num4 == 0 => " 
				+ (num1 < num2 && num3 / num4 ==0)); //true
		
		System.out.println("false || " 
				+ "num2 < 100  => " 
				+ (false || num2 < 100)); //왼쪽항이 false지만 오른쪽도 false => false
		
		System.out.println("!(num4 > 2000) => " 
				+ !(num4 > 2000));    //!false = true
		
		
	}

}
