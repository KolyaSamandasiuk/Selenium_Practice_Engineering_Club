package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AlloHomePageHelper;

public class TestAlloProfile extends TestInit {

    @Test
    public void checkProfile(){
        AlloHomePageHelper alloHomePageHelper = new AlloHomePageHelper(driver);

        alloHomePageHelper.navigateAllo();
        alloHomePageHelper.clickOnProfileBtn();
        alloHomePageHelper.clickOnLoginAndPasswordField();
        alloHomePageHelper.sendTextForEmailField();
        alloHomePageHelper.sendTextForPasswordField();
        alloHomePageHelper.clickOnLoginBtn();

        Assert.assertTrue(alloHomePageHelper.getAuthorField().isDisplayed());
        Assert.assertTrue(alloHomePageHelper.getPasswordFieldForRegistration().isDisplayed());
        Assert.assertEquals("Реєстрація", alloHomePageHelper.getAuthorTitle().getText());
    }

}
