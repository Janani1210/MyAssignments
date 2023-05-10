package week3.day1;

public class Students {
 
	public void getStudentInfo(int id) {
		System.out.println("Student ID number is"+id);
	}
	public void getStudentInfo(int id1,String name) {
		System.out.println("id of student is"+"  "+id1+"  "+"Name of Student is"+"  "+name);
	}
	public void getStudentInfo(String email,long num) {
		System.out.println("Email id is"+"  "+email+"  "+"Phone Number is"+"  "+num);
		
	}
	public static void main(String[] args) {
	Students info=new Students();
	info.getStudentInfo(12);
	info.getStudentInfo(02,"Janani");
	info.getStudentInfo("jananijanu1210@gmail.com",887097099);

	}

}
