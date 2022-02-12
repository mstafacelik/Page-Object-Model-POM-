//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tests.day17;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_PropertiesIlkClass {
    public C02_PropertiesIlkClass() {
    }

    @Test
    public void positiveLoginTesti() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();
        hotelMyCampPage.usernameBox.sendKeys(new CharSequence[]{ConfigReader.getProperty("HMCValidUsername")});
        hotelMyCampPage.passwordBox.sendKeys(new CharSequence[]{ConfigReader.getProperty("HMCValidPassword")});
        hotelMyCampPage.bekle(3);
        hotelMyCampPage.loginButonu.click();
        Assert.assertTrue(hotelMyCampPage.basariliGirisYaziElementi.isDisplayed());
        Driver.closeDriver();
    }
}
