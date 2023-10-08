package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG {
	
	ChromeDriver driver;
	
	@Test(priority = 1)
	public void LogIn_Page()
	{
		driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority = 2)
	public void User_LogIn() 
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test(priority = 3)
	public void PIM_Page()
	{
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[2]/a/span")).click();
	}
	
	@Test(priority = 4)
	public void Find_User() throws InterruptedException 
	{
        WebElement hintsInputElement1 = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
        hintsInputElement1.sendKeys("cec");
        Thread.sleep(2000);
        hintsInputElement1.sendKeys(Keys.DOWN, Keys.ENTER);
        
        driver.findElement(By.xpath("//*[contains(text(),'Employee Id')]//following::input")).sendKeys("0204");
        Thread.sleep(2000);
        
        WebElement Employment_Status = driver.findElement(By.xpath("//*[contains(text(),'Employment Status')]//following::div[4]"));
        Employment_Status.click();
        Employment_Status.sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER);
        
        WebElement hintsInputElement2 = driver.findElement(By.xpath("//*[contains(text(),'Supervisor Name')]//following::input[1]"));
        hintsInputElement2.sendKeys("Fio");
        Thread.sleep(2000);
        hintsInputElement2.sendKeys(Keys.DOWN, Keys.ENTER);
        
        WebElement Job_Title = driver.findElement(By.xpath("//*[contains(text(),'Job Title')]//following::div[4]"));
        Job_Title.click();
        for (int i = 0; i < 22; i++) 
        {
        	Job_Title.sendKeys(Keys.DOWN);
        }
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        driver.findElement(By.xpath("//*[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']")).click();
	}

}
