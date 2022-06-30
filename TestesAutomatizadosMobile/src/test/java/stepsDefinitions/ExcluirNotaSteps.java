package stepsDefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ExcluirNotaPage;

import static utils.Utils.driver;

import org.openqa.selenium.By;

public class ExcluirNotaSteps {
	
	ExcluirNotaPage excluirNota = new ExcluirNotaPage();

	@Quando("tocar e segurar a nota {string}")
	public void tocarESegurarANota(String titulo) {
	    excluirNota.cliqueLongo(titulo);
	}

	@Quando("acionar os tres pontos na direita em cima")
	public void acionarOsTresPontosNaDireitaEmCima() {
	    excluirNota.acionarMenuTresPontos();
	}

	@Quando("acionar a opcao delete")
	public void acionarAOpcaoDelete() {
	    excluirNota.acionarDelete();
	}

	@Entao("eu apago a nota {string}")
	public void euApagoANota(String titulo) {
	    assertEquals("Note moved to trash", driver.findElement(By.id("com.google.android.keep:id/snackbar_text")).getText());
	}

	
}
