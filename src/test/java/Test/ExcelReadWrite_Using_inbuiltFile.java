package Test;

public class ExcelReadWrite_Using_inbuiltFile {
    public static void main(String args[])
    {
        Xls_Reader xl = new Xls_Reader(System.getProperty("user.dir")+"\\Book1.xlsx");
        int row = xl.getRowCount("Sheet1");
        System.out.println(row);
        String username = xl.getCellData("Sheet1","Username",2);
        System.out.println(username);
        xl.setCellData("Sheet1","Status",2,"Passed");
    }
}
