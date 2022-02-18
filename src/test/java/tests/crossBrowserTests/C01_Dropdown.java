//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tests.crossBrowserTests;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.TestBaseCross;

public class C01_Dropdown extends TestBaseCross {
    public C01_Dropdown() {
    }

    @Test
    public void dropdownTesti() throws InterruptedException {
        this.driver.get("https://www.amazon.com");
        WebElement dropdownElementi = this.driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select = new Select(dropdownElementi);
        select.selectByIndex(3);
        System.out.println(select.getFirstSelectedOption().getText());
        Thread.sleep(3000L);
        select.selectByVisibleText("Deals");
        Thread.sleep(3000L);
        select.selectByValue("search-alias=arts-crafts-intl-ship");
        List<WebElement> optionList = select.getOptions();
        Iterator var4 = optionList.iterator();

        while(var4.hasNext()) {
            WebElement each = (WebElement)var4.next();
            System.out.println(each.getText());
        }

    }
}
