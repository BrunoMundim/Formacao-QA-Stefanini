package pageObjects;

import static utils.Utils.*;

import org.openqa.selenium.By;

public class TelaConfiguracoesPage {

	public void abrirMenuSettings() {
		driver.findElement(By.id("com.google.android.keep:id/drawer_link_settings")).click();
	}
	
	public void addNewItensToBottom() {
		driver.findElement(By.id("com.google.android.keep:id/settings_add_new_items_to_bottom")).click();
	}
	
}
