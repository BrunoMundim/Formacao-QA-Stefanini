package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaConfiguracoesPage;
import pageObjects.TelaInicialPage;

public class SwitchSteps {
	
	TelaInicialPage telaInicial = new TelaInicialPage();
	TelaConfiguracoesPage telaConfiguracoes = new TelaConfiguracoesPage();

	@Quando("eu acionar o menu")
	public void euAcionarOMenu() {
		telaInicial.acionarMenu();
	}

	@Quando("eu acionar a aba settings")
	public void euAcionarAAbaSettings() {
		telaConfiguracoes.abrirMenuSettings();
	}

	@Quando("eu tocar no switch")
	public void euTocarNoSwitch() {
		telaConfiguracoes.addNewItensToBottom();
	}

	@Entao("o switch fica desabilitado")
	public void oSwitchFicaDesabilitado() {
	    assertEquals("false", driver.findElement(By.id("com.google.android.keep:id/settings_add_new_items_to_bottom")).getAttribute("checked"));
	}
	
}
