package chap15_usefulClass;

public class _09_absMaxMinRint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 123;
		int num2 = -456;
		
		//절대값
		System.out.println(Math.abs(num1));
		System.out.println(Math.abs(num2));
		
		//최대값, 최소값
		System.out.println(Math.max(num1, num2));
		System.out.println(Math.min(num1, num2));
		
		//근사값
		double num3 = 123.456;
		System.out.println(Math.rint(num3));
	}

}
