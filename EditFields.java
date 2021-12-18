package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("thenmozhis");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("gmail.com", Keys.TAB);
		String text=driver.findElement(By.xpath("//input[@name='username']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		Thread.sleep(6000);
		System.out.println(driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled());
		driver.close();
	}

}
