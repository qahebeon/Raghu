package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class OutlookAc {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://outlook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//p/following-sibling::a[text()='Create free account']")).click();
		driver.findElement(By.xpath("//input[@name='MemberName']")).sendKeys("Mozillaraghu");
		driver.findElement(By.xpath("//input[@id='iSignupAction']")).click();
		driver.findElement(By.xpath("//input[@id='PasswordInput']")).sendKeys("outlook2018");
		driver.findElement(By.xpath("//input[@id='iSignupAction']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("siddi");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("raghu");
		driver.findElement(By.xpath("//input[@id='iSignupAction']")).click();
		new Select(driver.findElement(By.xpath("//select[@id='Country']"))).selectByVisibleText("Brazil");
		new Select(driver.findElement(By.xpath("//select[@id='BirthMonth']"))).selectByVisibleText("August");
		new Select(driver.findElement(By.xpath("//select[@id='BirthDay']"))).selectByIndex(16);
		new Select(driver.findElement(By.xpath("//select[@id='BirthYear']"))).selectByValue("1984");
		driver.findElement(By.xpath("//input[@id='iSignupAction']")).click();

		
		
		
	}

}
