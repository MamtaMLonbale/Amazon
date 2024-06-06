import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class simpleProgram {

	public static void main(String[] args) {
		WebDriver driver=null;
		driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

	}

}
