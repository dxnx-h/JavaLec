package chap16_collectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import chap06_class.Car.Car;

public class _02_arrayListWithType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//타입을 지정한 ArrayList 선언
		//선언부와 생성자 부분에 <>를 통해 타입 지정
		ArrayList<String> strArrLost = new ArrayList<String>();
		
		/*
		 [
		           {
		             company: "현대",
		             model: "아반떼",
		             price: 3000
		             메소드
		            },
		             {
		             company: "기아",
		             model: "K7",
		             price: 4000
		             메소드
		 ]
		 */
		

		   ArrayList<Car> carArrayList = new ArrayList<Car>(); //6챕터에 있는 car를 끌고옴!!!!!!
		   
		   Car car = new Car("현대", "아반떼", "검정", 3000); // carArrayList.add(Car);
		   
		   Car car2 = new Car("기아", "k3", "검정", 4000); // carArrayList.add(Car2);
		   
		   for(int i = 0; i < carArrayList.size(); i++) { System.out.println(
		   carArrayList.get(i)); carArrayList.get(i).carInfo(); }
	
		
		//mapList는 위의 객체 ArrayList와 형태는 같으나 메소드는 추가할 수 없다
		//             키의형대, value의 형태
		ArrayList<Map<String, String>> mapList = new ArrayList<Map<String, String>>();
		for(int i = 0; i < 10; i++)  {
			Map<String, String> map = new HashMap<String, String>();
			
			map.put("company", "현대");
			map.put("model", "아반떼" + (10 + i));
			map.put("price", "3000");
			
			mapList.add(map);  //map이 10개가 들어간 맵 생성
			
		}
		for(int i = 0; i < mapList.size(); i++) {
			System.out.println(mapList.get(i));
		}
		
		//인터페이스를 이용해서 다형성 구현도 가능
		List<String> list = new ArrayList<String>();
	}

}
