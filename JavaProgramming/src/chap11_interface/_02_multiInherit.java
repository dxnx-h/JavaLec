package chap11_interface;

import chap11_interface.multiinherit.MultiflexStadium;
import chap11_interface.multiinherit.SeoulMulitflexStadium;

public class _02_multiInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiflexStadium ms = new SeoulMulitflexStadium();
		
		ms.getSportsSchedule(3);
		int sportsTicket = ms.getSportsticketPrice(2);
		ms.getSupportersItem(2);

	}

}

