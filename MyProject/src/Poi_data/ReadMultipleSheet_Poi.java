package Poi_data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMultipleSheet_Poi {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(System.getProperty("user.dir")+"/TestData/MultipleSheets_Poi.xlsx"));
		
		int sheetcount = wb.getNumberOfSheets();
		System.out.println("Number of Sheets: " +sheetcount);
		
		for (int s=0; s<sheetcount; s++){
			System.out.println(wb.getSheetName(s));
			XSSFSheet ws = wb.getSheetAt(s);
			
			int rows = ws.getPhysicalNumberOfRows();
			System.out.println("No of rows used : " +rows);
			
			int cols = ws.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of columns used : " +cols);
			
			for (int i = 0; i < rows; i++) {

				for (int j = 0; j < cols; j++) {
					String str = ws.getRow(i).getCell(j).getStringCellValue().trim();
					System.out.print(str);

				}System.out.println("\n");
		
			}
		
			wb.close();
		}

}
}
