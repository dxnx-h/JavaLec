package chap05_array;

public class _06_shalloCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr1 = {1, 2, 3, 4, 5};
		
		//얕은 복사
		int[] intArr2 = intArr1;
	
		System.out.println(intArr1);   /@ 뒤부터가 주솟값
		System.out.println(intArr2);
		System.out.println(intArr1 == intArr2);
		
		//얕은 복사 - 값을 변경하면 서로 영향을 미친다는 것을 알아보자!
		intArr1[0] = 20;   // 1번째 인자를 20으로 바꿀거야
		intArr1[4] = 30;   // 5번째 인자를 30으로 바꿀거야
		
		System.out.println(intArr1[4]); // 원본배열 중 5번쨰 인자도 바꼈고
		System.out.println(intArr1[0]); // 복사 배열 중 1번째 인자도 바꼈다.
	}

}
