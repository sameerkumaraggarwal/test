package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        File picture = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try 
        {
            FileUtils.copyFile(picture, new File("C:\\seleniumScreenshot\\photo.png"));
        } 
        catch (IOException c) 
        {
            System.out.println(c.getMessage());
        }

        driver.close();
    }

}
