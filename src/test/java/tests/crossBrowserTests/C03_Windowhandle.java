//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tests.crossBrowserTests;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseCross;

public class C03_Windowhandle extends TestBaseCross {
    public C03_Windowhandle() {
    }

    @Test
    public void windowHandleTest() {
        this.driver.get("https://the-internet.herokuapp.com/windows");
        WebElement sayfadakiYaziElementi = this.driver.findElement(By.tagName("h3"));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(sayfadakiYaziElementi.getText(), "Opening a new window", "sayfadaki yazi beklenenden farkli");
        softAssert.assertEquals(this.driver.getTitle(), "The Internet", "sayfa title'i beklenenden farkli");
        String windowHandleDegeri1 = this.driver.getWindowHandle();
        this.driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        Set<String> handleDegerleriSeti = this.driver.getWindowHandles();
        String windowHandleDegeri2 = "";
        Iterator var6 = handleDegerleriSeti.iterator();

        while(var6.hasNext()) {
            String each = (String)var6.next();
            if (!each.equals(windowHandleDegeri1)) {
                windowHandleDegeri2 = each;
            }
        }

        this.driver.switchTo().window(windowHandleDegeri2);
        softAssert.assertEquals(this.driver.getTitle(), "New Window", "yeni sayfa title'i istenenden farkli");
        WebElement ikinciSayfadakiYaziElementi = this.driver.findElement(By.tagName("h3"));
        softAssert.assertEquals(ikinciSayfadakiYaziElementi.getText(), "New Window", "Ikinci sayfadaki yazi istenenden farkli");
        this.driver.switchTo().window(windowHandleDegeri1);
        softAssert.assertEquals(this.driver.getTitle(), "The Internet", "ilk sayfanin title'i beklenen gibi degil");
        softAssert.assertAll();
    }
}
