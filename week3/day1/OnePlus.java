package week3.day1;

public class OnePlus extends AndroidTv implements Android {

	public static void main(String[] args) {
		OnePlus one=new OnePlus();
		one.openApp();
one.playVideo();
	}

	public void playVideo() {
	System.out.println("This is from Interface");
		
	}

}
