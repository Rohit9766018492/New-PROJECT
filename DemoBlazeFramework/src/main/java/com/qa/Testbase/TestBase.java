package com.qa.Testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.PageLayer.ProductPage;
import com.qa.Utility.UtilClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Properties pro; 
	public static EventFiringWebDriver e_driver;
	public static WebDriverListener listener;
	
	public  ProductPage p;
	public  UtilClass u;
	
	public TestBase() throws IOException
	{
		pro=new Properties();
		FileInputStream input=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\.metadata\\Constructor\\bin\\DemoBlazeFramework\\src\\main\\java\\com\\qa\\ConfigProperties\\Config.Properties");
	pro.load(input);
	
	}
	
	@Test
	public  void initilizatio() throws IOException
	{
		String BrowserName=pro.getProperty("browser");
		
		if(BrowserName.equalsIgnoreCase("chrome"))
			
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if(BrowserName.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if (BrowserName.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Browser not valid");
		}
		
		
		driver.get(pro.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().refresh();
		
//		e_driver=new EventFiringWebDriver (driver);
//		listener=new WebDriverListener();
//        e_driver.register( listener);
		driver=e_driver;
		
		p=new ProductPage();
		u=new UtilClass();
		
	}
	
//	@AfterMethod

//	public static void quit()
//	{
//		driver.quit();
//	}
}
