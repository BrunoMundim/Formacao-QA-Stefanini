package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelaInicialPage extends BasePage {

	public void acionarAbaAdmin() {
		abaAdmin.click();
	}
	
	// Elementos
	@FindBy(id = "btnAdd")
	private WebElement botaoAdd;
	
	public void acionarBotaoAdd() {
		botaoAdd.click();
	}
	
}
