package com.actitime.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
	 public static Properties prop;
	 public static WebDriver driver;
	 public FileInputStream fip;
	 static {
			System.setProperty("webdriver.edge.driver","./Driverfile/msedgedriver.exe");
			System.setProperty("webdriver.chrome.driver","./Driverfile/chromedriver.exe");

		}
	
	public TestBase() 
	{
		
		try {
		 prop=new Properties();
		
		fip=new FileInputStream("C:\\Users\\TECH\\eclipse-workspace\\ActiUserModule\\src\\main\\java\\com\\actitime\\qa\\utils\\config.file");
	    prop.load(fip);
	
        }
		catch(FileNotFoundException e)
		{
			System.out.println("file not found");
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
	public static  void Launchbrowser()
	{
		String browser=prop.getProperty("browser");
		if(browser.equals("Edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		
		
		
		driver.get(prop.getProperty("url"));
					
		
	}
	
	
	

}
