package Hebeon;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class QALogin {
	WebDriver driver = null;
	WebDriverWait wait = null;

	@Test(priority=1)
	public void Login() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtUserName']")).sendKeys("hebeonstudent");
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtPassword']")).sendKeys("Hb123!@#");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Captcha : ");
		String captcha = sc.nextLine();
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_CaptchaCodeTextBox']")).sendKeys(captcha);

		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnLogin']")).click();


	}

	@Test(priority=2)
	public void Course() throws InterruptedException{
		driver.findElement(By.xpath("//li[@id='a6']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//li//following-sibling::span[text()='109']")).click();
		driver.findElement(By.xpath("//button[@id='ContentPlaceHolder1_btnProceed']")).click();

		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='goto-NextStageLevel']")));
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='goto-NextStageLevel']")).click();
		driver.findElement(By.xpath("//span[@id='btnGo']")).click();
		

	}


	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://qatesting.hebeon.com/login.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(20000);
		driver.findElement(By.xpath("//i[@class='fa fa-user-circle-o']")).click();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		//driver.close();
	}

}
