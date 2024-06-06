package com.qa.AmazonPages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class HomePage {
	//public WebDriver driver=null;
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public BagCollectionPage Search_item() throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println("befour search box");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
		System.out.println("befour click on search icon");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		return new BagCollectionPage(driver);
	}
	public String getDeliveryDayText() throws InterruptedException
	{
		Thread.sleep(4000);
     WebElement category=driver.findElement(By.xpath("//span[@class='a-size-base a-color-base puis-bold-weight-text'][1]"));
     String categoryText=category.getText();
	return categoryText;
	}

}
