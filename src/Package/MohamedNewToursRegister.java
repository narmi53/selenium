package Package;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;

public class MohamedNewToursRegister {

	    public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		String url="http://newtours.demoaut.com/";
		driver.get(url);
		
		
		
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstName")).sendKeys("Moe");
		Thread.sleep(2000);
		
		driver.findElement(By.name("lastName")).sendKeys("Peter");
		Thread.sleep(2000);
		
		driver.findElement(By.name("phone")).sendKeys("212-252-5252");
		Thread.sleep(2000);
		
		driver.findElement(By.name("userName")).sendKeys("Tommy22@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("address1")).sendKeys("122 Spring ave");
		Thread.sleep(2000);
		
		driver.findElement(By.name("address2")).sendKeys("Suite22");
		Thread.sleep(2000);
		
		driver.findElement(By.name("city")).sendKeys("Jamaica");
		Thread.sleep(2000);
		
		driver.findElement(By.name("state")).sendKeys("California");
		Thread.sleep(2000);
		
		driver.findElement(By.name("postalCode")).sendKeys("54565");
		Thread.sleep(2000);
		
		Select drop=new Select(driver.findElement(By.name("country")));
		drop.selectByVisibleText("SWEDEN");
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).sendKeys("Tommy53");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("2526565");
		Thread.sleep(2000);
		
		driver.findElement(By.name("confirmPassword")).sendKeys("2526565");
		Thread.sleep(2000);
		
		driver.findElement(By.name("register")).click();
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("SIGN-OFF")).click();
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();

		
		
		
		
		
		
		
		
		
		
		
	}
}
