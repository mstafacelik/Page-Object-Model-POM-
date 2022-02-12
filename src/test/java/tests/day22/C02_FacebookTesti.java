//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tests.day22;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C02_FacebookTesti extends TestBaseRapor {
    public C02_FacebookTesti() {
    }

    @Test
    public void test01() {
        extentTest = extentReports.createTest("facebook", "fake isimle girilemedigi test edildi");
        Driver.getDriver().get("https://www.facebook.com/");
        extentTest.info("facebook sayfasina gidildi");
        FacebookPage facebookPage = new FacebookPage();
        facebookPage.facebookCookies.click();
        extentTest.info("cookies halledildi");
        Faker faker = new Faker();
        facebookPage.emailKutusu.sendKeys(new CharSequence[]{faker.internet().emailAddress()});
        facebookPage.passKutusu.sendKeys(new CharSequence[]{faker.internet().password()});
        facebookPage.loginButonu.click();
        extentTest.info("facebook giris bilgileri faker ile dolduruldu");
        Assert.assertTrue(facebookPage.girilemediYazisiElemnti.isDisplayed());
        extentTest.pass("girilemedigi test edildi");
    }
}
