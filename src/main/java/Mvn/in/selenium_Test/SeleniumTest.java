package Mvn.in.selenium_Test;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class SeleniumTest {
    public static void main(String[] args) {
//        // Set the path to the Edge WebDriver
      System.setProperty("webdriver.chrome.driver", "C:/Users/ADMIN/Downloads/chromedriver_win32/chromedriver.exe");
//
//     
    	WebDriver driver =new ChromeDriver();
    	

        driver.get("https://www.amazon.in/");
        
    }
}
