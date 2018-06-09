package Package;
  
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;


public class MohamedMouseMovementAssaignment {
	
	
	

   

	public static void main(String[] args) throws InterruptedException {
		
	
	
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	String url="https://www.bankrate.com/mortgage.aspx?ic_id=home_smart-spending_mortgages_globalnav";
	driver.get(url);
	
	
	Actions text= new Actions(driver);
	text.moveToElement(driver.findElement(By.linkText("BANKING"))).build().perform();
	Thread.sleep(3000);
	
	driver.findElement(By.linkText("Savings calculator")).click();
	Thread.sleep(5000);

	
	String text1 = driver.findElement(By.xpath("html/body/div[4]/div[1]/div/h1")).getText();
	
	System.out.println(text1);
	
	driver.close();
	driver.quit();
		
}
}