package chap15_usefulClass;

import java.util.Calendar;

public class _18_calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar today = Calendar.getInstance();
		
		String[] days = {"", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		//                ^요일은 0부터 시작하니까, 0값을 공란으로 두고 1번부터 ㅇ요일 삽입
		
		
		//hour는 오전 오후 구분 없이 0~11까지만 표현
		System.out.println("현재 시간은" + today.get(Calendar.HOUR) + ":" + today.get(Calendar.MINUTE) + ":" + today.get(Calendar.SECOND));
		//상수임 today.HOUR + ":" + today.MINUTE + ":" + today.SECOND);
		
		//hour_of_day 0~23으로 시간을 표시
		System.out.println("현재 시간은" + today.get(Calendar.HOUR_OF_DAY) + ":" + today.get(Calendar.MINUTE) + ":" + today.get(Calendar.SECOND));
		
		//오전오후 표시. 오전은 0, 오후는 1 AM_PM
		System.out.println("오전 or 오후: " + today.get(Calendar.AM_PM));
		
					
		System.out.println("올해 년도는 " + today.get(Calendar.YEAR));
		//월은 0부터 시작. 0~11, 0은 1월 11은 12월
		System.out.println("현재 월은 " + today.get(Calendar.MONTH));
		System.out.println("올해의 몇쨰주 " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이번 달의 몇째주 " + today.get(Calendar.WEEK_OF_MONTH));
		
		//요일은 1부터 시작. 1~7 1: 일요일, 7: 토요일
		System.out.println("무슨 요일: " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("무슨 요일: " + days[today.get(Calendar.DAY_OF_WEEK)]);

		
		
		//날짜지정
		Calendar oneDay = Calendar.getInstance();
		oneDay.set(2023, 0, 11, 22, 54, 32);
		
		//요일은 1부터 시작. 1~7 1: 일요일, 7: 토요일
		System.out.println("무슨 요일: " + oneDay.get(Calendar.DAY_OF_WEEK));
		System.out.println("oneDay는 " + oneDay.get(Calendar.YEAR) + "년"
									  + (oneDay.get(Calendar.MONTH) + 1) + "월"
									  + oneDay.get(Calendar.DATE) + "일");
		
		System.out.println(toString(oneDay));
				
		
		
	}

	public static String toString(Calendar cal) {
		// TODO Auto-generated method stub
		return cal.get(Calendar.YEAR) + "년"
					 + (cal.get(Calendar.MONTH) + 1) + "월"
					 + cal.get(Calendar.DATE) + "일";
	}

}
