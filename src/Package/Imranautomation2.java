package Package;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.support.ui.*;

public class Imranautomation2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://www.xpr2t.com/Webobjects.html"; 
		driver.get(url);
		driver.findElement(By.id("usernameid")).sendKeys("Selenium");
		String hu=driver.findElement(By.id("Selenium")).getText();
		System.out.println("text value hu-"+hu);
		Thread.sleep(5000);
		driver.findElement(By.name("radiobutton1")).click();
		driver.findElement(By.name("checkthebox")).click();
		
		driver.manage().window().maximize();
		
		
		Select db= new Select(driver.findElement(By.id("test")));
		db.selectByVisibleText("Blue");
		
		
		Select lb=new Select(driver.findElement(By.name("dropdown")));
		lb.selectByVisibleText("audi");
		lb.selectByVisibleText("Honda crv");
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("html>body>table>tbody>tr>td>input"));
        Thread.sleep(5000);
        
        driver.findElement(By.linkText("Yahoo")).click();
        
       driver.navigate().back();
       
       driver.findElement(By.xpath("html>body>h2>center"));
       
       driver.findElement(By.xpath("html>body>table>tbody>tr>td>button")).click();
      String gghg= driver.switchTo().alert().getText();
      System.out.println("alert text value is-"+gghg);
      
      driver.switchTo().alert().accept();
     String text=driver.findElement(By.xpath("html>body>table>tbody>tr>td")).getText();
      System.out.println("text");
      
      
      driver.close();
		driver.quit();
      
       
       
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
