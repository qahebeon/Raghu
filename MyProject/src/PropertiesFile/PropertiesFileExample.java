package PropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PropertiesFileExample {
	WebDriver driver = null;
	Properties p = null;

	@Test
	public void login() throws InterruptedException{
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(p.getProperty("password"));
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}

	@BeforeTest
	public void beforetest() throws FileNotFoundException, IOException{
		p = new Properties();
		p.load(new FileInputStream(System.getProperty("user.dir")+"/Configs/Config.properties"));
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
	}


	@AfterTest
	public void aftertest(){
		driver.findElement(By.xpath("//span[@class='gb_9a gbii']")).click();
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();

	}
}
