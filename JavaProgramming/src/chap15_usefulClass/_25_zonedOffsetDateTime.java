package chap15_usefulClass;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class _25_zonedOffsetDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime ldt = LocalDateTime.now();
		
		//zoneId 객체 생성
		ZoneId zid = ZoneId.of("asia/Seoul");
		
		//LocalDateTime에 ZoneId추가해서 ZondedDateTime 객체 생성
		ZonedDateTime zdt1 = ldt.atZone(zid);
		
		ZonedDateTime zdt2 = ZonedDateTime.now();
		//ZonedateTime 객체에 ZoneId 추가
		ZonedDateTime zdt3 = ZonedDateTime.now().withZoneSameInstant(zid);
		
		
		//ZonedDateTime -> offsetDateTime 
		OffsetDateTime odt = zdt1.toOffsetDateTime();
				
		System.out.println(zdt1);
		System.out.println(zdt2);
		System.out.println(zdt3);
		System.out.println(odt);
	}

}
