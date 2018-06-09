package Package;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;

public class browsertest {
	
public static void main(String[]args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	//System.setProperty("webdriver.gecko.driver","C:\\firefoxdriver\\geckodriver.exe");
	//WebDriver driver=new FirefoxDriver();
	
	
	
	 String url ="http://www.xpr2t.com/Webobjects.html";
	 //Open the application in the browser
	  driver.get(url);
}
}