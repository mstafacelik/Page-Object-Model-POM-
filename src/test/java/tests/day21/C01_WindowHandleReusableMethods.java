//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tests.day21;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_WindowHandleReusableMethods {
    public C01_WindowHandleReusableMethods() {
    }

    @Test
    public void test01() {
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        String ilkSayfaWindowHandle = Driver.getDriver().getWindowHandle();
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        Set<String> handleSeti = Driver.getDriver().getWindowHandles();
        String ikinciSayfaHandle = "";
        Iterator var4 = handleSeti.iterator();

        String each;
        while(var4.hasNext()) {
            each = (String)var4.next();
            if (!each.equals(ilkSayfaWindowHandle)) {
                ikinciSayfaHandle = each;
            }
        }

        Driver.getDriver().switchTo().window(ikinciSayfaHandle);
        String expectedTitle = "New Window";
        each = Driver.getDriver().getTitle();
        Assert.assertEquals(each, expectedTitle);
        Driver.closeDriver();
    }

    @Test
    public void windowHandlereusableTest() throws IOException {
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        ReusableMethods.switchToWindow("New Window");
        String expectedTitle = "New Window";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        ReusableMethods.getScreenshot("WindowSwitch");
        Driver.closeDriver();
    }
}
