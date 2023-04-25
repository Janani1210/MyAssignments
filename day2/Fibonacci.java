package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		int n=8, firstnum=0, secondnum=1;
		System.out.println("fibonacci series till"+n+"terms");
for (int i = 1; i <=n; ++i) {
	System.out.println(firstnum);
	int sum=firstnum+secondnum;
	firstnum=secondnum;
	secondnum=sum;
}
	}

}
