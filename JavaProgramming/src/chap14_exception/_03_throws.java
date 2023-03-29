package chap14_exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class _03_throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4};
		try {
			//throws로 예외처리된 메소드를 호출할 때는 예외가 발생할 수 
			//있는 확률이 있기 때문에 try~catch로 묶어서 처리해야함
			//왜냐?? 아래서 예외가 발생할 수 있으므로 try~catch 이용
			
			//checked excep이면 무조건 예외처리. 안할시 에러
			//unchecked excep면 예외처리 안해도 됨.
			//getException(arr); 
			//div(10, 0);
			method();
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void getException(int[] intArr) 
								throws Exception {
								//exception은 언첵트, 첵트 excep을 
								//포함하기 떄문에 try~catch필수
		for(int i = 0; i < 10; i++) {
			System.out.println(intArr[i]);
		}
	}
	
	public static int div(int a, int b) 
			throws ArithmeticException {
		return a / b;
	}
	
	public static void method() 
			throws InputMismatchException, 
				   IOException, 
				   ArithmeticException, 
				   IndexOutOfBoundsException{
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
	}
}
