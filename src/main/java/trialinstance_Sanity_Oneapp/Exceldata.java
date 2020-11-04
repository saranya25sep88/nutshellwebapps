package trialinstance_Sanity_Oneapp;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;


public class Exceldata {
	
	public static WebDriver driver;
	
	public static String excelRead(int row, int cell) throws Throwable
	 {
	 String cellValue;
	 try
	 {
	 File f = new File("C:\\Users\\dhilli.babu\\eclipse-workspace\\Nutshell\\Instance_sanity_oneapp\\src\\test\\resources\\testdata.xlsx");
	FileInputStream fin = new FileInputStream(f);
	XSSFWorkbook wb = new XSSFWorkbook(fin);
	XSSFSheet sheet = wb.getSheet("Sheet1");
	XSSFCell cell2 = sheet.getRow(row).getCell(cell);
	CellType cellType2 = cell2.getCellType();
	cellValue = null;
	if(cellType2.equals(cellType2.STRING))
	{
	cellValue = cell2.getStringCellValue();
	System.out.println(cellValue);
	}
	else if(cellType2.equals(cellType2.NUMERIC))
	{
	double numericCellValue = cell2.getNumericCellValue();
	long l = (long) numericCellValue;
	cellValue = String.valueOf(l);

	}
	 }catch(Exception e)
	{
	e.printStackTrace();
	throw new Exception();
	 }
	 System.out.println(cellValue);
	return cellValue;

	 }
}
