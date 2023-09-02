package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownselect {
	public static void main (String[] ags) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Downloads\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Select select=new Select(driver.findElement(By.name("country")));
		select.selectByVisibleText("INDIA");
//		
//		driver.get("http://jsbin.com/osebed/2");
//		Select sel=new Select(driver.findElement(By.id("fruits")));
//		sel.selectByIndex(0);
//		sel.selectByVisibleText("apple");
		
//		driver.get("https://www.easemytrip.com/");
//		driver.manage().window().maximize();
//		WebElement elem =driver.findElement(By.xpath("//a[text()='Charters']"));
//		elem.click();
//		Select sel=new Select(driver.findElement(By.className("//form-control open-select")));
//		sel.selectByIndex(2);
		
	}

}
