package com.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
		XSSFWorkbook wb;
		XSSFSheet sh;

		public  ReadExcel(String excelPath){
			try {
				File ff = new File("C:\\Users\\PRIYANKA\\OneDrive\\Desktop\\Excel1.xlsx");
				FileInputStream fs = new FileInputStream(ff);
				wb = new XSSFWorkbook(fs);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		public String getData(int sheetNumber, int row, int column) {
			
			String data;
			sh = wb.getSheetAt(sheetNumber);

			try {
				data = sh.getRow(row).getCell(column).getStringCellValue();
				return data;
			} catch (Exception e) {
				data = sh.getRow(row).getCell(column).getNumericCellValue() + "C:\\Users\\PRIYANKA\\OneDrive\\Desktop\\Excel1.xlsx";
				return data;
			}
		}

		public int getRowCount(int sheetIndex) {
			int row = wb.getSheetAt(sheetIndex).getLastRowNum();
			row = row + 1;
			return row;
		}

		public int getColCount(int sheetIndex) {
			int col = wb.getSheetAt(sheetIndex).getRow(0).getPhysicalNumberOfCells();

			return col;
		}
}
	


	
	


