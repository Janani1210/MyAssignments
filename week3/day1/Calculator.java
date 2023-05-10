package week3.day1;

public class Calculator {
	public void add(int x,int y) {
		System.out.println(x+y);
	}
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public void multiple(double m,double n)
	{
		System.out.println(m*n);
	}
	public void multiple(float e,float f) {
		System.out.println(e*f);
	}
	public static void main(String[] args) {
	Calculator cal=new Calculator();
	cal.add(5, 6);
	cal.add(1, 2, 3);
	cal.multiple(589d, 8952d);
	cal.multiple(2.12, 8.5);
	

	}

}
