package Selenium;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandlingWindows {
	WebDriver driver = null;
	WebDriverWait wait = null;

	@Test
	public void test() throws InterruptedException{

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='New Browser Window']")));
		driver.findElement(By.xpath("//button[text()='New Browser Window']")).click();

		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);

		Iterator<String> i = ids.iterator();
		String mw = i.next();
		String sw = i.next();

		driver.switchTo().window(sw);
		driver.manage().window().maximize();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Enroll Your Self']")));
		driver.findElement(By.xpath("//a[text()='Enroll Your Self']")).click();
		driver.findElement(By.xpath("//input[@name='your-name']")).sendKeys("raghavendra");
		driver.findElement(By.xpath("//input[@name='your-email']")).sendKeys("raghusiddi@gmail.com");
		driver.findElement(By.xpath("//input[@name='your-mobile']")).sendKeys("9908955542");
		driver.findElement(By.xpath("//input[@name='your-country']")).sendKeys("India");
		driver.findElement(By.xpath("//textarea[@name='your-message']")).sendKeys("I am siddi from hyd");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter captcha code : ");
		String captcha = sc.nextLine();
		driver.findElement(By.xpath("//input[@name='captcha-170']")).sendKeys(captcha);
		Thread.sleep(20000);

		driver.findElement(By.xpath("//input[@value='Send']")).click();

	}

	@BeforeTest
	public void openurl(){
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 20);

	}

	@AfterTest
	public void close(){

	}

}
