package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignmentthree {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12"); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		driver.close();
	}

}
