package chap15_usefulClass;

import java.util.Calendar;

public class _19_differeceOfTwoDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar d1 = Calendar.getInstance();
		Calendar d2 = Calendar.getInstance();
		
		d2.set(2011, 2, 11);
		
		//getTimeInMill(): long타입으로 지정된 날짜를 밀리세컨드로 리턴
		
		long diff = d1.getTimeInMillis() - d2.getTimeInMillis();
		System.out.println("d2부터 d1까지 " + (diff / 1000) + "초가 지났습니다.");
		System.out.println("d2부터 d1까지 " + (diff / (1000 * 60)) + "분이 지났습니다.");
		System.out.println("d2부터 d1까지 " + (diff / (1000 * 60 * 60)) + "시간이 지났습니다.");
		System.out.println("d2부터 d1까지 " + (diff / (1000 * 60 * 60 * 24)) + "일이 지났습니다.");
		System.out.println("d2부터 d1까지 " + (diff / 1000 / 60 / 60 / 24 / 30) + "달이 지났습니다.");
		//                                          ^곱해서 나누면 long의 범위를 넘어설 수 있음. 개별나눔 ㄱㄱ
		//                                            아님 1개만 long형으로 지정하면 댐(long)1000*60*60*24*30
		System.out.println("d2부터 d1까지 " + (diff / ((long)1000 * 60 * 60 * 24 * 30 * 12)) + "년이 지났습니다.");
		
		long year = (diff / ((long)1000 * 60 * 60 * 24 * 30 * 12));
		diff = diff % ((long)1000 * 60 * 60 * 24 * 30 * 12);
		long mon = (diff / 1000 / 60 / 60 / 24 / 30);
		diff = diff % ((long)1000 * 60 * 60 * 24 * 30);
		long day = (diff / ((long)1000 * 60 * 60 * 24));
		diff = diff % ((long)1000 * 60 * 60 * 24);
		long hour = (diff / ((long)1000 * 60 * 60));
		diff =  diff % ((long)1000 * 60 * 60);
		long min = (diff / ((long)1000* 60));
		diff = diff % ((long)1000 * 60);
		long sec = (diff / (long)1000);
		/*
		long year = (diff / ((long)1000 * 60 * 60 * 24 * 30 * 12));
		long mon = (diff / 1000 / 60 / 60 / 24 / 30);
		long day = (diff / (1000 * 60 * 60 * 24));
		long hour = (diff / (1000 * 60 * 60));
		long min = (diff / (1000 * 60));
		long sec = (diff / 1000);
		*/
		
		System.out.println( year + "년 " + mon + "달 " + day + "며칠 "
							+  hour + "시간 " + min + "분 " + sec + "초가 지났습니다.");
	
	}

}
