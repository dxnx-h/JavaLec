package chap05_array;

public class _07_deepCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//깊은 복사!!!!!!!!!!!!!!!!!!
		//1. clone()을 이용한 깊은 복사
		int[] arr1 = {1, 2,3, 4, 5};
		
		int[] arr2 = arr1.clone();
		
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr1 == arr2); //주솟값이 다르니까 false로 나옴
		
		//깊은 복사는 값을 변경해도 서로에게 아무런 영향을 끼치지 않는다.
		arr1[0] = 10;
		arr2[0] = 20;
		
		System.out.println(arr1[0]); //각각 첫번째 배열을 가지기때문에 다른 값 도출
		System.out.println(arr2[0]);

		System.out.println("-----System.arraycopy------------");
		
		//2. System.arraycopy
		int[] arr3 = new int[5];
		
		System.arraycopy(arr1, 2, arr3, 0, arr1.length - 2);  
		//                     ^3번째 인수부터 땡겨온다
		//                                               ^3번째 인수부터 땡겨올거면 2개가 비니까 빼줘야 함. 왜냐면 빼기 전엔 5개니까
		
		for(int i : arr3) {
			System.out.print(i + " "); //3~5번째 인수 3개를 떙겨올건데, 위치는 0부터니까 뒤쪽 빈 자리는 0 0 으로 출력됨
		}
		
		System.out.println(arr1);
		System.out.println(arr3);
		System.out.println(arr1 ==  arr3);
		
		arr1[1] = 13;
		arr3[1] = 33;
		
		System.out.println(arr1[1]);
		System.out.println(arr3[1]);




		
	}

}
