package selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7 
{
	public static void main(String[] args) throws InterruptedException
	{		
		ChromeDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        By menuButton = By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span");
        By nameInput = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input");
        By userRoleInput = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]");
        By hintsInput = By.xpath("//input[@placeholder='Type for hints...']");
        By userStatusInput = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]");
        By submitButton = By.xpath("//button[@type='submit']");
        By secondaryButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
        By secondNameInput = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]");
        By thirdUserRoleInput = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]");
        By fourthInput = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input");
        By passwordInput1 = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input");
        By passwordInput2 = By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input");

        driver.findElement(menuButton).click();
        
        driver.findElement(nameInput).sendKeys("Cheeku");
        WebElement userRoleElement = driver.findElement(userRoleInput);
        userRoleElement.click();
        userRoleElement.sendKeys(Keys.DOWN, Keys.ENTER);
        
        WebElement hintsInputElement = driver.findElement(hintsInput);
        hintsInputElement.sendKeys("vir");
        Thread.sleep(2000);
        hintsInputElement.sendKeys(Keys.DOWN, Keys.ENTER);
        
        WebElement userStatusElement = driver.findElement(userStatusInput);
        userStatusElement.click();
        userStatusElement.sendKeys(Keys.DOWN, Keys.ENTER);
        
        driver.findElement(submitButton).click();
        Thread.sleep(2000);
        
        driver.findElement(secondaryButton).click();
        
        WebElement secondNameElement = driver.findElement(secondNameInput);
        secondNameElement.click();
        secondNameElement.sendKeys(Keys.DOWN, Keys.DOWN, Keys.ENTER);
        
        WebElement hintsInputElement2 = driver.findElement(hintsInput);
        hintsInputElement2.sendKeys("vir");
        Thread.sleep(2000);
        hintsInputElement2.sendKeys(Keys.DOWN, Keys.ENTER);
        
        WebElement thirdUserRoleElement = driver.findElement(thirdUserRoleInput);
        thirdUserRoleElement.click();
        thirdUserRoleElement.sendKeys(Keys.DOWN, Keys.ENTER);
        
        driver.findElement(fourthInput).sendKeys("King Kohli");
        Thread.sleep(2000);
        
        driver.findElement(passwordInput1).sendKeys("abc1234");
        driver.findElement(passwordInput2).sendKeys("abc1234");
        
        //driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        
        driver.quit();
	}
}