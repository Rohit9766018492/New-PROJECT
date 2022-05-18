package com.qa.TestLayer;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qa.PageLayer.ProductPage;
import com.qa.Testbase.TestBase;
import com.qa.Utility.UtilClass;

public class TestClass extends TestBase{

	
	
	public TestClass() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void verifiedVivoI5() throws IOException  
	{
		
		p.clickonLaptop();
          p.buyVivoI5();
	      u.addtoCart();	
		      
	}
	
	@Test
	public void verifyVivoI7() throws IOException
	{
		
		p.clickonLaptop();
		p.buyVivoI7();
		u.addtoCart();
	}
	
	@Test
	public void verifyVivoICore5() throws IOException
	{
	
		p.clickonLaptop();
		p.buyVivoICore5();
	u.addtoCart();
	}
}
