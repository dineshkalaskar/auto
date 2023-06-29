import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import alert.AlertsInSelenium;

public class demo {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AlertsInSelenium a=new AlertsInSelenium();
		a.setup_browser();
		
	}
	
	public void setup_browser()
	{
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://admin.upedge.co.in/UpEdge/collegeSignUp");			
		driver.findElement(By.xpath("//input[@id='collage_name'])").sendKeys("firs");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("email69@");
		driver.findElement(By.xpath("//input[@id=\'phone\']")).sendKeys("71478974");
		driver.findElement(By.xpath("//input[@id=\'address\']")).sendKeys("bengalore");
		driver.findElement(By.xpath("//input[@id=\'state\']")).sendKeys("raja");
		driver.findElement(By.xpath("//input[@id=\'country\']")).sendKeys("india");
		driver.findElement(By.xpath("//input[@id=\"pincode\"]")).sendKeys("1111");
		driver.findElement(By.xpath("//input[@id=\'name\']")).sendKeys("adminstar");
		driver.findElement(By.xpath("//input[@id=\'name\']")).sendKeys("mailadmin");
		driver.findElement(By.xpath("//input[@id=\'description\']")).sendKeys("mailadmin");
		WebElement residency=driver.findElement(By.xpath("//select[@id=\'residency_facility\']"));
		
		Select s=new Select(residency);
		s.selectByValue("Yes");
		driver.findElement(By.xpath("//input[@id=\'hostel_fee_for_boys\']")).sendKeys("4");
		
		driver.close();

		
		
		


		





		
		
	}

}
