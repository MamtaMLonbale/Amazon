package com.ExcelReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class WriteExcel {
	WebDriver driver;
	public WriteExcel(WebDriver driver) {
		this.driver=driver;
		System.out.println("this is constructor of writeExcel");
		
	}
	public static void main(String[] args) throws IOException {
	
	
		Map<String,Object> info=null;
		String sheetName=null;
		String fileName=null;
	 	//public void writeExcelFile(String sheetName,String fileName)
		//{
	 
	File file=new File("C:\\FileWriting\\myAmazonExcel.txt");
	XSSFWorkbook workbook;
	if(file.exists())
	{
		FileInputStream fis=new FileInputStream(file);
		workbook=new XSSFWorkbook(fis);
		if(workbook.getSheetIndex(sheetName)>=0)
		{
			workbook.removeSheetAt(workbook.getSheetIndex(sheetName));
		}
	}
	else
	{
		workbook=new XSSFWorkbook(); 
	}
	XSSFSheet spreadsheet=workbook.createSheet();
	XSSFRow row;
	int rowid=0;
	
	Set<String> keyID=info.keySet();
	for(String key:keyID)
	{
		row = spreadsheet.createRow(rowid++);
		Object [] objectArr = (Object[]) info.get(key);
		int cellid=0;
		for(Object obj : objectArr)
		{
			Cell cell = row.createCell(cellid++);
			cell.setCellValue((String)obj);
		}
	}
	FileOutputStream out = new FileOutputStream(new File("//src/TestData/NewExel.xlsx"));
	workbook.write(out);
	out.close();
	
	}


		
	
	public static void writeDataExcelFile(Map<String, Object[]> productDetail, String searchString, String string) {
		// TODO Auto-generated method stub
		
	}
}


