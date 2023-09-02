package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WndowHandleTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		//System.out.println(driver.getWindowHandle());//for window id in which current control
		String parentWindow=driver.getWindowHandle();
		
		WebElement elem=driver.findElement(By.xpath("//a[text()='Click Here']"));
		elem.click();
	//System.out.println(driver.getWindowHandles());//for id fpr all window which are open by automation
	for(String s:driver.getWindowHandles()) {
		if(!s.equals(parentWindow))
			driver.switchTo().window(s);
		System.out.println(driver.getTitle());
		}
	driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("deepal.sdet18@gmail.com");
	driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	driver.close();
	driver.switchTo().window(parentWindow);
	System.out.println(driver.getTitle());
	
	//IF THERE ARE MANY WINDOW OPEN IN AUTOMATION AND WANT TO SWICH ON THE WINDOW WHICH COANTAIN SPECIFIC STRING OR NAME THEN CODE WILL BE
	
	for(String s:driver.getWindowHandles()) {//THIS CODE NOT RUN BEACUSE IT WRITTEN FOR REMOBRING THE CODE
		driver.switchTo().window(s);
		if(driver.getTitle().contains("name or specific string"))
			break;
	}
	}

}