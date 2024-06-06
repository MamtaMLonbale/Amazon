package com.qa.AmazonPages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.utility.ScrollPage;

public class HyperLinks {
	 WebDriver driver;

	public HyperLinks(WebDriver driver) {
		this.driver=driver;
	}
	public void gettingAllLinks()
	{
		List<WebElement> links=driver.findElements(By.xpath("//a[@href]"));
	  
		System.out.println("getting all links:"+links);
		Iterator<WebElement> itr=links.iterator();
		while(itr.hasNext())
		{
			System.out.println("List of links:"+itr.next().getAttribute("href"));
	}
			
	}
	/*public void scrollPage()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2000)");
}*/
	
	public void RightClickOnPage()
	{
	//ScrollPage.scrolldown(driver);
		Actions a=new Actions(driver);
	//a.contextClick(driver.findElement(By.xpath("//a[contains(text(),'Body')]"))).perform();
	//a.contextClick(driver.findElement(By.xpath("//div[contains(text(),'Get to Know Us')]"))).perform();
		a.contextClick(driver.findElement(By.xpath("//div[contains(text(),'Get to Know Us')]"))).perform();
		//a.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Get to Know Us')]"))).contextClick().build().perform();
		
	System.out.println("Right click on webpage:");
	
	}
	

}
