package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
	
	int num=34343;
	int lastdi,sum=0,a;
	a=num;
	/*for (a=num; a>0;a=a/10) {
		lastdi=a%10;
		sum=(sum*10)+lastdi;
		a=a/10;
	}*/
	while(a>0) {
		lastdi=a%10;
		sum=(sum*10)+lastdi;
		a=a/10;
	}
	System.out.println(a);
	System.out.println(sum);
    if (sum==num) {
		System.out.println("it is a palindrome");
	} else {
System.out.println("not a palindrome");
	}

}}
