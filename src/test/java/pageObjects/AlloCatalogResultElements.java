package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
public class AlloCatalogResultElements extends BasePage {
    public AlloCatalogResultElements(WebDriver driver) {
        super(driver);
    }
    public List<WebElement> getSmartPhonesName () {
        return driver.findElements(By.xpath("//ul[@class=\"portal-card__list\"]/*"));
    }
    public WebElement getFieldSmartPhonesAndPhones(){
        return driver.findElement(By.xpath("//a[contains(text(),'Смартфони та мобільні телефони')]"));
    }
}
