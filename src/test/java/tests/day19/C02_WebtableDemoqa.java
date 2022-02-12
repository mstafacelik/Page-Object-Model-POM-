//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tests.day19;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_WebtableDemoqa {
    public C02_WebtableDemoqa() {
    }

    @Test(
            groups = {"smoke", "regression"}
    )
    public void demoqaTest() {
        Driver.getDriver().get(ConfigReader.getProperty("DemoqaUrl"));
        DemoqaPage demoqaPage = new DemoqaPage();
        System.out.println("baslik satiri elementi : " + demoqaPage.baslikSatiriElementi.getText());
        System.out.println("3.sutun basligi : " + ((WebElement)demoqaPage.basliklarWebelementiListesi.get(2)).getText());
        System.out.println("===========Tum body==========");
        System.out.println(demoqaPage.bodyTekWebelement.getText());
        System.out.println("Tablodaki data sayisi : " + demoqaPage.tumDataWebelementList.size());
        System.out.println("Tum satir sayisi : " + demoqaPage.tumSatirlarWebelementList.size());
        System.out.println("tablodaki sutun sayisi : " + demoqaPage.tumDataWebelementList.size() / demoqaPage.tumSatirlarWebelementList.size());
        demoqaPage.sutunYazdir(2);
        demoqaPage.ismeGoreMaasYazdir("Alden");
        demoqaPage.hucreYazdir(3, 2);
        Driver.closeDriver();
    }
}
