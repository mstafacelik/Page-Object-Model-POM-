//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tests.day18;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;

public class C02_Webtables {
    HotelMyCampPage hotelMyCampPage;
    HMCWebTablePage hmcWebTablePage;

    public C02_Webtables() {
    }

    @Test
    public void loginT() {
        this.hotelMyCampPage = new HotelMyCampPage();
        this.hotelMyCampPage.girisYap();
    }

    @Test(
            dependsOnMethods = {"loginT"}
    )
    public void table() {
        this.hmcWebTablePage = new HMCWebTablePage();
        List<WebElement> headerDataList = this.hmcWebTablePage.headerBirinciSatirDatalar;
        System.out.println("tablodaki sutun sayisi : " + headerDataList.size());
        System.out.println(this.hmcWebTablePage.tumBodyWebElementi.getText());
        List<WebElement> bodyTumDataList = this.hmcWebTablePage.tumBodyDatalariList;
        System.out.println("body'deki data sayisi : " + bodyTumDataList.size());
    }

    @Test(
            dependsOnMethods = {"loginT"}
    )
    public void printRows() {
        this.hmcWebTablePage = new HMCWebTablePage();
        System.out.println(this.hmcWebTablePage.satirlarListesi.size());
        List<WebElement> satirlarWebelementListesi = this.hmcWebTablePage.satirlarListesi;
        Iterator var2 = satirlarWebelementListesi.iterator();

        while(var2.hasNext()) {
            WebElement each = (WebElement)var2.next();
            System.out.println(each.getText());
        }

        System.out.println("4.satir : " + ((WebElement)satirlarWebelementListesi.get(3)).getText());
    }
}
