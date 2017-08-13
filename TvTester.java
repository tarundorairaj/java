public class TvTester {
	public static void main(String[] args) {
		Tv myTv = new Tv(1000, 1, 999999);
		System.out.println(myTv.getState());
		System.out.println(myTv.getVolume());
		System.out.println(myTv.getChannel());
		myTv.changeChannel(100);
		myTv.changeVolume(1);
		myTv.turnOff();
		System.out.println(myTv.getState());
		System.out.println(myTv.getVolume());
		System.out.println(myTv.getChannel());
		myTv.turnOn();
		System.out.println(myTv.getState());
		System.out.println(myTv.getVolume());
		System.out.println(myTv.getChannel());
		Tv otherTv = new Tv();
		System.out.println(otherTv.getState());
		System.out.println(otherTv.getVolume());
		System.out.println(otherTv.getChannel());
		
	}
}