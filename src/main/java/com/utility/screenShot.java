package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenShot {
	public static WebDriver driver = null;

	public static void Screenshot(String fileName) throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\Mamta\\eclipse-workspace\\Amazon\\src\\main\\java\\ScreenShot" + fileName + ".jpeg"));
		System.out.println("----------ScreenShot---------");
	}

}
