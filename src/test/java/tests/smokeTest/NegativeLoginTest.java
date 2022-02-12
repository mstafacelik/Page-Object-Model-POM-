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

public class NegativeLoginTest {
    HotelMyCampPage hotelMyCampPage;

    public NegativeLoginTest() {
    }

    @Test
    public void yanlisSifreTesti() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        this.hotelMyCampPage = new HotelMyCampPage();
        this.hotelMyCampPage.ilkLoginLinki.click();
        this.hotelMyCampPage.usernameBox.sendKeys(new CharSequence[]{ConfigReader.getProperty("HMCValidUsername")});
        this.hotelMyCampPage.passwordBox.sendKeys(new CharSequence[]{ConfigReader.getProperty("HMCWrongPassword")});
        this.hotelMyCampPage.loginButonu.click();
        Assert.assertTrue(this.hotelMyCampPage.girisYapilamadiYaziElementi.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void yanlisUsernameTesti() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        this.hotelMyCampPage = new HotelMyCampPage();
        this.hotelMyCampPage.ilkLoginLinki.click();
        this.hotelMyCampPage.usernameBox.sendKeys(new CharSequence[]{ConfigReader.getProperty("HMCWrongUsername")});
        this.hotelMyCampPage.passwordBox.sendKeys(new CharSequence[]{ConfigReader.getProperty("HMCValidPassword")});
        this.hotelMyCampPage.loginButonu.click();
        Assert.assertTrue(this.hotelMyCampPage.girisYapilamadiYaziElementi.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void yanlisSifreUsernameTesti() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        this.hotelMyCampPage = new HotelMyCampPage();
        this.hotelMyCampPage.ilkLoginLinki.click();
        this.hotelMyCampPage.usernameBox.sendKeys(new CharSequence[]{ConfigReader.getProperty("HMCWrongUsername")});
        this.hotelMyCampPage.passwordBox.sendKeys(new CharSequence[]{ConfigReader.getProperty("HMCWrongPassword")});
        this.hotelMyCampPage.loginButonu.click();
        Assert.assertTrue(this.hotelMyCampPage.girisYapilamadiYaziElementi.isDisplayed());
        Driver.closeDriver();
    }
}
