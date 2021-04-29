package component;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	static WebDriver driver;

	public static String getValFromProp(String keyVal) {
		Properties prop = new Properties();

		FileReader reader = null;
		
		try {
			reader = new FileReader(
					System.getProperty("user.dir") + "\\src\\test\\resources\\config\\config.properties");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		try {
			prop.load(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (String key : prop.stringPropertyNames()) {
			if (key.equals(keyVal)) {
				return prop.getProperty(keyVal);
			}
		}
		return null;
	}

	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		opentheapp();
		return driver;
	}

	public void opentheapp() {
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(BaseClass.getValFromProp("URL"));
		waitForPageLoaded();
	}

	public void closeBrowserSession() {
		driver.quit();
	}

	public void waitForPageLoaded() {
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
						.equals("complete");
			}
		};
		try {
			Thread.sleep(1000);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(expectation);
		} catch (Throwable error) {
			
			//Assert.fail("Timeout waiting for Page Load Request to complete.");
		}
	}
}



