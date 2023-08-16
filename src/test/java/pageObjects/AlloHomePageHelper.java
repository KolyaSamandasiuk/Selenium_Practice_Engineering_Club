package pageObjects;

import org.openqa.selenium.WebDriver;
public class AlloHomePageHelper extends AlloHomePageElements{
    public AlloHomePageHelper(WebDriver driver){super(driver);}
    public AlloCatalogResultElements clickSmartPhonesBtn(){
        getCatalogBtn().click();
        getSmartphonesField().click();
        return new AlloCatalogResultElements(driver);
    }
    public void clickOnProfileBtn(){
        getProfileBtn().click();
    }
    public void clickOnLoginAndPasswordField(){
        getLoginAndPasswordField().click();
    }
    public void sendTextForEmailField(){
        getEmailOrPhoneNumberField().sendKeys("federico228@gmail.com");
    }
    public void sendTextForPasswordField(){
        getPasswordField().sendKeys("Federico20011551");
    }
    public void clickOnLoginBtn(){
        getLoginBtn().click();
    }
}
