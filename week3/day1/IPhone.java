package week3.day1;

public class IPhone extends Ios {
	public void startApp()
	{
	System.out.println("It is a method of Ios but overrided in IPhone Class");
	}
	public void makeCall() {
		System.out.println("Making call of Iphone");
	}
public void sendSMS() {
	System.out.println("SMS of IPhone");
}
public static void main(String[] args) {
	IPhone phn=new IPhone();
	phn.startApp();
	phn.makeCall();
	phn.sendSMS();
}
}
