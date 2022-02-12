//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tests.day18;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_E2ETesting {
    public C01_E2ETesting() {
    }

    @Test
    public void createHotel() {
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.girisYap();
        hotelMyCampPage.bekle(3);
        hotelMyCampPage.hotelManagementLinki.click();
        hotelMyCampPage.hotelListLinki.click();
        hotelMyCampPage.addHotelLinki.click();
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();
        actions.click(hotelMyCampPage.addHotelCodeKutusu).sendKeys(new CharSequence[]{faker.address().zipCode()}).sendKeys(new CharSequence[]{Keys.TAB}).sendKeys(new CharSequence[]{faker.name().name()}).sendKeys(new CharSequence[]{Keys.TAB}).sendKeys(new CharSequence[]{faker.address().fullAddress()}).sendKeys(new CharSequence[]{Keys.TAB}).sendKeys(new CharSequence[]{faker.phoneNumber().cellPhone()}).sendKeys(new CharSequence[]{Keys.TAB}).sendKeys(new CharSequence[]{faker.internet().emailAddress()}).sendKeys(new CharSequence[]{Keys.PAGE_DOWN}).perform();
        Select select = new Select(hotelMyCampPage.addHotelDropdown);
        select.selectByVisibleText("Hotel Type1");
        hotelMyCampPage.bekle(1);
    }
}
