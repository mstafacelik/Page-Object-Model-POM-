//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tests.day19;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_WebtableDinamikLocate {
    HMCWebTablePage hmcWebTablePage;
    HotelMyCampPage hotelMyCampPage;

    public C01_WebtableDinamikLocate() {
    }

    @Test
    public void satirYazdirTesti() {
        this.hotelMyCampPage = new HotelMyCampPage();
        this.hotelMyCampPage.girisYap();
        this.hmcWebTablePage = new HMCWebTablePage();
        WebElement ucuncusatirElementi = this.hmcWebTablePage.satirGetir(4);
        System.out.println(ucuncusatirElementi.getText());
        Driver.closeDriver();
    }

    @Test
    public void hucreGetirTesti() {
        this.hotelMyCampPage = new HotelMyCampPage();
        this.hotelMyCampPage.girisYap();
        this.hmcWebTablePage = new HMCWebTablePage();
        System.out.println("girdiginiz hucredki element : " + this.hmcWebTablePage.hucreWebelementGetir(5, 3));
        Driver.closeDriver();
    }

    @Test
    public void sutunYazdirTesti() {
        this.hotelMyCampPage = new HotelMyCampPage();
        this.hotelMyCampPage.girisYap();
        this.hmcWebTablePage = new HMCWebTablePage();
        this.hmcWebTablePage.sutunYazdir(4);
        Driver.closeDriver();
    }
}
