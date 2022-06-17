package day14;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_ReadExcel {

    @Test
    public void readExcel() throws IOException {
        String dosyaYolu ="src/resources/ulkeler.xlsx";

        FileInputStream fis= new FileInputStream(dosyaYolu);
        Workbook worbook= WorkbookFactory.create(fis);
        String hücre= worbook.getSheet("Sayfa1").getRow(5).getCell(2).getStringCellValue();
        System.out.println(hücre);



    }
}
