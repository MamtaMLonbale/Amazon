package com.qa.AmazonPages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	public WebDriver driver=null;
	public HomePage LaunchAmazonSite()  {
		WebDriverManager.chromedriver().driverVersion("109").setup();
		System.out.println("webdriver version 103");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome Driver");
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return new HomePage(driver);
	}
}
