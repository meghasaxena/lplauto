package Com.LPL.Library;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class SuperTestNG {
  
	public static WebDriver driver;
  
  
  @BeforeMethod
  public void PreCondition() {
  String xlPath="./testdata/Config.xlsx";
  String sheetName="sheet1";
  String browserType=Genric.getXLCellValue(xlPath,sheetName,0,1);
  //open browser
  }
  

  @AfterMethod
  public void PostCondition() {
	  //quit all browser
  }

}
