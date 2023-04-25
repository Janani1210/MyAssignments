package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int i=13;
		boolean flag=false;
		
for (int j = 2; j<i; ++j) {
	if(j%i==0) {
		flag=true;
		break;
	}
}
	if(!flag) 
		System.out.println("it is a prime number");
	else
		System.out.println("it is not a prime number");

	}

}
