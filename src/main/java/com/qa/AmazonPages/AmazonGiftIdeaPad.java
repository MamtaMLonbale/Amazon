package com.qa.AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonGiftIdeaPad {
	WebDriver driver = null;

	public AmazonGiftIdeaPad(WebDriver driver) {
		this.driver = driver;
	}

	public void amazonLaunch() {
		System.out.println("--------Start amazon lunchpad--------");
		driver.findElement(By.xpath("//a[contains(text(),'Amazon Launchpad')]")).click();
		System.out.println("--------End amazon lunchpad--------");

	}

	public HyperLinks amazonRenewed() {
		System.out.println("--------Start amazon Renewed--------");
		// driver.findElement(By.xpath("//a[contains(text(),'Amazon
		// Renewed')]")).click();
		System.out.println("--------End amazon Renewed--------");
		return new HyperLinks(driver);
	}

}
