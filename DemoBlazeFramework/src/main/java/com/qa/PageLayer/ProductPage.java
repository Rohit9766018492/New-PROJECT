package com.qa.PageLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Testbase.TestBase;

public class ProductPage extends TestBase {

	public ProductPage() throws IOException {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[contains(text(),'Laptops')]")
	private WebElement Laptop;
	
	@FindBy(xpath="(//img[@class='card-img-top img-fluid'])[1]")
	private WebElement VivoI5;
	
	@FindBy(xpath="(//img[@class='card-img-top img-fluid'])[2]")
	private WebElement VivoI7;
	
	@FindBy(xpath="(//img[@class='card-img-top img-fluid'])[3]")
	private WebElement VivoICore5;
	
	public void clickonLaptop()
	{
		Laptop.click();
	}
	
	public void buyVivoI5()
	{
		VivoI5.click();
	}
	public void buyVivoI7()
	{
		 VivoI7.click();
	}
	public void buyVivoICore5()
	{
		VivoICore5.click();
	}
	
	
}
