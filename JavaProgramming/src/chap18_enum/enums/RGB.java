package chap18_enum.enums;

public enum RGB {
	//상수명 RED("red",255, 0, 0) 
	//GREEN(, BLUE 
	
	RED("red", 255, 0, 0), 
	GREEN("green", 0, 255, 0), 
	BLUE("blue", 0, 0, 255);

	private String rgbName;
	private int rgbValr;
	private int rgbValg;
	private int rgbValv;
	
	RGB(String rgbName, int rgbValr, int rgbValg, int rgbValv) {
		this.rgbName = rgbName;
		this.rgbValr = rgbValr;
		this.rgbValg = rgbValg;
		this.rgbValv = rgbValv;
	}

	public String getRgbName() {
		return rgbName;
	}

	public void setRgbName(String rgbName) {
		this.rgbName = rgbName;
	}

	public int getRgbValr() {
		return rgbValr;
	}

	public void setRgbValr(int rgbValr) {
		this.rgbValr = rgbValr;
	}

	public int getRgbValg() {
		return rgbValg;
	}

	public void setRgbValg(int rgbValg) {
		this.rgbValg = rgbValg;
	}

	public int getRgbValv() {
		return rgbValv;
	}

	public void setRgbValv(int rgbValv) {
		this.rgbValv = rgbValv;
	}
	
	
}

