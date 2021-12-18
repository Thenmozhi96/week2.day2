package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IntractWithImage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("//img [@src='../images/home.png']")).click();
		Thread.sleep(3000);
		driver.get("http://leafground.com/pages/Image.html");
		System.out.println("The Image is Broken "+ driver.findElement(By.xpath("//img [@src='../images/abcd.jpg']")).isEnabled());
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
	}

}
