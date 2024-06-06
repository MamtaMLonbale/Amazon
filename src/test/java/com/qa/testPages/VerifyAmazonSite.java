package com.qa.testPages;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ExcelReader.WriteExcel;
import com.google.common.annotations.VisibleForTesting;
import com.qa.AmazonPages.AmazonGiftIdeaPad;
import com.qa.AmazonPages.BagCollectionPage;
import com.qa.AmazonPages.BagDetailPage;
import com.qa.AmazonPages.CartPage;
import com.qa.AmazonPages.HomePage;
import com.qa.AmazonPages.HyperLinks;
import com.qa.AmazonPages.LaunchBrowser;
import com.qa.AmazonPages.OtherFunctionality;
import com.utility.TakeScreenShot;
import com.utility.screenShot;

public class VerifyAmazonSite {
	HomePage homePage;
	LaunchBrowser launchBrowser = new LaunchBrowser();
	BagCollectionPage bagCollection;
	BagDetailPage bagDetails;
	CartPage cart;
	WriteExcel w;
	OtherFunctionality o;
	AmazonGiftIdeaPad a;
	HyperLinks h;

	{
		System.out.println("hi");
	}

	@BeforeTest
	void lunchAmazonSite() {
		homePage = launchBrowser.LaunchAmazonSite();
	}

	@Test(priority = 0)
	void varifyDeliveryDayTitle() throws InterruptedException, IOException {

		System.out.println("------lunch Amazon Site------");
		// TakeScreenShot.screenShot("Amazon_Demo");
		// wait(5000);
		// screenShot.Screenshot("Amazon_DashBoard");
		bagCollection = homePage.Search_item();
		System.out.println("----Enter Item-----");
		String actualCategoryText = homePage.getDeliveryDayText();
		String expectedCategoryText = "delivery day";
		Assert.assertEquals(actualCategoryText, expectedCategoryText, "Incorrect category title");
	}

	@Test(priority = 1, dependsOnMethods = { "varifyDeliveryDayTitle" }, alwaysRun = true)
	void VerifyResultTitle() throws IOException {
		bagCollection.getItemList();
		String expectedResult = "result";
		String actualResult = bagCollection.getResultOfBagsText();
		Assert.assertEquals(actualResult, expectedResult, "Incorrect result title");
		// screenShot.Screenshot("Amazon_ItemList");
		// b.clickOnAddToCart();
		// b.clickOnSecondBag();

	}

	@Test(priority = 2, dependsOnMethods = { "varifyDeliveryDayTitle" }, alwaysRun = true)
	void verifyBackToResultText() throws IOException, InterruptedException {
		bagDetails = bagCollection.clickOnFirstBag();
		String actualBackToResultText = bagCollection.getBackToResultText();
		String expectedBackToResultText = "Back to Result";
		Assert.assertEquals(actualBackToResultText, expectedBackToResultText, "Incorrect back to Results text");
	}

	@Test(priority = 3, dependsOnMethods = { "verifyBackToResultText" }, alwaysRun = true)
	void verifyBackToResultFunctionality() throws InterruptedException, AWTException {
		bagDetails.clickOnBackToResult();
	}

	@Test(priority = 3, dependsOnMethods = { "verifyBackToResultText" }, alwaysRun = true)
	void verifyAddToCartText() throws InterruptedException, AWTException {
		cart = bagDetails.clickOnAddToCart();
		String actualAddedToCartText = bagDetails.getAddedToCartText();
		String expectedAddedToCartText = "added to cart";
		Assert.assertEquals(actualAddedToCartText, expectedAddedToCartText, "Incorrect added to cart Text");

	}
	// o.ClickOnAll();
	// // screenShot.Screenshot("Amazon_Extra_Functionality");
	// o.clickOnNewReleases();
	// // o.clickOnFirstItem();
	// o.clickOnMoversAndShakers();
	// o.clickOnMostWishesFor();
	// a = o.clickOnMostgifted();

	@Test(priority = 3)
	void validAmazonGiftidea() {
		a.amazonLaunch();
		h = a.amazonRenewed();
	}

	@Test(priority = 4)
	void validLinks() {
		h.gettingAllLinks();

		h.RightClickOnPage();
	}

}
