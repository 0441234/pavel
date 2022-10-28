package day10;

public class audio implements RemotControl {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("audio를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("audio를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemotControl.MAXVOL) {
			this.volume = RemotControl.MAXVOL;
		} else if (volume < RemotControl.MINVOL) {
			this.volume = RemotControl.MINVOL;
		} else
			this.volume = volume;
		System.out.println("현재 오디오 볼륨" + this.volume);

	}

}
