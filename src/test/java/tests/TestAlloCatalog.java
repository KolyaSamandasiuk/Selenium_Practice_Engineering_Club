package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AlloCatalogResultElements;
import pageObjects.AlloHomePageHelper;

public class TestAlloCatalog extends TestInit{

    @Test
    public void checkCatalogSmartphones() {
        AlloHomePageHelper alloHomePageHelper = new AlloHomePageHelper(driver);

        alloHomePageHelper.navigateAllo();
        alloHomePageHelper.clickSmartPhonesBtn();

        AlloCatalogResultElements alloCatalogResultElements = new AlloCatalogResultElements(driver);

        Assert.assertTrue(alloCatalogResultElements.getSmartPhonesName().size()<117);
        Assert.assertEquals("Смартфони та мобільні телефони", alloCatalogResultElements.getFieldSmartPhonesAndPhones().getText());


    }

}
