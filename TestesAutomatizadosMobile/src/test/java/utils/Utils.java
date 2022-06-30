package utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.cucumber.core.api.Scenario;

public class Utils {

	public static AppiumDriver<WebElement> driver;

	public static void acessarKeep() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability("appPackage", "com.google.android.keep");
		desiredCapabilities.setCapability("appActivity", "com.google.android.apps.keep.ui.activities.BrowseActivity");

		URL remoteURL = new URL("http://localhost:4723/wd/hub");
		
		driver = new AppiumDriver<WebElement>(remoteURL, desiredCapabilities);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void fecharCalculadora() {
		driver.quit();
	}
	
	public static void capturarScreenshot (Scenario scenario) {
		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
	}

}
