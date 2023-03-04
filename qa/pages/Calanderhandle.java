package com.actitime.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.actitime.qa.Base.TestBase;

public class Calanderhandle extends TestBase {
	 public static void calander() {
			//calander
			
			//driver.findElement(By.xpath("//button[@id='ext-gen610']")).click();
			
			
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//table[@id='ext-gen631']")));
		
	         getMYD("28","February","2025");
		}
		
		public static String[] splitMY(String monyr)
		{
			
			
			return monyr.split(" ");
			
			
		}
		
		public static void getMYD(String date,String exmonth,String exyear)
		{
			if(Integer.parseInt(date)>29&& exmonth.contains("Feb")) 
			{
				System.out.println("oops you entered worng date"+  date + exmonth);
				return;
			}

}
}

