package television;

public class Television {
	private int currentChannel;
	private int currentVolume;
	private String currentState;
	
	public int getCurentChannel() {
		return currentChannel;
	}
	public void setCurentChannel(int curentChannel) {
		this.currentChannel = curentChannel;
	}
	public int getCurrentVloume() {
		return currentVolume;
	}
	public void setCurrentVolume(int currentVolume) {
		this.currentVolume = currentVolume;
	}
	public String getCurrentState() {
		return currentState;
	}
	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}
	public int increaseVolume(int increaseVolume){
		currentVolume=currentVolume+increaseVolume;
		return increaseVolume;
	}
	public int decreaseVolume(int decreaseVolume)
	{
		currentVolume=currentVolume-decreaseVolume;
		return decreaseVolume;
	}
	public int changeChannel(int changeChannel)
	{
		currentChannel=changeChannel;
		return changeChannel;
	}
	public void changeState(String state)
	{
		currentState=state;
		if(state.equals("on"))
		{
			System.out.println("tv is switched on");
		}
		else if(state.equals("off"))
		{
			System.out.println("tv is switched off");
			System.exit(0);
		}
		else
		{
			System.out.println("enter valid state");
		}
	}
}
