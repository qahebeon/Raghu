package Selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNgBeforeMethod {
  @Test
  public void Test1() {
	  System.out.println("I am Test 1");
  }
  @Test
  public void Test2(){
	  System.out.println("I am Test 2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }

}
