package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaEditarNotaPage;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class EditarNotaSteps {
	
	TelaInicialPage telaInicial = new TelaInicialPage();
	TelaEditarNotaPage editarNota = new TelaEditarNotaPage();

	@Quando("eu criar uma nota com titulo {string} e nota {string}")
	public void euCriarUmaNotaComTituloENota(String title, String note) {
	    telaInicial.acionarBtnNewNote();
	    telaInicial.informarCampoTitle(title);
	    telaInicial.informarCampoNote(note);
	    telaInicial.acionarBtnBack();
	}
	
	@Quando("acionar a nota antiga {string}")
	public void acionarANotaAntiga(String oldTitle) {
	    editarNota.editarNota(oldTitle);
	}

	@Quando("editar o titulo da nota para {string}")
	public void editarOTituloDaNotaPara(String newTitle) {
	    editarNota.editarTituloDaNota(newTitle);
	}

	@Quando("clicar na seta")
	public void clicarNaSeta() {
	    telaInicial.acionarBtnBack();
	}

	@Entao("o titulo da nota muda para {string}")
	public void oTituloDaNotaMudaPara(String title) {
		assertEquals(title, driver.findElement(By.xpath("//android.widget.TextView[@text = \"" + title + "\"]")).getText());	    
	}
	
}
