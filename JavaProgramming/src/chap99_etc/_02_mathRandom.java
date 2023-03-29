package chap99_etc;

public class _02_mathRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 난수발생 첫번쨰 방식 
		//Math.random() 사용
		//0 <= Math.random() < 1 사이의 난수
		System.out.println(Math.random());
		
		//2. 1 <= 난수 < 11   ::::::::1부터 10까지의 난수
		//0 <= Math.random() * 10 < 10
		//1 <= (int)(Math.random() * 10 + 1) <11
		int rand = (int)(Math.random() * 10) + 1 ;
		System.out.println(rand);
		
		//Q3. 1~45까지 난수 발생기
		//자 봐봐 난수는 0부터 1까지의 난수자나. 그럼 걍 45 곱하면 되는거 아닌가??
		int rand2 = (int)(Math.random() * 45) + 1;
		System.out.println(rand2);
		
		//Q4. 200~299까지 난수 발생기 
		//곱하기 100하고 +200하면 0도 200이 되고, 1도 300이 되고
		int rand3 = (int)(Math.random() * 100) + 200;
		System.out.println(rand3);
		
		//Q5. a~b까지 랜덤
		//(int)(Math.random() * (b - a + 1)) + a
	}

}


