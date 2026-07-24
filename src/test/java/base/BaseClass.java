package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

    public class BaseClass extends AbstractTestNGCucumberTests {
    public static ChromeDriver driver;
    
    @BeforeMethod
    public void preConditions(){
        ChromeOptions options = new ChromeOptions();

options.addArguments("--headless=new");   // or "--headless"
options.addArguments("--no-sandbox");
options.addArguments("--disable-dev-shm-usage");
options.addArguments("--window-size=1920,1080");

driver = new ChromeDriver(options);
        System.out.println("BeforeMethod:"+driver);
        driver.get("https://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @AfterMethod
    public void postConditions(){
        driver.close();

}

    }
    