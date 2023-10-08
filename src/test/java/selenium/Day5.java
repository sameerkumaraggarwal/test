package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5 {

	public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("sameer");
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        
        driver.quit();
    
	}

}
