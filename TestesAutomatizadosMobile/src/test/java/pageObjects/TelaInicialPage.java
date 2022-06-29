package pageObjects;

import static utils.Utils.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TelaInicialPage {
	
//	public TelaInicialPage(AppiumDriver<?> driver) {
//		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
//	}
//
//	@AndroidFindBy(id = "com.google.android.keep:id/skip_welcome")
//	private AndroidElement btnGetStarted;
//	
//	@AndroidFindBy(id = "com.google.android.keep:id/new_note_button")
//	private AndroidElement btnNewNote;
//	
//	@AndroidFindBy(xpath = "//android.widget.EditText[@text = \"Title\"]")
//	private AndroidElement campoTitle;
//	
//	@AndroidFindBy(xpath = "//android.widget.EditText[@text = \"Note\"]")
//	private AndroidElement campoNote;
//	
//	@AndroidFindBy(accessibility = "Navigate up")
//	private AndroidElement btnBack;
	
	public void acionarBtnGetStarted() {
		driver.findElement(By.id("com.google.android.keep:id/skip_welcome")).click();
	}
	
	public void acionarBtnNewNote() {
		driver.findElement(By.id("com.google.android.keep:id/new_note_button")).click();
	}
	
	public void informarCampoTitle(String title) {
		driver.findElement(By.xpath("//android.widget.EditText[@text = \"Title\"]")).sendKeys(title);
	}
	
	public void informarCampoNote(String note) {
		driver.findElement(By.xpath("//android.widget.EditText[@text = \"Note\"]")).sendKeys(note);
	}
	
	public void acionarBtnBack() {
		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc = \"Navigate up\"]")).click();
	}	
	
}
