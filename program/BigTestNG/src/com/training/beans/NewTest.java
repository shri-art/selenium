package com.training.beans;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

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
	  public void openBrowser(String key) throws InterruptedException {
		 System.setProperty(key,"C:\\Users\\tanma\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		  chrome= new ChromeDriver();
		  chrome.get("http://www.newtours.demoaut.com/");
			
	  }
		@Test(priority =1 , dataProvider="dp")
		public void loginTest(String un,String pwd) throws Exception
		{
			Thread.sleep(3000);
		/*
		 * chrome.findElement(By.id("txtUsername")).sendKeys(un);
		 * chrome.findElement(By.id("txtPassword")).sendKeys(pwd);
		 * chrome.findElement(By.id("btnLogin")).click();
		 */
			chrome.findElement(By.name("userName")).sendKeys(un);
			chrome.findElement(By.name("password")).sendKeys(pwd);
			chrome.findElement(By.name("login")).click();
			
			///html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a
			chrome.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();


		}
		@AfterTest
		public void closeBrowser()
		{
			chrome.close();
		}	
}
