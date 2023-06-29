package firstprogram;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String path=System.getProperty("user.dir");
			String Actual_Path=path+"\\Drivers\\geckodriver.exe";
			
			System.setProperty("webdriver.gecko.driver", Actual_Path);
			WebDriver driver=new FirefoxDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");		
		
		
		String title=driver.getTitle();
		System.out.println(title);
		
	
	}
}