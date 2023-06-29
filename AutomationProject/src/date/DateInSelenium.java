package date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DateInSelenium {

	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DateInSelenium d=new DateInSelenium();
		d.setup_browser();
		d.test_date();
	}
	public void setup_browser()
	{
		String path=System.getProperty("user.dir");
		String Actual_Path=path+"\\Drivers\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", Actual_Path);
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/date-picker");
	}
	
	public void test_date() throws InterruptedException
	{
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		Thread.sleep(5000);
		
		WebElement sel_month=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select s1_month=new Select(sel_month);
		s1_month.selectByVisibleText("April");
		
		Thread.sleep(5000);
		WebElement sel_year=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select s1_year=new Select(sel_year);
		s1_year.selectByVisibleText("2015");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@aria-label='Choose Friday, April 17th, 2015']")).click();
	}
}

