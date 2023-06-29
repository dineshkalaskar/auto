package alert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AlertsInSelenium {

	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		AlertsInSelenium a=new AlertsInSelenium();
		a.setup_browser();
		a.testAlert();
	}
	
	public void setup_browser()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\Steve\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");	}
	
	
	public void testAlert() throws InterruptedException
	{
		
		//alert 1
		driver.findElement(By.id("alertButton")).click();
		
		Alert a1=driver.switchTo().alert();
		Thread.sleep(5000);
		
		System.out.println(a1.getText());
		a1.accept();
		
		//alert 2 Timer alert
		driver.findElement(By.id("timerAlertButton")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		a1=driver.switchTo().alert();
		
		Thread.sleep(5000);
		System.out.println(a1.getText());
		a1.accept();
		
		//alert 3 Ok Cancel Button
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(5000);
		
		a1=driver.switchTo().alert();
		a1.dismiss();
			
		WebElement result=driver.findElement(By.id("confirmResult"));
		System.out.println(result.getText());
		
		//alert 4 Sending Text in TextField of Alert
		
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(5000);
		
		a1=driver.switchTo().alert();
		a1.sendKeys("dinesh kalaskar");
		a1.accept();
		
		WebElement result1=driver.findElement(By.id("promptResult"));
		System.out.println(result1.getText());
	}
}