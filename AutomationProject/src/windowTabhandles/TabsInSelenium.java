package windowTabhandles;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TabsInSelenium {

	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		TabsInSelenium t=new TabsInSelenium();
		t.setup_browser();
		t.test_tabs();	
	}
	public void setup_browser()
	{
		String path=System.getProperty("user.dir");
		String Actual_Path=path+"\\Drivers\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", Actual_Path);
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		}
	public void test_tabs() throws InterruptedException
	{
		String main_page=driver.getWindowHandle();
		driver.findElement(By.id("tabButton")).click();
		
		Set<String> all_tabs = driver.getWindowHandles();
		
		for(String n:all_tabs)
		{
			if(!n.equals(main_page))
			{
				driver.switchTo().window(n);
				WebElement x=driver.findElement(By.id("sampleHeading"));
				Thread.sleep(5000);
				System.out.println(x.getText());
				driver.close();
				//driver.quit();
			}
		}
	}
}