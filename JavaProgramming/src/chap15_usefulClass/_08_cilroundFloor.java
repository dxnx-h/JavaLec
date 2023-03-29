package chap15_usefulClass;

public class _08_cilroundFloor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = 123.4567;
		
		System.out.println(Math.ceil(num));
		System.out.println((double) Math.round(num));
		//^round는 롱 값으로 반환하므로 double로 강제 형변환 필요
		System.out.println(Math.floor(num));
		
		System.out.println(Math.round(num * 100 / 100));
	}

}
