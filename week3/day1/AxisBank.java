package week3.day1;

public class AxisBank extends BankInfo {

	public void deposit(int a,int b) {
	System.out.println("We can deposit minimum amount in axis bank is"+" " +(a+b));
}
	public static void main(String[] args) {
		AxisBank bank=new AxisBank();
		bank.savings(500, 500);
		bank.fixed();
		bank.deposit(50,50);

	}

}
