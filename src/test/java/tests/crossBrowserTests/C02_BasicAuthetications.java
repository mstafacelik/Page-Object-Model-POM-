//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tests.crossBrowserTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseCross;

public class C02_BasicAuthetications extends TestBaseCross {
    public C02_BasicAuthetications() {
    }

    @Test
    public void authenticationTesti() {
        this.driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        WebElement congratMesajElementi = this.driver.findElement(By.tagName("p"));
        Assert.assertTrue(congratMesajElementi.isDisplayed());
    }
}
