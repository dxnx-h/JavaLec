package chap15_usefulClass;

import java.util.Calendar;
import java.util.Date;

public class _20_calDateCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2018, 5, 7);
		
		//calendar => date
		Date d1 = new Date(cal1.getTimeInMillis());
		
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d1); //date 타입을 calendar오 변경

		System.out.println(d1); //Thu Jun 07 12:45:49 GMT+09:00 2018
		System.out.println(cal2.get(Calendar.DAY_OF_WEEK) + " " //요일
							+ (cal2.get(Calendar.MONTH) + 1) + " " //월 //달은 0부터 시작. 0이 1월
							+ cal2.get(Calendar.DATE) + " "  //일자
							+ cal2.get(Calendar.HOUR_OF_DAY) + " " //시간
							+ cal2.get(Calendar.MINUTE) + " " //분
							+ cal2.get(Calendar.SECOND) + " " //초
							+ cal2.get(Calendar.YEAR)); //월
		

	}

}
