//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tests.day20;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C03_ReusableRunner {
    public C03_ReusableRunner() {
    }

    @Test
    public void test01() {
        String path = "src/test/java/resources/ulkeler.xlsx";
        String expectedData = "Azerbaycan";
        String actualData = ReusableMethodsExcel.hucreGetir(path, "Sayfa1", 11, 2).toString();
        Assert.assertEquals(actualData, expectedData);
    }
}
