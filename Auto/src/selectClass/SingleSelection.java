package selectClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelection {

	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		SingleSelection s=new SingleSelection();
		s.single_select();
	}
	
	public void single_select() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ip-slim-3\\eclipse-workspace\\DCTC DEC-21\\April 22 Automation\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement sel_country = driver.findElement(By.name("country"));
		Select s1=new Select(sel_country);
		
		Thread.sleep(3000);
		s1.selectByValue("ARGENTINA");
		
		Thread.sleep(3000);
		s1.selectByIndex(2);
		
		Thread.sleep(3000);
		s1.selectByVisibleText("ANTARCTICA");
	}
}