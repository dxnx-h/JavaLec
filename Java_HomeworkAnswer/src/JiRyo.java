
public class JiRyo {
//board 는 n*n, n은 1부터 100까지
//1과 0만 존재, 가로세로대각선은 위험지역
//안전지역(answer) 리턴
	public static void main(String[] args) {
		System.out.println("test");
	}

	public int solution(int[][] board) {
		int answer = 0;
		return answer;


		int safeCnt = 0;
		//int[][] board = new int[100][100]; // 아파트 도면 설계(최대공간은? 100*100)

		// i가 1일때 j는 0부터 i만큼 매칭되어야 함
		// i가 2일때도 j는 0부터 i만큼 매칭되어야 함 => 우선 이걸 만들어야하는뎅

		for (int i = 0; i < 100; i++) { // 몇 층을 만들건지
			for (int j = 0; j <= i; j++) { // 층엔 방이 몇개 있는지.
				// 이제 아파트는 다 지음. 
				//방에 1이 있나없나 확인하고 안전지대 구해야? 
				if (board[i][j] == 0) { // 겹치는거 ㄴ상관
					
				}

			}

		}

	}

}
