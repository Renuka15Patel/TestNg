package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test(groups="google")
public class NewTest {
	private WebDriver driver;
	
  @Test(priority=1, enabled=false)
  public void f() {
	  driver.get("https://www.google.com");
	  Reporter.log("google has opened.");
	  driver.findElement(By.linkText("Imagescdcd")).click();
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
  
  @Test(dependsOnMethods={"f",""}, priority=2)
  public void f2(){
	  driver.findElement(By.linkText("Images")).click();
	  Reporter.log("Images page has opened.");
	  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
