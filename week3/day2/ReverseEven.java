package week3.day2;

public class ReverseEven {

	public static void main(String[] args) {
		String input = "I am a Software Tester";
		String rev = "";

		String[] str = input.split(" ");

		for (int i = 0; i < str.length; i++) {
			if (i % 2 != 0) {
			
				for (int j = str[i].length() - 1; j >= 0; j--) {
					rev = rev + str[i].charAt(j);
				}
			} else {
				rev = rev + str[i] + " ";
			}

		}
		rev = rev.trim();
		System.out.println( rev );
	}

}
