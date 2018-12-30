package TelevisionPack;

public class TelevisionClass {
	private boolean state = false;
	private int currentChannel = 01;
	private int volume;

	public boolean setState(boolean turnOnOff) // set the state of television
	{
		this.state = turnOnOff;
		return this.state;
	}

	public int changeVolume(int volume) {
		if (this.state == true) { // When state of Television is true(ON) then
									// only Volume can be changed
			this.volume = (this.volume + volume) < 0 ? 0
					: (this.volume + volume);
			return this.volume;
		}
		return -1;
	}

	public int getVolume() {
		if (this.state == true) {
			return this.volume;
		}
		return -1;
	}

	public int changeChannel(int channel) {
		if (this.state == true) // When state of Television is true(ON) then
								// only Channel can be changed
		{
			if (channel < 300) {
				this.currentChannel = channel;
			}
			return this.currentChannel;
		}
		return -1;
	}

	public int getCurrentChannel() {
		if (this.state == true) {
			return this.currentChannel;
		}
		return -1;
	}
}