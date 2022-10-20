package day06;

public class Television1 {
	int channel;
	int volume;
	boolean onOff;
	
	public void print() {
	    System.out.println("채널은 " + channel );}
	int getChannel() {
		return channel;
	}
	
	void setChannel(int i) {
		channel =i;
	}

public static void main(String[] args) {
	Television1 myTv = new Television1();
	myTv.setChannel(11);
	int ch = myTv.getChannel();
	System.out.println("현재 채널은 " + ch +"입니다");
}
}
