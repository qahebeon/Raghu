
package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAc {
	WebDriver driver = null;

	public void openUrl(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\Desktop\\EclipseWorkspace\\MyProject\\Drivers\\geckodriver.exe" );
		driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
	}

	public void createAc(){
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("siddi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("rithvik");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9908955542");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("bornin2017");
		new Select(driver.findElement(By.xpath("//select[@id='day']"))).selectByIndex(12);
		new Select(driver.findElement(By.xpath("//select[@id='month']"))).selectByValue("10");
		new Select(driver.findElement(By.xpath("//select[@id='year']"))).selectByVisibleText("2000");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}


	public static void main(String[] args) {

		FacebookAc f = new FacebookAc();
		f.openUrl();
		f.createAc();

	}

}
