package selenium_java_testing;

//import Edureka.AboutConnection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaleniumScript {
    
     WebDriver driver;
    JavascriptExecutor  jse;
    
    
    public SaleniumScript(WebDriver driver) {
//  super();
        this.driver = driver;
//      this.jse = jse;
    }
    public void Connection(){
        try {
//      System.setProperty("webdriver.chrome.driver","C:\\Salenium Web Driver\\chromedriver-win64\\chromedriver.exe");
//      driver = new ChromeDriver();
//      driver.manage().deleteAllCookies();
//      driver.manage().window().maximize();
//      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//      driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//      driver.get("https://cadentgas.com");
        
        scrollSmooth(600);
        scrollSmoothUp(600);
//      jse = (JavascriptExecutor)driver;
//      jse.executeScript("scroll(0,4000)");
        
        
        UnderConnection();
//      Thread.sleep(300);
//      jse.executeScript("scroll(0,-4000)");
//      driver.quit();
        
        
        }
        catch(Exception e){
            e.printStackTrace();
            
        }
        
        
    }
    public void scrollSmooth(int num){
        for(int i=0;i<num;i++) {
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,10)", "");
        }
    }
    public void scrollSmoothUp(int num){
        for(int i=num;i>0;i--) {
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-10)", "");
        }
    }
    public void UnderConnection() throws InterruptedException{
    	// Open the browser and navigate to the website
        driver.get("https://www.cadentgas.com");
        driver.manage().window().maximize();

     // Store the handle of the original tab
        String originalWindowHandle = driver.getWindowHandle();
        
     // Find and click the Close button of title message
        driver.findElement(By.linkText("Close")).click();
            Thread.sleep(2000);
            System.out.println("Title Message Closed Successfully " );
            
            // Find and click  access all cookies button 
            driver.findElement(By.xpath("/html/body/div[1]/p[1]")).click();
            Thread.sleep(2000);
            System.out.println("Accepted All Cookies");
        // Clicked on the connection link
        driver.findElement(By.linkText("Connections")).click();
        System.out.println("Enter the in the  Connection page!");
        scrollSmooth(600);
        scrollSmoothUp(600);
//      for(int i=100;i>0;i--) {
//          ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-10)", "");
//      }
        
        // test cases for quick link
        driver.findElement(By.linkText("Existing Customer? Log in")).click(); // clicked on existing customer link
        driver.navigate().back();
        driver.findElement(By.linkText("Information Hub")).click(); // clicked on the information hub link
        scrollSmooth(600);
        scrollSmoothUp(600);
        driver.navigate().back();
        
        driver.findElement(By.linkText("IGT/UIP document library")).click(); // clicked on the document library
        scrollSmooth(600);
        scrollSmoothUp(600);
        driver.navigate().back();
        scrollSmooth(60);
        
        driver.findElement(By.linkText("FAQ's")).click(); // clicked on the faq link
        scrollSmooth(600);
        scrollSmoothUp(600);
        driver.navigate().back();
        // Clicked on the HouseHold Customer link
        driver.findElement(By.xpath("//*[@id='main-content']/div[4]/div/div/div[2]/div/div/div[1]/a[2]")).click();
        scrollSmooth(600);
        scrollSmoothUp(80);
//      for(int i=80;i>0;i--) {
//          ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-10)", "");
//          
//      }
        //Clicked on the new gas Connection link
        driver.findElement(By.xpath("//*[@id='main-content']/div[4]/div/div/div[2]/div/div/div[1]/a[2]")).click();
        scrollSmooth(600);
        scrollSmoothUp(80);

        driver.navigate().back(); // Back to the household customer page
        // for the Gas Alternation
        scrollSmooth(70);

        scrollSmoothUp(50);

        //Clicked on the gas alternation link
        driver.findElement(By.xpath("//*[@id='main-content']/div[4]/div/div/div[2]/div/div/div[2]/a[2]")).click();
        scrollSmooth(600);
        scrollSmoothUp(300);

        driver.navigate().back(); // Back to the household customer page

        // Clicked on gas DisConnection link
        driver.findElement(By.xpath("//*[@id='main-content']/div[4]/div/div/div[2]/div/div/div[3]/a[2]")).click();
        scrollSmooth(600);
        scrollSmoothUp(300);

    driver.navigate().back();
    driver.navigate().back();
    
    // clicked on the Business or home multiple homes
    driver.findElement(By.xpath("//*[@id='main-content']/div[4]/div/div/div[2]/div/div/div[2]/a[2]")).click();
    scrollSmooth(600);
    scrollSmoothUp(600);
    driver.navigate().back();
    
    //Clicked on the GT1 Survey and Diversions link
    driver.findElement(By.xpath("//*[@id='main-content']/div[4]/div/div/div[2]/div/div/div[3]/a[2]")).click();
    scrollSmooth(600);
    scrollSmoothUp(600);
    
    driver.navigate().back();
    scrollSmooth(60);
    
    //clicked on the 3rd party customer
    driver.findElement(By.xpath("//*[@id='main-content']/div[4]/div/div/div[2]/div/div/div[4]/a[2]")).click();
    scrollSmooth(600);
    scrollSmoothUp(600);
    
    driver.navigate().back();
    // clicked on the gas procedure link
    driver.findElement(By.xpath("//*[@id='main-content']/div[4]/div/div/div[2]/div/div/div[5]/a[2]")).click();
    scrollSmooth(600);
    scrollSmoothUp(600);
    
    driver.navigate().back();
    scrollSmooth(30);
    driver.findElement(By.xpath("//*[@id='main-content']/div[4]/div/div/div[2]/div/div/div[6]/a[2]")).click();
 
    }
    

}