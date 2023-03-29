package chpa04_controlstatement;

public class _09_존나이해못함_duplicatedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//삼각형 별찍기
		
		//*
		//**
		//***
		//****
		//*****
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {    //1. 내부의 for문 먼저 반복 실행. 0~
				if(i >= j) {                //j = 0, 
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		//*****
		//****
		//***
		//**
		//*
		
		for(int i = 0; i < 5; i++) {   
			for(int j = 0; j < 5; j++) {
				if(i <= j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		//    *
		//   **
		//  ***
		// ****
		//*****
		for(int i = 0; i < 5; i++) {   
			for(int j = 4; j >= 0; j--) {
				if(i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//******
		// ****
		//  ***
		//   **
		//    *
		for(int i = 0; i < 5; i++) {   
			for(int j = 4; j < 5; j--) {
				if(i <= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
