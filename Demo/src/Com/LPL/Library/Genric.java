package Com.LPL.Library;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Genric {
	
	public static int getXLRowCount(String xlPath,String sheetName)
	{
		int rowcount;
		try
		{
			FileInputStream fis =new FileInputStream(xlPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s=wb.getSheet(sheetName);
			rowcount=s.getLastRowNum();
		}
		
		catch(Exception e)
		{
			rowcount = -1;
		}
		return rowcount;
	}
public static String getXLCellValue(String xlPath,String sheetName, int rowNum, int cellNum)
{
	return sheetName;
	
}
	
	public static void explicitWait()
	{
		
	}
}
