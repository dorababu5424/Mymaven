package org.dataframe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatingFile {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\DORABABU\\eclipse-workspace\\Myprojectmaven54\\files\\data3.xlsx");
		FileInputStream fil = new FileInputStream(f);
				Workbook w = new XSSFWorkbook(fil);
				
			Sheet s = w.getSheet("inputdata");
				Row row = s.getRow(1);
				Cell cell = row.getCell(2);
				String value = cell.getStringCellValue();
				if (value.equals("Dorababu")) {
					cell.setCellValue("weburl");
				}
			FileOutputStream fil1 = new FileOutputStream(f);
			w.write(fil1);
		
	}

}
