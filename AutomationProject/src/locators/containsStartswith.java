package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class containsStartswith {

	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		containsStartswith s=new containsStartswith();
		s.test_search();
	}	
	public void test_search()
	{

		String path=System.getProperty("user.dir");
		String Actual_Path=path+"\\Drivers\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", Actual_Path);
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");		
		//relative Xpath with *
		
		//for this to work use www.google.com
		//driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium Automation Tutorial");
		//driver.findElement(By.xpath("//*[@name='btnK']")).submit();
		
		
		//xpath using contains
		
		WebElement vote=driver.findElement(By.xpath("//a[contains(text(),'Voting')]"));
		
		//getText(), getAttribute() applicable to all web elements
		System.out.println(vote.getText());
		System.out.println(vote.getAttribute("href"));
		
		vote.click();
		
		WebElement span_tag = driver.findElement(By.xpath("//span[starts-with(text(),'Each state')]"));
		System.out.println(span_tag.getText());
	}
}
