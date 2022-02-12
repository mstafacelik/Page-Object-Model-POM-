//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PositiveLoginTest {
    public PositiveLoginTest() {
    }

    @Test
    public void positiveLoginTest() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();
        hotelMyCampPage.usernameBox.sendKeys(new CharSequence[]{ConfigReader.getProperty("HMCValidUsername")});
        hotelMyCampPage.passwordBox.sendKeys(new CharSequence[]{ConfigReader.getProperty("HMCValidPassword")});
        hotelMyCampPage.loginButonu.click();
        Assert.assertTrue(hotelMyCampPage.basariliGirisYaziElementi.isDisplayed());
        Driver.closeDriver();
    }
}
