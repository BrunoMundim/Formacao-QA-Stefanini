package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

public class CriarNotaSteps {
	
	TelaInicialPage telaInicial = new TelaInicialPage();
	
	@Dado("que eu aciono o get started")
	public void queEuAcionoOGetStarted() {
		telaInicial.acionarBtnGetStarted();
	}

	@Quando("eu criar uma nova nota")
	public void euCriarUmaNovaNota() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		telaInicial.acionarBtnNewNote();
	}

	@Quando("informar no campo Title {string}")
	public void informarNoCampoTitle(String title) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		telaInicial.informarCampoTitle(title);
	}

	@Quando("informar no campo Note {string}")
	public void informarNoCampoNote(String note) {
		telaInicial.informarCampoNote(note);
	}

	@Quando("clicar no botao voltar")
	public void clicarNoBotaoVoltar() {
		telaInicial.acionarBtnBack();
	}

	@Entao("o aplicativo cadastra a nota com o titulo {string}")
	public void oAplicativoCadastraANotaComOTitulo(String title) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		assertEquals(title, driver.findElement(By.id("com.google.android.keep:id/index_note_title")).getText());
	}
	
}
