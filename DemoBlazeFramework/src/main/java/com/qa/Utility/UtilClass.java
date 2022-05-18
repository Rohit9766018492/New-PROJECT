package com.qa.Utility;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;

import com.qa.Testbase.TestBase;

public class UtilClass extends TestBase {

	public UtilClass() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void screenshot()
	{
		try
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
					File des=new File("C:\\Users\\Lenovo\\eclipse-workspace\\.metadata\\Constructor\\bin\\DemoBlazeFramework\\ScreenShot\\Laptop.png");
		  FileHandler.copy(src, des);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@FindBy(xpath="//a[contains(text(),'Add to cart')]")
	private WebElement AddTocart;
	public void addtoCart()
	{
		AddTocart.click();
	}
	
}
