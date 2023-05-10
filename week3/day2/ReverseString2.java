package week3.day2;

import java.util.Iterator;

public class ReverseString2 {

	public static void main(String[] args) {
	String input="Amazon development centre, Chennai";
	
	String lowerCase = input.toLowerCase();
	lowerCase.replace(",", " ");
	String[] split = lowerCase.split(" ");
	for (int i = split.length-1;i >=0 ; i--) {
		System.out.print(split[i]+ " ");
		
	}

	}

}
