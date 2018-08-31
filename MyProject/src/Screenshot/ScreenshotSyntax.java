package Screenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScreenshotSyntax {
	
	@Test
	public static void captureScreen(){
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://qatesting.hebeon.com");
		//File f = (TakesScreenshot)driver).
	}

}
