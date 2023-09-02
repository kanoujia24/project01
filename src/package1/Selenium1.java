package package1;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {
	public static void main (String [] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.easemytrip.com/");
//		driver.manage().window().maximize();
//		List<WebElement> list=driver.findElements(By.xpath("//a"));
//		for(WebElement e:list) {
//			System.out.println(e.getText());//for name
//			System.out.println(e.getAttribute("herf"));//for which page open
//		}
//		System.out.println(list.size());
		
		
//		WebElement elem=driver.findElement(By.xpath("//a[text()='Charters']"));
//		elem.click();
////		WebElement elem1=driver.findElement(By.xpath("//a[text()='Flight checkin']"));
////		elem1.click();
//		WebElement elem2=driver.findElement(By.cssSelector("input#fname"));
//		elem2.sendKeys();
		
	//USE OF CLICK/SUBMIT AND CLEAR MATHED	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
//		WebElement elem=driver.findElement(By.id("email"));
//		elem.sendKeys("8604685158");// submit the value
		//elem.clear();//delete the value
//		WebElement elem1=driver.findElement(By.id("pass"));
//		elem1.sendKeys("123lundchut");
		//elem1.clear();
//		WebElement elem2=driver.findElement(By.xpath("//button[text()='Log in']"));
//		elem2.click();
//		elem2.submit();//use submit or click mathed to submit the form into server
		
		//ABOVE CODE ALSO WRITTEN AS
		driver.findElement(By.id("email")).sendKeys("8604685158");
		driver.findElement(By.id("pass")).sendKeys("123lucnchut");
		driver.findElement(By.xpath("//button[text()='Log in']")).submit();
	}

}
