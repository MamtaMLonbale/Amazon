package com.qa.AmazonPages;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ExcelReader.WriteExcel;

public class BagCollectionPage {
	WebDriver driver = null;

	public BagCollectionPage(WebDriver driver) {
		this.driver = driver;
		System.out.println("this is bagcollection constructor");
	}

	public WriteExcel getItemList() {
		System.out.println("Enter into getItemList........");
		List<WebElement> nameOfItem = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

		List<WebElement> priceOfItem = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		Map<String, String> map = new HashMap<String, String>();
		Iterator<WebElement> itemNameItr = nameOfItem.iterator();
		Iterator<WebElement> itemPriceItr = priceOfItem.iterator();
		while (itemNameItr.hasNext() && itemPriceItr.hasNext()) {

			System.out.println(itemNameItr.next().getText());
			System.out.println(itemPriceItr.next().getText());
		}

		return new WriteExcel(driver);
	}
public String	getResultOfBagsText()
	{
		WebElement resultWebElement=driver.findElement(By.xpath("//span[@class='a-size-medium-plus a-color-base a-text-bold'][1]"));
		return resultWebElement.getText();
	}

	public BagDetailPage clickOnFirstBag() {
		System.out.println("this is clickOnFirstBag method");
		WebElement firstBag=driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][1]"));
		firstBag.click();
		System.out.println(".....end of clickOnFirstBag method.........");
		return new BagDetailPage(driver);
	}

	public String getBackToResultText() throws InterruptedException
	{
		System.out.println("This is a getBackToResultText().....");
		Thread.sleep(5000);
	WebElement backToResultWebElement=driver.findElement(By.xpath("//span[@class='a-list-item'][1]"));
		//WebElement backToResultWebElement=driver.findElement(By.xpath("//h5[@class='a-size-base']"));
		String backToResultText=backToResultWebElement.getText();
		System.out.println("Back to result....."+backToResultText);
		return backToResultText;
	}
	
	public void clickOnSecondBag() {
		System.out.println("------Click on second bag-------");
	}
}
