package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AlloHomePageElements;
import pageObjects.AlloHomePageHelper;

public class TestAlloHeader extends TestInit {

    @Test
    public void checkAlloHeader() {

        AlloHomePageElements alloHomePageElements = new AlloHomePageElements(driver);
        AlloHomePageHelper alloHomePageHelper = new AlloHomePageHelper(driver);
        alloHomePageHelper.navigateAllo();

        Assert.assertTrue(alloHomePageElements.getLogo().isDisplayed());
        Assert.assertTrue(alloHomePageElements.getCatalogBtn().isDisplayed());
        Assert.assertTrue(alloHomePageElements.getSearchField().isDisplayed());
        Assert.assertTrue(alloHomePageElements.getProfileBtn().isDisplayed());
        Assert.assertTrue(alloHomePageElements.getBasketBtn().isDisplayed());
    }
}
