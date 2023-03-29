package chap00_homework._20230320.middle_01;

public class ArrayUtility {
	/*
	 1. 다음 두 개의 static메소드를 가진 ArrayUtility클래스를 만들어보고 사용해보세요
static double[] intToDouble(int[] source);	// int배열을 double배열로 변환
static int[] doubleToInt(double[] source);	// double배열을 int배열로 변환
	 */
	
	//int 배열을 double 배열로 변경
	static double[] intToDouble(int[] source) {
		double[] resource = new double[source.length];
		
		for(int i = 0; i < source.length; i++) {
			resource[i] = (double) source[i]; 
		}
		return resource;
	}
	
	
}
