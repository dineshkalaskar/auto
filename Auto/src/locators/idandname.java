package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class idandname {

	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		idandname s=new idandname();
		s.gecko_browser();
	}	
	public void gecko_browser()
	{


			String path=System.getProperty("user.dir");
			String Actual_Path=path+"\\Drivers\\geckodriver.exe";
			
			System.setProperty("webdriver.gecko.driver", Actual_Path);
			driver=new FirefoxDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");		

		WebElement user_email = driver.findElement(By.id("email"));
		user_email.sendKeys("vinay.salunke@gmail.com");
		
		WebElement user_pass=driver.findElement(By.id("pass"));
		user_pass.sendKeys("123456");
		
		
		WebElement btn_login=driver.findElement(By.name("login"));
		//btn_login.click();
		btn_login.submit();
		
		
		
	}
}

