package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\lenovo\\Desktop\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		//driver.switchTo().frame("frame1");//both MATHED SAME FOR SWT IN FRame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));
		WebElement home=driver.findElement(By.id("sampleHeading"));
		System.out.println(home.getText());
		driver.switchTo().defaultContent();//use to return web page if multiple frame present
		driver.switchTo().parentFrame();//use to return parent frame in case fo multiple frame
		
	}
}
