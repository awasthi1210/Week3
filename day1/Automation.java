package day1;

public class Automation extends MultipleLangauge implements Language,TestTool {

	public static void main(String[] args) {
		Automation obj = new Automation();
		obj.Java();
		obj.Selenium();
		obj.python();
		obj.Ruby();

	}

	public void Java() {
		System.out.println("Java method got implemented");
		
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium method got implemented");
	}

	@Override
	public void Ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby method got implemented");
	}

}
