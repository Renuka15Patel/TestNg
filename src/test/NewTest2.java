package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test(groups="yahoo")
public class NewTest2 {
	private WebDriver driver;
	
	  @Test
	  public void f() {
		  driver.get("https://www.yahoo.com");
		  Reporter.log("yahoo has opened.");
		  
	  }
	  @BeforeTest
	  public void beforeTest() {
		  driver = new FirefoxDriver();
		  
		  
	  }

	  @AfterTest
	  public void afterTest() {
	  }

}
