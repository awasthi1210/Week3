package day1;

public class Student extends Department{
	public void studentName()  {
		System.out.println("Student Name: Mona Awasthi");
	}
	public void studentDept() {
		System.out.println("Student Department : Information Technology");
	}
	public void studentId() {
		System.out.println("Student Id : 1206E570");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student obj= new Student();
    //obj of student class
    obj.studentName();
    obj.studentDept();
    obj.studentId();
    System.out.println("--------------------------------");
    //method of parent class (Department)
     obj.deptName();
     
     //method og grandparent class without extending it via department class and as an example of multilevel inheritance
     System.out.println("--------------------------------");
     obj.collegeName();
     obj.collegeCode();
     obj.collegeRank();
	}

}
