package chap11_interface.device;

public interface Tv 
				extends Display, Speaker{
	void cahngeChannel(int channel);

}
