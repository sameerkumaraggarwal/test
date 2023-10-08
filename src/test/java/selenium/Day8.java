package selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8 {

	public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
        
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
        
        WebElement secondNameElement = driver.findElement(By.xpath("//*[contains(text(),'User Role')]//following::div[4]"));
        secondNameElement.click();
        secondNameElement.sendKeys(Keys.DOWN, Keys.DOWN, Keys.ENTER);
        
        WebElement hintsInputElement2 = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
        hintsInputElement2.sendKeys("vir");
        Thread.sleep(2000);
        hintsInputElement2.sendKeys(Keys.DOWN, Keys.ENTER);
        
        WebElement thirdUserRoleElement = driver.findElement(By.xpath("//*[contains(text(),'Status')]//following::div[4]"));
        thirdUserRoleElement.click();
        thirdUserRoleElement.sendKeys(Keys.DOWN, Keys.ENTER);
        
        driver.findElement(By.xpath("//*[contains(text(),'Username')]//following::input")).sendKeys("King Kohli");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[contains(text(),'Password')]//following::input")).sendKeys("abc1234");
        driver.findElement(By.xpath("//*[contains(text(),'Confirm Password')]//following::input")).sendKeys("abc1234");
        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[contains(text(),'King Kohli')]/../preceding-sibling::div//span")).click();
        
        driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin']")).click();
        
	}

}
