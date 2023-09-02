package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox {
	public static void main(String [] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.easemytrip.com/");
//		WebElement radioBox=driver.findElement(By.id("chkSeniorCitizen"));
//		radioBox.click();
//		Thread.sleep(2000);
//		WebElement radioBox1=driver.findElement(By.id("chkDoctors"));
//		radioBox1.click();
		
		
		//FOR CHECK BOX
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html ");
		WebElement checkBox=driver.findElement(By.id("vfb-6-2"));
//		checkBox.click();
//		if(checkBox.isSelected()) {
//			System.out.println("check box is toggle");
//			}
//		else{
//			System.out.println("check box is not toggle");
//		}
		
		for(int i =0; i<2;i++) {
			checkBox.click();
			System.out.println("check box is toggle"+" "+checkBox.isSelected());
		}
		}

}
