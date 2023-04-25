package week1.day2;

public class NegativeVal {
public static void main(String[] args) {
	int var=-40,pos;
if (var<0) {
	pos=~(var-1);
	System.out.println("Converted negative value is" +pos);
} else {
System.out.println("it is not a negative number");
}
}
}
