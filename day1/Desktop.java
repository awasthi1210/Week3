package day1;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Desktop size is 32 inch");
	}
	
	public void method1() {
     	desktopSize();
		super.computerModel();
	}
	
public static void main(String[]args) {
	Desktop desk = new Desktop();
	desk.method1();
}
}
