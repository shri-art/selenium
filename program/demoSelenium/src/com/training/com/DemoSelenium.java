package com.training.com;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSelenium {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tanma\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("pratik");
		driver.findElement(By.name("password")).sendKeys("pratik123");
		driver.findElement(By.name("login")).click();
		
		///html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a
		driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
	}
}
