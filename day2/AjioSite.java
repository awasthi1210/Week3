package day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioSite {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("Bags", Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(text);
		List<WebElement> List_of_Brands = driver.findElements(By.xpath("//div[@class='brand']"));
		for (int i = 0; i < List_of_Brands.size(); i++) {
			System.out.println(List_of_Brands.get(i).getText());
		}

		// List the name of bags
		List<WebElement> List_Of_Bags = driver.findElements(By.xpath("//div[@class='nameCls']"));
		for (WebElement ele : List_Of_Bags) {
			System.out.println(ele.getText());
		}
		
		driver.quit();
	}
	
	
}
