package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	ChromeDriver chrome;
  
  @Parameters({"config"})
  @Test
  public void f(String key) throws InterruptedException {
	  System.setProperty(key,"C:\\Users\\tanma\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("pratik");
		driver.findElement(By.name("password")).sendKeys("pratik123");
		driver.findElement(By.name("login")).click();
		
		///html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a
		driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();

		
  }
}
