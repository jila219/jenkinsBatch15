import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExeLIssus {
    public static void main(String[] args) throws FileNotFoundException {
        String  path= "src/Files/Book1.xlsx";
        FileInputStream fileInputStream= new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook();
        XSSFSheet sheet1= xssfWorkbook.getSheet("Sheet1");
        Row row= sheet1.getRow(1);
        Cell cell = row.getCell(1);
        System.out.println(cell);

    }
}
