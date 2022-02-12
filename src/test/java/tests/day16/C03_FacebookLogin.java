//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tests.day16;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C03_FacebookLogin {
    public C03_FacebookLogin() {
    }

    @Test(
            groups = {"miniRegression", "regression"}
    )
    public void test01() throws InterruptedException {
        Driver.getDriver().get("https://www.facebook.com/");
        FacebookPage facebookPage = new FacebookPage();
        facebookPage.facebookCookies.click();
        Faker faker = new Faker();
        facebookPage.emailKutusu.sendKeys(new CharSequence[]{faker.internet().emailAddress()});
        facebookPage.passKutusu.sendKeys(new CharSequence[]{faker.internet().password()});
        facebookPage.loginButonu.click();
        Assert.assertTrue(facebookPage.girilemediYazisiElemnti.isDisplayed());
        Thread.sleep(5000L);
        Driver.closeDriver();
    }
}
