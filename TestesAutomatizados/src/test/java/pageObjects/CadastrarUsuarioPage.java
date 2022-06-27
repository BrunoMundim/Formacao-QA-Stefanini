package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastrarUsuarioPage {

	@FindBy(name = "systemUser[employeeName][empName]")
	private WebElement campoEmployeeName;

	@FindBy(name = "systemUser[userName]")
	private WebElement campoUserName;

	@FindBy(name = "systemUser[password]")
	private WebElement campoPassword;

	@FindBy(name = "systemUser[confirmPassword]")
	private WebElement campoConfirmPassword;

	@FindBy(name = "btnSave")
	private WebElement botaoSave;

	public void informarCampoEmployeeName(String employeeName) {
		campoEmployeeName.sendKeys(employeeName);
	}

	public void informarCampoUserName(String userName) {
		campoUserName.sendKeys(userName);
	}

	public void informarCampoPassword(String password) {
		campoPassword.sendKeys(password);
	}

	public void informarCampoConfirmPassword(String confirmPassword) {
		campoConfirmPassword.sendKeys(confirmPassword);
	}

	public void clicarBotaoSalvar() {
		botaoSave.click();
	}

}
