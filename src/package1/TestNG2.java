package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG2 {
  @Test
  public void tittle() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  System.out.println(driver.getTitle());
	  Assert.assertTrue(driver.getTitle().contains("hdds"),"title is not expected");
	  driver.quit();
  }
  @Test
  public void icon() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	 WebElement amazonlogo= driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
	 Assert.assertTrue(amazonlogo.isDisplayed(),"amazon logo not displyed");
	 driver.quit();
}
  @Test
  public void move() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	 WebElement logo= driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"));
	 logo.click();
	 Assert.assertTrue(logo.isDisplayed()," logo not displyed");
	 driver.quit();
}
  
}