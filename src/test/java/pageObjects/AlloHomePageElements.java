package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class AlloHomePageElements extends BasePage{
    public AlloHomePageElements(WebDriver driver){
        super(driver);
    }
    public WebElement getLogo (){
        return driver.findElement(By.xpath("//a[@class='v-logo']"));
    }
    public WebElement getCatalogBtn(){
        return driver.findElement(By.xpath("//div[@class='ct-button']"));
    }
    public WebElement getSearchField(){
        return driver.findElement(By.xpath("//input[@class='search-form__input']"));
    }
    public WebElement getProfileBtn(){
        return driver.findElement(By.xpath("//button[@class='mh-button mh-button--open']"));
    }
    public WebElement getBasketBtn(){
        return driver.findElement(By.xpath("//div[@class='mh-cart']"));
    }
    public WebElement getSmartphonesField(){
        return driver.findElement(By.xpath("//li[contains(@class, 'mm__item')][2]"));
    }
    public WebElement getLoginAndPasswordField() {
        return driver.findElement(By.xpath("//div[@class='auth__enter-password']"));
    }
    public WebElement getEmailOrPhoneNumberField(){
        return driver.findElement(By.xpath("//input[@name='phoneEmail']"));
    }
    public WebElement getPasswordField(){
        return driver.findElement(By.xpath("//input[@name='password']"));
    }
    public WebElement getAuthorField() {
        return driver.findElement(By.xpath("//span[@class='auth__contact-data']"));
    }
    public WebElement getLoginBtn() {
        return driver.findElement(By.xpath("//span[contains(text(), 'Увійти')]"));
    }
    public WebElement getPasswordFieldForRegistration(){
        return driver.findElement(By.xpath("//input[@name='firstname']"));
    }
    public WebElement getAuthorTitle(){
        return driver.findElement(By.xpath("//div[@class='auth__title']"));
    }
}
