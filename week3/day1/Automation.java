package week3.day1;

public class Automation extends MultipleLanguages {

	public static void main(String[] args) {
		Automation auto=new Automation();
		auto.java();
		auto.selenium();
		auto.python();
		auto.ruby();

	}


	public void selenium() {
		System.out.println("This is Selenium from TestTool Interface");
		
	}

	public void java() {
		System.out.println("This is Java from Language Inerface");
		
	}

	@Override
	public void ruby() {
	System.out.println("This is ruby from Abstract Class");
		
	}

}
