package pageObjects;

import static utils.Utils.*;

import org.openqa.selenium.By;

public class TelaEditarNotaPage {
    
	public void editarNota(String oldTitle) {
		driver.findElement(By.xpath("//android.widget.TextView[@text = \"" + oldTitle + "\"]")).click();
	}
	
	public void editarTituloDaNota(String newTitle) {
		driver.findElement(By.id("com.google.android.keep:id/editable_title")).sendKeys(newTitle);
	}
	
}
