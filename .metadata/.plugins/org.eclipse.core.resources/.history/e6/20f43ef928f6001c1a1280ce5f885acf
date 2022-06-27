package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastrarUsuarioPage;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class CadastrarUsuarioSteps {

	@Quando("eu acionar a aba Admin")
	public void euAcionarAAbaAdmin() {
		Na(TelaInicialPage.class).AcionarAbaAdmin();
	}

	@Quando("acionar o botao Add")
	public void acionarOBotaoAdd() {
		Na(TelaInicialPage.class).acionarBotaoAdd();
	}

	@Quando("informar no campo employee name {string}")
	public void informarNoCampoEmployeeName(String employeeName) {
		Na(CadastrarUsuarioPage.class).informarCampoEmployeeName(employeeName);
	}

	@Quando("informar no campo username {string}")
	public void informarNoCampoUsername(String username) {
		Na(CadastrarUsuarioPage.class).informarCampoUserName(username);
	}

	@Quando("informar no campo password {string}")
	public void informarNoCampoPassword(String password) {
		Na(CadastrarUsuarioPage.class).informarCampoPassword(password);
	}

	@Quando("informar no campo confirm password {string}")
	public void informarNoCampoConfirmPassword(String senha) {
		Na(CadastrarUsuarioPage.class).informarCampoConfirmPassword(senha);
	}
	
	@Quando("clicar no botao salvar")
	public void clicarNoBotaoSalvar() {
	    Na(CadastrarUsuarioPage.class).clicarBotaoSalvar();
	}
	
	@Entao("^o sistema cadastra o usuario \"([^\"]*)\"$")
	public void oSistemaCadastraOUsuario(String username) throws Throwable {
		assertTrue(driver.findElement(By.xpath("//a[text()=\"" + username + "\"]")).isDisplayed());
	}
	
	
}
