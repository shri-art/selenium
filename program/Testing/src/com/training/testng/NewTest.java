package com.training.testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class NewTest {
	
	ChromeDriver chrome;
	
	@DataProvider(name="dp")
	public Object [][] storeData()
	{
		return new Object[][]
				{
			{"Admin12","admin123"},
			{"pratik","pratik123"}
				};
	}
	
  @Parameters({"config"})
	@Test
  public void openBroswer(String key) {
	  System.setProperty(key,"C:\\Users\\tanma\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
	  chrome=new ChromeDriver();
	  chrome.get("http://www.newtours.demoaut.com");
  }

  
  
  @Test(priority=1, dataProvider="dp")
  public void login(String un,String pass)
  {
		chrome.findElement(By.name("userName")).sendKeys(un);
		chrome.findElement(By.name("password")).sendKeys(pass);
		chrome.findElement(By.name("login")).click();
		chrome.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();

  }/*
  @AfterTest
  public void afterTest() {
	  
	  chrome.close();
  }*/

}
