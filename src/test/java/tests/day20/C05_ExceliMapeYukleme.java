//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tests.day20;

import java.util.Map;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C05_ExceliMapeYukleme {
    public C05_ExceliMapeYukleme() {
    }

    @Test
    public void test01() {
        String path = "src/test/java/resources/ulkeler.xlsx";
        String sayfaAdi = "Sayfa1";
        Map<String, String> ulkelerMap = ReusableMethodsExcel.mapOlustur(path, sayfaAdi);
        System.out.println((String)ulkelerMap.get("Turkey"));
        Assert.assertTrue(ulkelerMap.containsKey("Netherlands"));
    }
}
