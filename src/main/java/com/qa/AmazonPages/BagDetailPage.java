package com.qa.AmazonPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BagDetailPage {
	WebDriver driver;
	public BagDetailPage(WebDriver driver) {
		this.driver=driver;
		
	}
	public HomePage clickOnBackToResult() throws InterruptedException, AWTException
	{
		Thread.sleep(5000);
//		WebElement backToResult=driver.findElement(By.xpath("//span/a[@id='breadcrumb-back-link']"));
//		backToResult.click();
		Robot robot=new Robot();
		robot.mouseMove(70,350);
		
		return new HomePage(driver);
	}
	
	  public CartPage clickOnAddToCart() throws InterruptedException, AWTException {
		  Thread.sleep(5000);
		  Robot robot=new Robot();
		  robot.mouseMove(1200, 580);
		  robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		  robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		  
	//driver.findElement(By.xpath("")).click();
	// driver.findElement(By.xpath("//span[@class='a-button-inner']//i[@class='a-icon a-icon-cart'][1]")).click();
	
	
	//driver.findElement(By.xpath("//span[@id='submit.buy-now-announce']")).click();
	System.out.println("clicked on Buy now");
	return new CartPage(driver);
	
	 }
	  public String getAddedToCartText() throws InterruptedException
		{
			Thread.sleep(4000);
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)", "");
			Thread.sleep(4000);
			WebElement addedToCartWebelement=driver.findElement(By.xpath("//h3[@class='product-facts-title'][1]"));
			String addedToCartText=addedToCartWebelement.getText();
			return addedToCartText;
		}


}
