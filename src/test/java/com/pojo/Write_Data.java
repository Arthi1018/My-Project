package com.pojo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	
	public static void main(String[] args) throws IOException {
		
        File f=new File("C:\\Users\\Arthiha\\Downloads\\Data.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(fis);
		
//		w.createSheet("Datas").createRow(0).createCell(0).setCellValue("Arthiha RK");
		
		w.getSheetAt(1).getRow(0).createCell(1).setCellValue(12);
		
		FileOutputStream fos=new FileOutputStream(f);
		
		w.write(fos);
	}

}
