package radioCheckbox;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonInSelenium {

	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButtonInSelenium r=new RadioButtonInSelenium();
		r.find_radio();
	}
	
	public void find_radio()
	{
		String path=System.getProperty("user.dir");
		String Actual_Path=path+"\\Drivers\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", Actual_Path);
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		WebElement radio_b1=driver.findElement(By.xpath("//input[@value='Option 1']"));
		radio_b1.click();
		System.out.println("Radio Button 1:"+radio_b1.isSelected());
		
		WebElement radio_b2=driver.findElement(By.xpath("//input[@value='Option 2']"));
		radio_b2.click();
		
		System.out.println("Radio Button 1:"+radio_b1.isSelected());
		System.out.println("Radio Button 2:"+radio_b2.isSelected());
		
		System.out.println("Enabled or not R1 :"+radio_b1.isEnabled());
		System.out.println("Enabled or not R2 :"+radio_b2.isEnabled());
	}

}