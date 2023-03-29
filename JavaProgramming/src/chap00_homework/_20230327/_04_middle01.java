package chap00_homework._20230327;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class _04_middle01 {
/*
 1. 학생이름을 key로 시험점수를 value로 가지는 Map<String, Integer>를 생성하고
  4명의 학생 데이터를 입력한 후 4명 중 최고 점을 맞은 학생의 이름과 점수을 출력하세요.
rank, student, score
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> rankMap = new HashMap<String, Integer>();

		for(int i = 0; i < 4; i++) {
			System.out.println("학생의 이름과 성적을 입력해주세요");
			rankMap.put(sc.next(), sc.nextInt());
		
		}
			
			//map 데이터 먼저 확인해야 해
			//entry의 set을 생성하고 Iterator를 꺼내서 키/밸류 하나씩 확인하자
			Set<Entry<String, Integer>> rankSet =
					                           rankMap.entrySet();
			
			Iterator<Entry<String, Integer>> it = rankSet.iterator();
			
			//d여기 이름이랑 점수랑 카운트 셀 변수가 피료행
			
			int max = 0;	
			while(it.hasNext()) {
				Entry<String, Integer> ent = it.next();
				

				for(int i = 0; i < rankMap.size(); i++) {
					max = 0;
				if(ent.getValue() == max) {

				}
			}
				
	}
			System.out.println(max);

}
}
