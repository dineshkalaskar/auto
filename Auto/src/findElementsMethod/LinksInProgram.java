package findElementsMethod;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksInProgram {

	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinksInProgram li=new LinksInProgram();
		li.find_links();
	}
	
	public void find_links()
	{
	
		String path=System.getProperty("user.dir");
		String Actual_Path=path+"\\Drivers\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", Actual_Path);
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");	
		List<WebElement> tag = driver.findElements(By.tagName("a"));
		int n=tag.size();
		
		for(WebElement x:tag)
		{
			System.out.println(x.getText()+" : "+x.getAttribute("href"));
		}
	}
}