package week1.day1;

public class Mobile {
public void sendSms()
{
	System.out.println("allow me to send sms");}
protected void allowVoicecall() 
{
	System.out.println("allow only my family to do voice call");}
private void takeVideo()
{
	System.out.println("allow me to take video");}
public static void main(String[] args) {
	Mobile obj=new Mobile();
	obj.allowVoicecall();
	obj.takeVideo();
	obj.sendSms();
	System.out.println("assignment no.1");
}
}
