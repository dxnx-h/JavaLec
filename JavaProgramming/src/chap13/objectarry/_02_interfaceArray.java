package chap13.objectarry;


import chap13.objectarry.clazz2.English2;
import chap13.objectarry.clazz2.ILecture1;
import chap13.objectarry.clazz2.Mathmetics;
import chap13.objectarry.clazz2.Programming;

public class _02_interfaceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ILecture1[] lecArr = new ILecture1[3];
		
		//2. 객체배열의 초기화
		lecArr[0] = new English2("영문법", 30, 100);
		lecArr[1] = new Mathmetics("미적분", 15, 120);
		lecArr[2] = new Programming("자바", 50, 90);
		
		//3. 객체배열의 사용
		for(int i = 0; i <lecArr.length; i++) {
			lecArr[i].proceedLecture();
	}
 }
}
