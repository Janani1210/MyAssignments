package week3.day1;

public class Student extends Department {
	public void studentName() {
		System.out.println("Janani");
	}
	public void studentDept() {
		System.out.println("IT");
	}
	
	public void studentId() {
		System.out.println("12IT02");
	}
	public static void main(String[] args) {
		Student info=new Student();
		info.collegeName();
		info.collegeRank();
		info.collegeCode();
		info.departmentName();
		info.studentName();
		info.studentDept();
		info.studentId();
	}

}
