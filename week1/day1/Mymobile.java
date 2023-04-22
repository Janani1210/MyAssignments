package week1.day1;

public class Mymobile {

	public void makeCall(String mobileModel,float mobileWeight) {
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
	}
	public void sendSms(boolean isFullyCharged,int mobileCost) {
		System.out.println(isFullyCharged);
		System.out.println(mobileCost);
	}
	
	public static void main(String[] args) {
     Mymobile mob=new Mymobile();
     mob.makeCall("poco", 35f);
     mob.sendSms(false, 850);
     System.out.println("this is my phone");

	}

}
 