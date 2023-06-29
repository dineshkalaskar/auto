package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableInJava {

	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebTableInJava w=new WebTableInJava();
		w.setup_browser();
		w.testTable();
	}
	
	public void setup_browser()
	{
		String path=System.getProperty("user.dir");
		String Actual_Path=path+"\\Drivers\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", Actual_Path);
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");	}
	
	public void testTable()
	{
		List<WebElement> main_table = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
		for(WebElement j:main_table)
		{
			String comp_name=j.findElement(By.xpath("td[1]")).getText();
			String current_price=j.findElement(By.xpath("td[4]")).getText();
			
			System.out.println(comp_name+" : "+current_price);
		}
	}
}


