//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tests.day16;

import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C04_HotelMyCampPositiveLogin {
    public C04_HotelMyCampPositiveLogin() {
    }

    @Test(
            groups = {"miniRegression", "smoke"}
    )
    public void pozitifLoginTesti() {
        Driver.getDriver().get("https://www.hotelmycamp.com/");
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();
        hotelMyCampPage.usernameBox.sendKeys(new CharSequence[]{"manager"});
        hotelMyCampPage.passwordBox.sendKeys(new CharSequence[]{"Manager1!"});
        hotelMyCampPage.loginButonu.click();
    }
}
