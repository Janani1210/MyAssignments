package week3.day2;

public class FindCharCount {

	public static void main(String[] args) {
	String input="TestLeaf";
	int count=0;
	char[] ch = input.toCharArray();
	char test='e';
	for (int i = 0; i < ch.length; i++) {
		if(ch[i]==test) {
			count++;
		}
		
	}
	System.out.println("Total Count of e in String is:"+count);

	}

}
