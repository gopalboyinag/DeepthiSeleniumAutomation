package com.deepthi.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MavenFirstTestCase {

	@Test
	public void testMethod1()
	{
		
	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//driver.findElement(By.linkText("Login")).click();
		
		//driver.findElement(By.xpath("//*[@id='fk-mainhead-id']/div[2]/div/div/ul/li[1]")).
		driver.findElement(By.partialLinkText("Log")).click();
	}
	
	@Test
	public void testMethod2()
	{
		System.out.println("testMethod2");
	}

}
