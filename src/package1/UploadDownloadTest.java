package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadDownloadTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		WebElement upload=driver.findElement(By.name("uploadfile_0"));
		upload.sendKeys("C:\\Users\\lenovo\\Desktop");
		driver.findElement(By.name("terms")).click();
		driver.findElement(By.name("send")).click();
	}

}
