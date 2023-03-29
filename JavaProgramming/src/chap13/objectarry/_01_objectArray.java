package chap13.objectarry;

import chap13.objectarry.clazz.Lecture;

public class _01_objectArray {

	public static void main(String[] args) {
		//1. 객체배열 선언
		Lecture[] lecArr = new Lecture[3];
		
		//2. 객체배열의 초기화
		lecArr[0] = new Lecture("자바", 30, 50);
		lecArr[1] = new Lecture("c언어", 29, 45);
		lecArr[2] = new Lecture("파이썬", 45, 60);
		
		//3. 객체배열의 사용
		for(int i = 0; i <lecArr.length; i++) {
			lecArr[i].proceedLecture();
		}
		
	}

}
