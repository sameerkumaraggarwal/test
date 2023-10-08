package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;

public class Day2 {

	public static void main(String[] args) throws InterruptedException {
		
		    WebDriverManager.chromedriver().setup();
		    WebDriver driver = new ChromeDriver();
		
		    driver.get("https://practicetestautomation.com/practice-test-login/");
		    Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password123");
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//button[@id='submit']")).click();
	        Thread.sleep(2000);
		
	        driver.findElement(By.xpath("//li[@id='menu-item-20']/a")).click();
	        Thread.sleep(2000);
	        
	        driver.navigate().back();
	        Thread.sleep(2000);
		
	        driver.navigate().back();
	        Thread.sleep(2000);
	        
	        driver.navigate().forward();
	        Thread.sleep(2000);
	        
	        driver.navigate().refresh();
	        Thread.sleep(2000);
	        
	        driver.navigate().forward();
	        Thread.sleep(2000);
	        
	        driver.navigate().refresh();
	        Thread.sleep(2000);
	        
	        Options opt = driver.manage();
	        
	        opt.window().minimize();
	        Thread.sleep(2000);
	        
	        opt.window().setSize(new Dimension(500, 500));
	        Thread.sleep(2000);
	        
	        opt.window().maximize();
	        Thread.sleep(2000);
	        
	        driver.quit();
	        
	}

}
