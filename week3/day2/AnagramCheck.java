package week3.day2;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		
		String str1="stops",str2="potss";
		int len1,len2;
		boolean ver=true;
		len1=str1.length();
		len2=str2.length();
		if(len1!=len2) {
			ver=false;
		}
		else {
			char[] cs = str1.toCharArray();
			char[] cs2 = str2.toCharArray();
			Arrays.sort(cs);
			Arrays.sort(cs2);
			ver=Arrays.equals(cs, cs2);

		}
		if(ver) {
			System.out.println("Both string are equal");
		}
		else {
			System.out.println("Both are not equal");
		
		}
	}

}
