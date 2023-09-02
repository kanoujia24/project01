package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/");
	
	WebElement homeAction=driver.findElement(By.xpath("//a[text()='Home']"));
	
	Actions homeMove=new Actions(driver);
	
	Action homeclick= homeMove
			.moveToElement(homeAction)
			.contextClick()
			.build();
			homeclick.perform();
			
			WebElement name=driver.findElement(By.name("userName"));
			name.sendKeys("deepak");
			Thread.sleep(2000);
			
			name.sendKeys(Keys.SHIFT,Keys.UP);
			Thread.sleep(2000);
			name.sendKeys(Keys.SHIFT,Keys.BACK_SPACE);
			Thread.sleep(2000);
			
			name.sendKeys("kanoujia");
			
			
	}
}
	
       