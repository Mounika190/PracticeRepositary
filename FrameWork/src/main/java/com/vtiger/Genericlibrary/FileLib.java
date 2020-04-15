package com.vtiger.Genericlibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileLib {
	public static String value;
	public static String getpropertykeyvalue(String Key) throws IOException
	
	{
		FileInputStream fis=new FileInputStream("./Data/dataa.properties.txt") ;
		Properties Pobj=new Properties();
		Pobj.load(fis);
		String URL=Pobj.getProperty("URL");
		String UserName=Pobj.getProperty("UserName");
		String Password=Pobj.getProperty("PassWord");
		String Browser=Pobj.getProperty("Browser");
		value=Pobj.getProperty(Key);
		return value;
		
		
		
		

	}

}
