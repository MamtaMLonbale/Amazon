package com.qa.AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OtherFunctionality {
	WebDriver driver = null;

	public OtherFunctionality(WebDriver driver) {
		this.driver = driver;
		System.out.println("----OtherFunctionality constructer------");
	}

	public void ClickOnAll() {
		System.out.println("------start All method------");
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
		System.out.println("----end on ALL method ----");

	}

	public void clickOnNewReleases() {
		System.out.println("---start best seller method---");
		// driver.findElement(By.xpath("//a[@class='hmenu-item' and href]"))
		// and a[contains(text(),'Best Sellers') and @class='hmenu-item']
		driver.findElement(By.xpath(
				"//a[contains(text(),'Best Sellers') and @class='hmenu-item']/preceding::a[contains(text(),'New Releases')and @class='hmenu-item']"))
				.click();
	}

	/*
	 * public void clickOnFirstItem() {
	 * System.out.println("----click on first item from new release page----- ");
	 * //driver.findElement(By.
	 * xpath("//div[@class='p13n-sc-truncate-desktop-type2  p13n-sc-truncated' and contains(text(),'TheGiftKart Ultra-Hybrid Clear Back Case Cover for iPhone 12/12 PRO | Shockproof Design | Camera Protection Bump | Hard Back |…')]//preceding::span[1]"
	 * )).click(); driver.findElement(By.
	 * xpath("//div[@class='p13n-sc-truncate-desktop-type2  p13n-sc-truncated' and contains(text(),'WishCare Multipurpose Eco Friendly Travel Pouch')]//preceding::span[1]"
	 * )).click(); System.out.println("---end click on first item method-----"); }
	 */
	public void clickOnMoversAndShakers() {
		System.out.println("-----start movers and shakers method-------");
		// driver.findElement(By.xpath("//a[contains(text(),'Movers and
		// Shakers')]//preceding::div[@class='_p13n-zg-nav-tab-all_style_zg-tabs-li-div__1YdPR']//preceding::div[@class='_p13n-zg-nav-tab-all_style_zg-tabs-li-selected-div__3tHnP']")).click();
		driver.findElement(By.xpath(
				"//div[@class='_p13n-zg-nav-tab-all_style_zg-tabs-li-div__1YdPR']//preceding::div[@class='_p13n-zg-nav-tab-all_style_zg-tabs-li-selected-div__3tHnP']//following::a[contains(text(),'Movers and Shakers')]"))
				.click();
		System.out.println("-----end movers and shakers method-------");
	}

	public void clickOnMostWishesFor() {
		System.out.println("-----start most wishes for method-------");
		driver.findElement(By.xpath(
				"//div[@class='_p13n-zg-nav-tab-all_style_zg-tabs-li-div__1YdPR']//preceding::div[@class='_p13n-zg-nav-tab-all_style_zg-tabs-li-selected-div__3tHnP']//following::a[contains(text(),'Most Wished For')]"))
				.click();
		System.out.println("-----end most wishes method-------");
	}

	public AmazonGiftIdeaPad clickOnMostgifted() {
		System.out.println("-----start most gifted method-------");
		driver.findElement(By.xpath(
				"//div[@class='_p13n-zg-nav-tab-all_style_zg-tabs-li-div__1YdPR']//preceding::div[@class='_p13n-zg-nav-tab-all_style_zg-tabs-li-selected-div__3tHnP']//following::a[contains(text(),'Most Gifted')]"))
				.click();
		System.out.println("-----end most gifted method-------");
		return new AmazonGiftIdeaPad(driver);
	}

}