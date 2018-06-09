package Package;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.support.ui.*;

public class Imranautomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();


 String url= "http://www.xpr2t.com/Webobjects.html"; 
 driver.get(url);
 driver.manage().window().maximize();
 driver.findElement(By.id("usernameid")).sendKeys("Selenium");
 String p=driver.findElement(By.id("usernameid")).getText();
 System.out.println("String value is p"+p);
 Thread.sleep(5000);
 driver.findElement(By.name("radiobutton1")).click();
 Thread.sleep(5000);
 
 driver.close();
 driver.quit();
 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}

	private static void keys(String string) {
		// TODO Auto-generated method stub
		
	}

	private static void Keys(String string) {
		// TODO Auto-generated method stub
		
	}
}