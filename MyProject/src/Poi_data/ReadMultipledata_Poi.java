package Poi_data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMultipledata_Poi {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(System.getProperty("user.dir")+"/TestData/MultipledataPoi.xlsx"));
		XSSFSheet ws = wb.getSheet("Sheet1");

		int rows = ws.getPhysicalNumberOfRows();
		System.out.println("Total no of Rows used : " +rows);

		int columns = ws.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Total no of Columns used : " +columns);

		for(int i = 0 ; i<rows; i++){
			for(int j = 0; j<columns; j++){
				String str = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(str);

			}
		}
	}

}
