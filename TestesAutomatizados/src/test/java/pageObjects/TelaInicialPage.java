package pageObjects;

import static utils.Utils.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TelaInicialPage extends BasePage {
	
	Actions acao = new Actions(driver);

	public void acionarAbaAdmin() {
		abaAdmin.click();
	}
	
	@FindBy(id = "btnAdd")
	private WebElement botaoAdd;
	
	public void acionarBotaoAdd() {
		botaoAdd.click();
	}
	
	public void acessarMenuCustomField() {
		acao.moveToElement(abaPim).build().perform();
		acao.moveToElement(menuConfiguration).build().perform();
		acao.moveToElement(menuCustomFields).click().build().perform();
	}
	
}
