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
		try { Thread.sleep(2000); } 
		catch (InterruptedException e) { e.printStackTrace(); }
	    telaInicial.acionarBtnNewNote();
	    try { Thread.sleep(2000); } 
		catch (InterruptedException e) { e.printStackTrace(); }
	    telaInicial.informarCampoTitle(title);
	    telaInicial.informarCampoNote(note);
	    telaInicial.acionarBtnBack();
	}
	
	@Quando("acionar a nota antiga {string}")
	public void acionarANotaAntiga(String oldTitle) {
		try { Thread.sleep(2000); } 
		catch (InterruptedException e) { e.printStackTrace(); }
	    editarNota.editarNota(oldTitle);
	}

	@Quando("editar o titulo da nota para {string}")
	public void editarOTituloDaNotaPara(String newTitle) {
		try { Thread.sleep(2000); } 
		catch (InterruptedException e) { e.printStackTrace(); }
	    editarNota.editarTituloDaNota(newTitle);
	}

	@Quando("clicar na seta")
	public void clicarNaSeta() {
	    telaInicial.acionarBtnBack();
	}

	@Entao("o titulo da nota muda para {string}")
	public void oTituloDaNotaMudaPara(String title) {
		try { Thread.sleep(2000); } 
		catch (InterruptedException e) { e.printStackTrace(); }
		assertEquals(title, driver.findElement(By.id("com.google.android.keep:id/index_note_title")).getText());	    
	}
	
}
