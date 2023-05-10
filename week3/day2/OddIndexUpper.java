package week3.day2;

public class OddIndexUpper {

	public static void main(String[] args) {
		String test = "changeme";
		String upper="";
		char[] charArray = test.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(i%2==0) {
			upper=upper+Character.toUpperCase(charArray[i]);
		}
			else {
				upper=upper+Character.toLowerCase(charArray[i]);
			}
	}
System.out.println(upper);
}
}