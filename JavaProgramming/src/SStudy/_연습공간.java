package SStudy;

public class _연습공간 {

	public static void main(String[] args) {
		int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};
		solution(board);
	}

	public static int solution(int[][] board) {
		int answer = 0;

		// i가 1일때 j는 0부터 i만큼 매칭되어야 함
		// i가 2일때도 j는 0부터 i만큼 매칭되어야 함 => 우선 이걸 만들어야하는뎅

		for (int i = 0; i < board.length; i++) { // 몇 층을 만들건지 => 제시된만큼
			for (int j = 0; j < board.length; j++) { // 층엔 방이 몇개 있는지 => 층 수만큼
				// 방에 1이 있나없나 확인하고 안전지대 구해야?
	
					if(board[i][j] == 0) {
						if(i != 0 && j != 0) { 
								answer++;
							}
						}					
					
				}		

			}
	}
		
		System.out.println(answer);
		return answer;
	
}




// board[i-1][j-1] != 1
// board[i-1][j] != 1
// board[i-1][j+1] != 1
// board[i][j-1] != 1
// board[i][j+1] != 1
// board[i+1][j-1] != 1
// board[i+1][j] != 1
//board[i+1][j+1] != 1
//

