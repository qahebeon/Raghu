package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginLogout {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("raghusiddi");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("kids12&17");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@class='gb_9a gbii']")).click();
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		driver.close();
		
	}

}
