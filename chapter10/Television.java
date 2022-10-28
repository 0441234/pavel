package day10;

public class Television implements RemotControl {
	private int volume;
	
    @Override
	public void turnOn() {
		System.out.println("tv를 켭니다");
	}
    @Override
	public void turnOff() {
		System.out.println("tv를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemotControl.MAXVOL) {
			this.volume = RemotControl.MAXVOL;
		} else if (volume < RemotControl.MINVOL) {
			this.volume = RemotControl.MINVOL;
		} else
			this.volume = volume;
		System.out.println("tv" + this.volume);

	}
}
