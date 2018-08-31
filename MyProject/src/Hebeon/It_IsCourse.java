package Hebeon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class It_IsCourse {
	WebDriver driver = null;
	WebDriverWait wait = null;
	Properties prop = null;

	@Test(priority=1)
	public void login() throws InterruptedException{
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtUserName']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtPassword']")).sendKeys(prop.getProperty("password"));
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnLogin']")).click();
		

	}
	
	@Test(priority=2)
	public void course() throws InterruptedException{
		driver.findElement(By.xpath("//span[@title='There are 6 Chapters']")).click();
		driver.findElement(By.xpath("//li[@id='L1-Computers']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Start Exam']")));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Start Exam']")).click();
		
	}

	@BeforeTest
	public void openurl() throws FileNotFoundException, IOException{
		prop = new Properties();
		prop.load(new FileInputStream(System.getProperty("user.dir")+"/Configs/hebeon.properties"));
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 20);



	}

	@AfterTest
	public void closeurl(){

	}

}
