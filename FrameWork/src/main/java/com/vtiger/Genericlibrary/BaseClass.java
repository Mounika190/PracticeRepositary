package com.vtiger.Genericlibrary;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	WebDriver driver;
	
	public static void main(String[]args) throws IOException
	{
		
		FileLib.getpropertykeyvalue("Browser");
		
		
	}
	

}
