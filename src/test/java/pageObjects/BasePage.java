package pageObjects;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;
public class BasePage {
    WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver = driver;
    }
    public void navigateAllo(){
        driver.get("https://allo.ua");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
