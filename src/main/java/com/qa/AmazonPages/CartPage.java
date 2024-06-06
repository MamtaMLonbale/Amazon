package com.qa.AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	WebDriver driver;

	public CartPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickOnGoToCart()
	{
		WebElement goToCart=driver.findElement(By.xpath("//a[@class='a-button-text'][3]"));
		goToCart.click();
	}
	

}
