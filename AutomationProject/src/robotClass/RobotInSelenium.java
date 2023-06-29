package robotClass;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotInSelenium {
	
	WebDriver driver;
	String path="";
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		RobotInSelenium r1=new RobotInSelenium();
		r1.setup_browser();
		r1.file_upload();
	}
	
	public void setup_browser()
	{
		String path=System.getProperty("user.dir");
		String Actual_Path=path+"\\Drivers\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", Actual_Path);
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");	}
	
	
	public void file_upload() throws InterruptedException, AWTException
	{
		String file_path=path+"\\Resource\\Test.xlsx";
		WebElement input=driver.findElement(By.id("uploadfile_0"));
		
		Actions ac=new Actions(driver);
		ac.moveToElement(input).click().build().perform();
		
		StringSelection str=new StringSelection(file_path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		Thread.sleep(5000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.id("terms")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("submitbutton")).click();
	}
}