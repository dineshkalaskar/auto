package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xpath s=new Xpath();
		s.test_login();
	}	
	public void test_login()
	{
		String path=System.getProperty("user.dir");
		String Actual_Path=path+"\\Drivers\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", Actual_Path);
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Actual Xpath
		WebElement user_email = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input"));
		user_email.sendKeys("vinay.salunke@gmail.com");
		
		//Actual Xpath
		WebElement user_pwd=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div[2]/div/input"));
		user_pwd.sendKeys("Abc@123");
		
		//relative Xpath
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	}
}

