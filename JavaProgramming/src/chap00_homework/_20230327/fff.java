package chap00_homework._20230327;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class fff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> rankMap = new HashMap<String, Integer>();

		rankMap.put("가", 85);
		rankMap.put("나", 75);
		rankMap.put("다", 35);
		rankMap.put("라", 75);

		Set<Entry<String, Integer>> rankSet = rankMap.entrySet();
		Iterator<Entry<String, Integer>> it = rankSet.iterator();

		int max = Integer.MIN_VALUE;
		while (it.hasNext()) {
		    Entry<String, Integer> ent = it.next();
		    int score = ent.getValue();
		    if (score > max) {
		        max = score;
		    }
		}
		System.out.println(max);
	}
}