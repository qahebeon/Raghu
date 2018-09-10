package Hebeon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import DataproviderAnnotation.DataproviderMultipledata;


public class Clanguage {

	WebDriver driver = null;
	Properties p = null;

	@Test(priority=1, dataProviderClass = DataproviderMultipledata.class, dataProvider = "hebeondata")
	public void login(String uname, String pwd) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtUserName']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtPassword']")).sendKeys(pwd);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnLogin']")).click();

	}
	
	@Test(priority=2)
	public void languageC() throws InterruptedException{
		driver.findElement(By.xpath("//span[@title='There are 32 Chapters']")).click();
		driver.findElement(By.xpath("//li[@id='L1-CalculatorProject']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//li[text()='S1']")).click();
		driver.findElement(By.xpath("//a[@id='btnPrev']")).click();
		
		
		
	}
	
	@BeforeTest
	public void beforeTest() throws FileNotFoundException, IOException {
		p = new Properties();
		p.load(new FileInputStream(System.getProperty("user.dir")+"/Configs/hebeon.properties"));
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


	}
	
	@AfterTest
	public void aftertest(){
		
		//driver.findElement(By.xpath("//i[@class='fa fa-user-circle-o']")).click();
		//driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	
		
	}

}
