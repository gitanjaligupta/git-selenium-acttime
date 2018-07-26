package com.acttime.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtilsClass {
	String excelpath= "C:\\Users\\hp\\eclipse-workspace\\seleinmFramework\\test.xlsx";
	public Properties getPropertiessFileobj() throws IOException
	{FileInputStream fis= new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\SeleniumActtimeFramework\\testdata.properties");
	Properties pobj= new Properties();
	pobj.load(fis);
	return pobj;
	}
    public String getexcelData(String sheetName, int rowNum,int colNum) throws EncryptedDocumentException, InvalidFormatException, IOException {
    FileInputStream fis= new FileInputStream(excelpath);
    Workbook wb=WorkbookFactory.create(fis);
    Sheet sht =wb.getSheet(sheetName);
    Row row = sht.getRow(rowNum);
    String data =row.getCell(colNum).getStringCellValue();
    wb.close();
    return data;}
    public void setexcelData(String sheetName, int rowNum,int colNum, String data) throws EncryptedDocumentException, InvalidFormatException, IOException {
        FileInputStream fis= new FileInputStream(excelpath);
        Workbook wb=WorkbookFactory.create(fis);
        Sheet sht =wb.getSheet(sheetName);
        Row row = sht.getRow(rowNum); 
        FileOutputStream fos =new FileOutputStream(excelpath);
        Cell cel= row.createCell(colNum);
        
        cel.setCellValue(data);
        
        wb.write(fos);
        wb.close();

}}
