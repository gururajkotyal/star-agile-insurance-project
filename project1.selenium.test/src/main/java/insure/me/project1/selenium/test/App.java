package insure.me.project1.selenium.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
    public static void main( String[] args ) throws InterruptedException, IOException
    {
        System.out.println( "Welcome to Insure-me Project, selenium test! " );
        
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("http://3.82.148.86:8082");
		Thread.sleep(3000);
		
		//To access ABOUT US and take a screenshot of the same.
		driver.findElement(By.id("navbarSupportedContent")).click();
		Thread.sleep(2000);
				
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		File screenShot = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File ("./scr.png");
		FileUtils.copyFile(screenShot, destFile);
		Thread.sleep(3000);
		
		driver.quit();
		
    }
}
