package chap18_enum;

import chap18_enum.enums.RGB;

public class _04_useOfRGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RGB red = RGB.RED;
		RGB green = RGB.valueOf("GREEN");
		RGB blue = RGB.valueOf(RGB.class, "BLUE");
		
		
		System.out.println("빨간색은 " + red.getRgbValr() +", "
						   + red.getRgbValg() + ", "
						   +red.getRgbValv());
		
		System.out.println("초록색은 " + green.getRgbValr() +", "
				   + green.getRgbValg() + ", "
				   +green.getRgbValv());
		
		System.out.println("파란색은 " + blue.getRgbValr() +", "
				   + blue.getRgbValg() + ", "
				   + blue.getRgbValv());
	}

}
