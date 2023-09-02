package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class class1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		WebElement link_home=driver.findElement(By.linkText("Home"));
		Actions act = new Actions(driver);
		Action mouseOverHome=act
		        .moveToElement(link_home)
	            .contextClick()
		        .build();
		        mouseOverHome.perform();//for action of mouse
		        WebElement home=driver.findElement(By.xpath("//input[@type='text']"));
		        home.sendKeys("deepak");
		        Thread.sleep(2000);
		        home.sendKeys(Keys.CONTROL+"a");//selecting something on webpage
		       // home.sendKeys(Keys.CONTROL,Keys.UP);//selecting something on webpage
	
	}
	}
