package package1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUPAlert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("4445645");
		driver.findElement(By.name("submit")).click();
		Alert alert=driver.switchTo().alert();
		String alert1=driver.switchTo().alert().getText();
		System.out.println(alert1);
		alert.accept();
		Alert alert2=driver.switchTo().alert();
		alert2.accept();
		
	}

}
