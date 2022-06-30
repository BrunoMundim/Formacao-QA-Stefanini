package pageObjects;

import static utils.Utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import io.appium.java_client.MobileBy;

public class ExcluirNotaPage {

	Actions acao = new Actions(driver);
	
	public void cliqueLongo(String titulo) {
		try { Thread.sleep(10000); } 
		catch (InterruptedException e) { e.printStackTrace(); }
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true))" +
		        ".scrollIntoView(new UiSelector().text(\"" + titulo + "\"))"
		        ));
		acao.clickAndHold(driver.findElement(By.xpath("//android.widget.TextView[@text = \""+ titulo +"\"]"))).perform();
	}
	
	public void acionarMenuTresPontos() {
		driver.findElementByAccessibilityId("More options").click();
	}
	
	public void acionarDelete() {
		driver.findElement(By.xpath("//android.widget.TextView[@text= \"Delete\"]")).click();
	}
	
}
