package package1;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTest1 {
	WebDriver driver = null;
	By userNameLocator = By.id("hmenu-customer-name");
	By trendingLocator = By.xpath("//div[text()='trending']");
	By digitalContentLocator = By.xpath("//div[text()='trending']");
	By hambergrLocator = By.id("nav-hamburger-menu");
	WebDriverWait wait;
	WebDriver Driver;

	@BeforeMethod
	public void browserLunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\Desktop\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		wait = new WebDriverWait(driver, Duration.ofSeconds(120 ));//explicit wait here beacause it will same for all

	}

	@Test(priority = 5, invocationCount = 6) // invocationCount use to run any test no of time what ie required
	public void verifyTitle() {
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Shopping"), "tittle not expected");
	}

	@Test(priority = 4, description = "what is test case doing") // priority given according toypur requirment
	public void amazonLogo() throws IOException { // description attribute used to describe what is test case doing
		WebElement amazonLogo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		Assert.assertTrue(amazonLogo.isDisplayed());
		TakesScreenshot scrshot=((TakesScreenshot)driver);//take screen of the page
		File srcfile=scrshot.getScreenshotAs(OutputType.FILE);
		File dtnfile=new File("TestNG.png");
		FileUtils.copyFile(srcfile,dtnfile);
		System.out.println(" screen shot take");
		
		File srcfile1= amazonLogo.getScreenshotAs(OutputType.FILE);
		File dtnfile1=new File("TestNG.png");
		FileUtils.copyFile(srcfile1,dtnfile1);
		System.out.println(" screen shot take");

	}

	@Test(priority = 1, dependsOnMethods = "verifyTitle") // use when major test case fail then for time saving skip the
															// test case
	public void verifyUserName() {
		driver.findElement(hambergrLocator).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(userNameLocator)));//expilicit condition 
		WebElement userName = driver.findElement(userNameLocator);
		Assert.assertTrue(userName.isDisplayed());
	}

	@Test(priority = 3, enabled = false) // if u do not want to run any test case than it enabled with false
	public void verifyTrending() {
		driver.findElement(hambergrLocator).click();
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)//fluent wait 
				.withTimeout(Duration.ofSeconds(90))
				.pollingEvery(Duration.ofSeconds(5));
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(trendingLocator)));//fluent condition 
		WebElement trending = driver.findElement(trendingLocator);
		Assert.assertTrue(trending.isDisplayed(), "trending not displayed");

	}

	@Test(priority = 2, alwaysRun = true) // for run any test case in any condition ALSO use ENABLED =YES
	public void verifyDigitalContent() {
		driver.findElement(hambergrLocator).click();
		WebElement DigitalContent = driver.findElement(digitalContentLocator);
		Assert.assertTrue(DigitalContent.isDisplayed(), "digital content not displayed");

	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
