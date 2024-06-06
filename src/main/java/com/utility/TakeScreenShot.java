package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenShot {
 public static WebDriver driver=null;

public static void screenShot(String fileName) throws IOException
{
	System.out.println("---Ready to Screen shot----");
	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println("-------Take Screen shot------");
	FileUtils.copyDirectory(file, new File("C:\\Users\\Mamta\\eclipse-workspace\\Amazon\\src\\main\\java\\com\\utility\\ScreenshotDemo\\"+fileName+".jpg"));
	System.out.println("----store screen shot-----");
}
}