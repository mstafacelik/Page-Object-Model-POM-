//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tests.day17;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_HotelMyCampNegativeLogin {
    public C01_HotelMyCampNegativeLogin() {
    }

    @Test
    public void test01() {
        Driver.getDriver().get("https://www.hotelmycamp.com/");
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();
        hotelMyCampPage.usernameBox.sendKeys(new CharSequence[]{"manager1"});
        hotelMyCampPage.passwordBox.sendKeys(new CharSequence[]{"manager1!"});
        hotelMyCampPage.loginButonu.click();
        Assert.assertTrue(hotelMyCampPage.girisYapilamadiYaziElementi.isDisplayed());
        Driver.closeDriver();
    }
}
