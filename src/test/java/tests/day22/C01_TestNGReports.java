//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tests.day22;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C01_TestNGReports extends TestBaseRapor {
    public C01_TestNGReports() {
    }

    @Test
    public void windowHandlereusableTest() throws IOException {
        extentTest = extentReports.createTest("window handle", "title ile 2.sayfaya gecis yapildigi test edildi");
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        extentTest.info("herokuapp sayfasina gidildi");
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        extentTest.info("yeni window linkine tiklandi");
        ReusableMethods.switchToWindow("New Window");
        extentTest.info("resusable method kullanarak acilan ikinci sayfaya gecildi");
        String expectedTitle = "New Window1";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        extentTest.pass("title'nin beklenen deger ile ayni oldugu test edildi");
    }
}
