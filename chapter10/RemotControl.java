package day10;

public interface RemotControl {
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	int MAXVOL = 10;
	int MINVOL = 0;

}
