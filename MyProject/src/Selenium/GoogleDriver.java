package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleDriver {

	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir");
		System.out.println(path);
		

		System.setProperty("webdriver.chrome.driver", path+"\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}

}
