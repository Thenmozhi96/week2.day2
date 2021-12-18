package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlaywithLink {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
		Thread.sleep(6000);
		driver.get("http://leafground.com/pages/Link.html");
		System.out.println(driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']")).getAttribute("href"));
		String link1=driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).getAttribute("href");
		driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).click();
		if(link1.contains("error"))
		{
			System.out.println("link is Broken");
		}
		else
		{
			System.out.println("link is not broken");
		}
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.xpath("//a[text()='How many links are available in this page?']")).click();
		
	}

}
