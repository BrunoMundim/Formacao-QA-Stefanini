package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class TestandoActionSteps {
	
	@Quando("acionar o submenu Custom Field")
	public void acionarOSubmenuCustomField() {
	    Na(TelaInicialPage.class).acessarMenuCustomField();
	}

	@Entao("o sistema apresenta a tela Custom Field")
	public void oSistemaApresentaATelaCustomField() {
		assertEquals("Defined Custom Fields", driver.findElement(By.xpath("//h1[text()=\"Defined Custom Fields\"]")).getText());
		
	}
	
}
