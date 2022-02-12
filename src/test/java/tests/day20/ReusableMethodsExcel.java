//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tests.day20;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReusableMethodsExcel {
    public ReusableMethodsExcel() {
    }

    public static Cell hucreGetir(String path, String sayfaIsmi, int satirIndex, int hucreIndex) {
        Cell cell = null;

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(fileInputStream);
            cell = workbook.getSheet(sayfaIsmi).getRow(satirIndex).getCell(hucreIndex);
        } catch (IOException var7) {
            var7.printStackTrace();
        }

        return cell;
    }

    public static Map<String, String> mapOlustur(String path, String sayfaAdi) {
        Map<String, String> excelMap = new TreeMap();
        Workbook workbook = null;

        try {
            FileInputStream fis = new FileInputStream(path);
            workbook = WorkbookFactory.create(fis);
        } catch (IOException var8) {
            var8.printStackTrace();
        }

        int satirSayisi = workbook.getSheet(sayfaAdi).getLastRowNum();
        String key = "";
        String value = "";

        for(int i = 0; i <= satirSayisi; ++i) {
            key = workbook.getSheet(sayfaAdi).getRow(i).getCell(0).toString();
            String var10000 = workbook.getSheet(sayfaAdi).getRow(i).getCell(1).toString();
            value = var10000 + ", " + workbook.getSheet(sayfaAdi).getRow(i).getCell(2).toString() + ", " + workbook.getSheet(sayfaAdi).getRow(i).getCell(3).toString();
            excelMap.put(key, value);
        }

        return excelMap;
    }
}
