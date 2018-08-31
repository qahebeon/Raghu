package Poi_data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writedata_poi {

	public static void main(String[] args) throws IOException {
		File src = new File(System.getProperty("user.dir")+"/TestData/Multipledatapoi.xlsx");
		FileInputStream fi = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheetAt(0);
		
		ws.getRow(0).createCell(3).setCellValue("Comments");
		ws.getRow(1).createCell(3).setCellValue("Good");
		ws.getRow(2).createCell(3).setCellValue("Good");
		ws.getRow(3).createCell(3).setCellValue("Good");
		ws.getRow(4).createCell(3).setCellValue("Bad");
		
		
		
		FileOutputStream fo = new FileOutputStream(src);
		
		wb.write(fo);
		wb.close();
		fo.close();
		fi.close();
		
		
	}

}
