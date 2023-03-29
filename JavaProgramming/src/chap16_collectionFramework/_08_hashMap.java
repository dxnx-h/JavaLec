package chap16_collectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import chap06_class.Car.Car;

public class _08_hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> carMap = new HashMap<String, String>();
		
		//key, value의 쌍 저장
		carMap.put("company", "현대");
		carMap.put("model", "소나타");
		carMap.put("color", "검정색");
		carMap.put("price", "4000");
		
		System.out.println(carMap);
		
		
		//<Map에 어떤 데이터가 들어있는지 확인할 때>
		// => Entry의 Set을 생성하고 Iterator를 꺼내서 Key, value를 하나씩 확인
		Set<Entry<String, String>> carSet = carMap.entrySet();
		
		//set 바로 데이터 확인하는 게 없어서 리터레이터로 변경 후 진행
		Iterator<Entry<String, String>> it = carSet.iterator();
		
		while(it.hasNext()) {
			Entry<String, String> ent = it.next();
			System.out.println(ent.getKey());
			System.out.println(ent.getValue());
		}
		
		Map<String, Object> objMap = new HashMap<String, Object>();
		
		List<Car> carList = new ArrayList<Car>();
		
		
		for(int i = 0; i < 5; i++) {
			Car car = new Car("현대", "소나타20" + (10 + i), "검정", 3000);
			
			carList.add(car); //5개가 담긴 carlist 생성 완료
		}
		
		
		objMap.put("carList", carList); //carlist까지도 map에 넣을 수 있다

		/*
		  objMap : {
		  				carList : [
 		  							car : {
 		  							
 		  							       
 		  							       }
 		  							car : {
 		  							
 		  							       
 		  							       }		  				
		  													  				
		  				]
		  
		  
		  }
		 */
		/*
		  List<objMap> : {
		  				carList : [
		  							car : {
		  							
		  							       
		  							       }
		  							car : {
		  							
		  							       
		  							       }		  				
		  													  				
		  				]
		  
		  
		  }
		 */
		
		
		
	}

}
