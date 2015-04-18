package Com.LPL.Library;

import junit.framework.Assert;

import org.openqa.selenium.By;

public class projectSpecific extends SuperTestNG {

	public static void login(String un, String pwd)
	{
		driver.findElement(By.name("username")).sendKeys(un);
	}
	
	public static void logout()
	{
	driver.findElement(By.name("logout")).click();
	}
	public static void verifyTitle(String eTitle)
	{
		//Genric.explicitWait(3);
		String aTitle = driver.getTitle();
		Assert.assertEquals(aTitle,eTitle);
		
	}
}
