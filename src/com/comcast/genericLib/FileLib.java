package com.comcast.genericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
       
	public String getPropertyKeyValue(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./Data/CommonData.properties");
	    Properties pObj=new Properties();
	    pObj.load(fis);
	    String value=pObj.getProperty(key);
	    return value;
		
	}
	public String getExcelData(String sheetName,int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Data/createOpportunity.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row row=sh.getRow(rowIndex);
		Cell cel=row.getCell(cellIndex);
		String data=cel.getStringCellValue();
		return data;
		
	}
	public int getRowCount(String sheet) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Data/createOpportunity.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
	   Sheet sh=	wb.getSheet(sheet);
	   int rowCount=sh.getLastRowNum();
		return rowCount;
		
	}
}
