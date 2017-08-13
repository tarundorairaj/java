public class Tv {
	private int state;
	private int channel;
	private int volume;
	
	public Tv()
	{
		channel = 1;
		state = 1;
		volume = 100000;
	}
	
	public Tv(int initialChannel, int initialState, int initialVolume)
	{
		channel = initialChannel;
		state = initialState;
		volume = initialVolume;
	}
	
	public void changeChannel(int channelNumber)
	{
		channel = channelNumber;
	}
	
	public void changeVolume(int volumeLevel)
	{
		volume = volumeLevel;
	}
	
	public int getChannel()
	{
		return channel;
	}
	public int getState()
	{
		return state;
	}
	public int getVolume()
	{
		return volume;
	}
	
	public void turnOff()
	{
		state = 0;
	}
	
	public void turnOn()
	{
		state = 1;
	}
}
