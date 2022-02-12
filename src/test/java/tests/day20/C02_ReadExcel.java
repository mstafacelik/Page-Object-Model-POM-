//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tests.day20;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class C02_ReadExcel {
    public C02_ReadExcel() {
    }

    @Test
    public void test01() throws IOException {
        String path = "src/test/java/resources/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fis);

        int i;
        for(i = 0; i < 4; ++i) {
            System.out.println(workbook.getSheet("Sayfa1").getRow(2).getCell(i).toString());
        }

        for(i = 0; i <= 20; ++i) {
            System.out.println(workbook.getSheet("Sayfa1").getRow(i).getCell(3));
        }

    }
}
