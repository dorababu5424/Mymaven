package org.dataframe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DataTruncation;
import java.sql.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadrveframe {
	private static final String SimpleDateFormat = null;

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\DORABABU\\eclipse-workspace\\Myprojectmaven54\\files\\data.xlsx");
		
		FileInputStream stream = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(stream);
		
		Sheet s = w.getSheet("data");
		
		int rows = s.getPhysicalNumberOfRows();
		for (int i = 0; i < rows; i++) {
			Row row = s.getRow(i);
			int Cells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < Cells; j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				if (cellType==1) {
					String value = cell.getStringCellValue();
					System.out.println(value);
					}else if (DateUtil.isCellDateFormatted(cell)) {
						Date d = (Date) cell.getDateCellValue();
						//java.text.SimpleDateFormat sim = new java.text.SimpleDateFormat("dd-MM-yyyy");
						
						System.out.println(d);
					}else {
						double d = cell.getNumericCellValue();
						
						long l = (long) d;
					String value =  String.valueOf(l);
					System.out.println(value);
				}
				
				
			}
		}
		
	
	}

}
