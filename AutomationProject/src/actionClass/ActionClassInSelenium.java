package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassInSelenium {

	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ActionClassInSelenium a=new ActionClassInSelenium();
		a.setup_browser();
		a.action_test();
	}
	
	public void setup_browser()
	{
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\Steve\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
	}
	
	public void action_test()
	{
		Actions a1=new Actions(driver);
		
		WebElement btn_d=driver.findElement(By.id("doubleClickBtn"));		
		a1.moveToElement(btn_d).doubleClick().build().perform();
		
		WebElement btn_r=driver.findElement(By.id("rightClickBtn"));		
		a1.moveToElement(btn_r).contextClick().build().perform();
		
		WebElement btn_c=driver.findElement(By.xpath("//button[starts-with(text(),'Click Me')]"));
		a1.moveToElement(btn_c).click().build().perform();
		
		driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement bank=driver.findElement(By.id("credit2"));
		WebElement account=driver.findElement(By.id("bank"));
		a1.dragAndDrop(bank, account).build().perform();
		
		WebElement amt=driver.findElement(By.id("fourth"));
		WebElement amt_drop=driver.findElement(By.id("amt7"));
		a1.dragAndDrop(amt, amt_drop).build().perform();
		
		WebElement sales=driver.findElement(By.id("credit1"));
		WebElement sales_drop=driver.findElement(By.id("loan"));
		a1.dragAndDrop(sales, sales_drop).build().perform();
		
		WebElement credit=driver.findElement(By.id("amt8"));
		a1.dragAndDrop(amt, credit).build().perform();
		
	}
}


