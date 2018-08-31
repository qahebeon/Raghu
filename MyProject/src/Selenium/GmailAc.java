package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailAc {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("siddi");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("sathvik");
		driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("siddisaisathvik");
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("birth2012");
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("birth2012");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
	}

}
