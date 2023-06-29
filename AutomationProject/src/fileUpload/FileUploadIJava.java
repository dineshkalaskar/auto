package fileUpload;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadIJava {

	WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FileUploadIJava f=new FileUploadIJava();
		f.setup_browser();
		f.file_upload();
	}
	

	public void setup_browser()
	{
		String path=System.getProperty("user.dir");
		String Actual_Path=path+"\\Drivers\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", Actual_Path);
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");	}
	
	
	public void file_upload() throws InterruptedException
	{
		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\ip-slim-3\\Desktop\\a.jpg");
		driver.findElement(By.id("terms")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("submitbutton")).click();
	}

}