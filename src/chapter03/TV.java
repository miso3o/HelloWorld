package chapter03;

public class TV {
	private int channel; //1~255
	private int volume;
	private boolean power;
	
	public TV()	{
		
	}
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public void power(boolean on) {
		this.power = on;
	}
	
	public void channel(int channel) {
		if(!power) {
			return;
		}

		if(channel < 1) {
			channel = 255;
		} else if(channel > 255){
			channel = 1;
		}

		this.channel = channel;
	}

	public void channel(boolean up) {
		channel( channel + (up ? 1 : -1) );
	}
	
	public void volume(int volume) {
		if(!power) {
			return;
		}
		this.volume = volume;
	}

	public void volume(boolean up) {
//		if(up) {
//			volume(volume + 1);
//		} else {
//			volume(volume - 1);
//		}
		volume( volume + ( up ? 1 : -1) );
	}
	
	public void status() {
		System.out.println(
			"TV[channel=" + channel + 
			", volume=" + volume + 
			", power=" + (power ? "on": "off") + "]" );
	}
}
