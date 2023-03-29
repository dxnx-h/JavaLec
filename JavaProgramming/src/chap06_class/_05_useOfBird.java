package chap06_class;

import chap06_class.Animal.Bird;

public class _05_useOfBird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Bird bird1 = new Bird("참새", "모이");
		Bird bird2 = new Bird("독수리", "뱀");
		Bird bird3 = new Bird("닭둘기", "잡식");
		
		bird1.eat();
		bird2.eat();	
		bird3.eat();
		
		//Bird bird = new Bird();
		//bird.name = "참새";
		//bird.food = "모이";
		
		//bird.fly(2, 3, "aa");
		//bird.cry();
		//bird.eat();
	}

}
	
