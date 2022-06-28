package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CalculadoraPage;

import static utils.Utils.*;

public class CalculadoraSteps {

//	CalculadoraPage calculadora = new CalculadoraPage(driver);
	CalculadoraPage calculadora = new CalculadoraPage();
	
	@Quando("eu digitar o numero {string}")
	public void euDigitarONumero(String string) {
		calculadora.digitar2();
	}

	@Quando("eu acionar a tecla mais")
	public void euAcionarATeclaMais() {
		calculadora.acionarPlus();
	}

	@Entao("a calculadora apresenta o numero {string}")
	public void aCalculadoraApresentaONumero(String string) {
//	    assertEquals("", driver.findElementById("com.android.calculator2:id/result"));
	}
}
