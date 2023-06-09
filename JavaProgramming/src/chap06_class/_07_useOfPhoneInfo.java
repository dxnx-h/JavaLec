package chap06_class;

import java.util.Scanner;

import chap06_class.phone.PhoneInfo;

public class _07_useOfPhoneInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneInfo phoneInfo = new PhoneInfo();
		
		Scanner sc = new Scanner(System.in);
		
		//switch~case문에서 break; 시 switch case만 종료되기 떄문에 while문을 종료시킬 플래그
		boolean isExit = false;
		
		while(true) {
			System.out.println("------------연락처 목록-----------");
			System.out.println("1. 정보입력");
			System.out.println("2. 모든 정보 출력");
			System.out.println("3. 인덱스로 정보 검색");
			System.out.println("4. 종료");
			
			//nextInt는 enter값을 처리하지 못하기 때문에 숫자 입력 후 엔터를 누르면 엔터 값이 남아있다
			int userInput = sc.nextInt();
			
			
			switch(userInput) {
				case 1:
					System.out.println("이름 : ");
					String name = sc.next();
					sc.nextLine();
					System.out.println("번호 : ");
					String phoneNum = sc.nextLine();
					
					break;
				case 2:
					phoneInfo.printAllPhoneNum();
					
					break;
					
				case 3:
					while(true) {
						System.out.println("조회하고 싶은 번호 입력(1~100");
						
				case 4:
					isExit = true;
					
					break;
					
				 default:
					 System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
					 continue;
					}
					
					
			}
		}
	}

}
