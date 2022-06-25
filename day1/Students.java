package day1;


public class Students {
public void getStudentInfo(String name) {
		System.out.println(name);
	}
public void getStudentInfo(int id) {
	System.out.println(id);
}
public void getStudentInfo(long phone) {
	System.out.println(phone);
}
public void getStudentInfo(String email, String name) {
	System.out.println(email);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Students obj = new Students();
     obj.getStudentInfo("Mona Awasthi");
     obj.getStudentInfo(122);
     obj.getStudentInfo(9667593766L);
     obj.getStudentInfo("monaparashar1229@gmail.com", " ");
     
     
	}

}
