package com.acttime.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Workbook {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\SeleniumActtimeFramework\\test1.xlsx");
		String wb= WorkbookFactory.create(fis).getSheet("sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(wb);
		
		

	}

}
