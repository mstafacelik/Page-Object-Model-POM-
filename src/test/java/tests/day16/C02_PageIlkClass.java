//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tests.day16;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageIlkClass {
    public C02_PageIlkClass() {
    }

    @Test
    public void test01() {
        Driver.getDriver().get("https://www.amazon.com");
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys(new CharSequence[]{"Nutella" + Keys.ENTER});
        String actualSonucStr = amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(actualSonucStr.contains("Nutella"));
        Driver.closeDriver();
    }

    @Test(
            groups = {"miniRegression", "smoke"}
    )
    public void test02() {
        Driver.getDriver().get("https://www.amazon.com");
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys(new CharSequence[]{"java" + Keys.ENTER});
        String sonucYazisiStr = amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(sonucYazisiStr.contains("java"));
        Driver.closeDriver();
    }
}
