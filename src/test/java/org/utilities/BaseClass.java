package org.utilities;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public void launch(String Url) {
		driver.get(Url);
	}
	
	public static void fill(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void CloseBrowser() {
		driver.quit();
	}
	public static void applyWaitToAllLocators() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	public static void takesnap(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(
				"C:\\Users\\yogav\\eclipse-workspace\\AdactinJuly\\src\\test\\resources\\Screenshot\\"+ filename +".png");
		FileUtils.copyFile(src, dest);
		
	}
	
	
	
	
	
	
}
