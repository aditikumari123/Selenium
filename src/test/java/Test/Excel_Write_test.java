package Test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Excel_Write_test {
    public static void main(String args[]) throws IOException {
        FileInputStream fl = new FileInputStream(System.getProperty("user.dir") + "\\Book1.xlsx");

        XSSFWorkbook wb = new XSSFWorkbook(fl);
        XSSFSheet sheet = wb.getSheetAt(0);
        sheet.getRow(1).getCell(1).setCellValue("num");

        FileOutputStream fw = new FileOutputStream( System.getProperty("user.dir")+"\\Book1.xlsx");
        wb.write(fw);
        fw.close();

    }
}
