package com.pojo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\Arthiha\\Downloads\\Data.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(fis);
		
		Sheet s = w.getSheet("Sheet1");
		
		int i = s.getPhysicalNumberOfRows();
		System.out.println(i);
		
		Row r = s.getRow(1);
		
		int j = r.getPhysicalNumberOfCells();
		System.out.println(j);
		
		Cell c = r.getCell(1);
		
		CellType cellType = c.getCellType();
		
		if (cellType.equals(CellType.STRING)) {
			String value = c.getStringCellValue();
			System.out.println(value);
		}else {
			double d = c.getNumericCellValue();                 //10= 10.0 -> 20.3=> 20.3
			int c1=(int) d;
			System.out.println(c1);
		}
	}

}
