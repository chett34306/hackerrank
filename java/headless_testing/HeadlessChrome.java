package headless_testing;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
 
public class HeadlessChrome {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //System.setProperties(props);madhuridevidi/Praveen/hobby/SeleniumDemo/bin/
        System.setProperty("webdriver.chrome.driver","/Users/madhuridevidi/Praveen/hobby/SeleniumDemo/bin/Debug/chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver","E://Selenium/latest chrome exe/chromedriver.exe");
         
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
         
        WebDriver driver = new ChromeDriver(options);
     
        driver.get("www.google.com/");
        System.out.println("Executing Chrome Driver in Headless mode..\n");
 
        System.out.println(">> Page Title : "+driver.getTitle());
        System.out.println(">> Page URL  : "+driver.getCurrentUrl());
    }
}