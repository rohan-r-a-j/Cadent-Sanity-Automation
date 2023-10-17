package selenium_java_testing;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LaunchingBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        driver.get("https://www.cadentgas.com");
     // Store the handle of the original tab
        String originalWindowHandle = driver.getWindowHandle();
        driver.manage().window().maximize();
        String title = driver.getTitle();

        if (title.equalsIgnoreCase("Home | Cadent"))
            System.out.println("Website Title Matches");
        else {
            System.out.println(title);
        }

        // Find and click the Close button of title message
        driver.findElement(By.linkText("Close")).click();
        Thread.sleep(2000);
        System.out.println("Title Message Closed Successfully ");

        // Find and click cross access all cookies button
        driver.findElement(By.xpath("/html/body/div[1]/p[1]")).click();
        Thread.sleep(2000);
        System.out.println("Accepted All Cookies");
        
 
        
        

//        // Scroll from top to bottom of the webpage
//        long windowHeight = (Long) jsExecutor.executeScript("return window.innerHeight");
//        long fullPageHeight = (Long) jsExecutor.executeScript("return document.body.scrollHeight");
//        long currentScroll = 0;
//        while (currentScroll < fullPageHeight) {
//            currentScroll += windowHeight / 10; // Adjust scroll step as needed for smoother scrolling
//            jsExecutor.executeScript("window.scrollTo(0, " + currentScroll + ")");
//            Thread.sleep(100); // Reduce delay for smoother scrolling
//        }
//
//        // Scroll back to the top of the webpage using the same increments
//        while (currentScroll > 0) {
//            currentScroll -= windowHeight / 10; // Adjust scroll step as needed for smoother scrolling
//            if (currentScroll < 0) {
//                currentScroll = 0;
//            }
//            jsExecutor.executeScript("window.scrollTo(0, " + currentScroll + ")");
//            Thread.sleep(100); // Reduce delay for smoother scrolling
//        }
     
    }
}