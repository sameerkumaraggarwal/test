package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;

public class Day1 {

    public static void main(String[] args) throws InterruptedException {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        // Get the Options interface for managing browser settings
        Options opt = driver.manage();
        
        // Minimize the browser window (this line can be removed if not needed)
        opt.window().minimize();

        // Introduce a 2-second delay
        Thread.sleep(2000);
        
        // Set the browser window size to 500x500 pixels
        opt.window().setSize(new Dimension(500, 500));

        // Introduce a 2-second delay
        Thread.sleep(2000);
        
        // Maximize the browser window
        opt.window().maximize();

        // Introduce a 2-second delay
        Thread.sleep(2000);
        
        // Navigate to the specified URL
        driver.get("https://practice.expandtesting.com/login");
        
        // Introduce a 2-second delay to allow the page to load
        Thread.sleep(2000);
        
        // Find the username input element and enter the username "practice"
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("practice");
        
        // Introduce a 2-second delay
        Thread.sleep(2000);
        
        // Find the password input element and enter the password "SuperSecretPassword!"
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("SuperSecretPassword!");
        
        // Introduce a 2-second delay
        Thread.sleep(2000);
        
        // Find the login button and click it
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Introduce a 2-second delay
        Thread.sleep(2000);
        
        // Close the browser window
        driver.close();
    }
}
