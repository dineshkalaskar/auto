package radioCheckbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckButtonInSelenium {

	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CheckButtonInSelenium r=new CheckButtonInSelenium();
		r.find_check();
	}
	
	public void find_check() throws InterruptedException
	{
		String path=System.getProperty("user.dir");
		String Actual_Path=path+"\\Drivers\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", Actual_Path);
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		Thread.sleep(3000);
		
		WebElement check_b1=driver.findElement(By.xpath("//input[@value='red']"));
		check_b1.click();
		System.out.println("check Button 1:"+check_b1.isSelected());
		
		Thread.sleep(3000);
		WebElement check_b2=driver.findElement(By.xpath("//input[@value='orange']"));
		check_b2.click();
		
		System.out.println("check Button 1:"+check_b1.isSelected());
		System.out.println("check Button 2:"+check_b2.isSelected());
		
		System.out.println("Enabled or not R1 :"+check_b1.isEnabled());
		System.out.println("Enabled or not R2 :"+check_b2.isEnabled());

		Thread.sleep(2000);
		check_b1.click();
	}

}