package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import static utils.Utils.driver;

public class CalculadoraPage {

//	public CalculadoraPage (AppiumDriver<?> driver) {
//		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
//	}
//
//	@AndroidFindBy(id = "com.android.calculator2:id/digit_2")
//	private MobileElement tecla2;
//
//	@AndroidFindBy(id = "com.android.calculator2:id/op_add")
//	private MobileElement teclaMais;

	public void digitar2() {
		driver.findElement(By.id("com.android.calculator2:id/digit_2")).click();
	}

	public void acionarPlus() {
		driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
	}

}
