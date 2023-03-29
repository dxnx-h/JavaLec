package chpa04_controlstatement;

import java.util.ArrayList;
import java.util.List;

public class _11_countinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. for문의 countinue
		//증감식으로 돌아가는 역할
		for(int i= 0; i <10; i++) {
			if(i < 5) {
				//0~4까지는 continue와 만나기 떄문에 출력되지 않고, 증감식으로 돌아가서 i를 1 증가시키고
				//다시 조건을 판별. i가 5가 넘어가야 출력해줌
				continue; 
			}
			
			System.out.println(i);
		}
		
		
		//2. while의 continue
		//while문은 증감식이 없어서 조건식으로 돌아간다
		int num = 0;
		while(num<= 20) {
			num++;
			
			if(num % 3 == 0) { //0부터 넣었을 때, 3의 배수라면 다시 증감식.  
				continue;
			}
			
			System.out.println(num);
		}
		
		
		//3.
		List<String> memberList =
				new ArrayList<String>();
		
		//모든 회원 아이디에 a를 붙이는 작업
		//아이디가 admin인 회원은 제외
		for(int i = 0; i < memberList.size(); i++) {
			if(memberList.get(i).equals("admn")) {
				continue;
			}
			
			String newMemberId = memberList.get(i) + "a";
		}
		
	}

}


//회원정보를 가져왔을 때 admin계정(관리자 권한을 가진)은 모을 필요가 없다. 
//회원관리나 게시물 관리 ex) 비밀글은 삭제를 하지 않겠다 등등에 사용
