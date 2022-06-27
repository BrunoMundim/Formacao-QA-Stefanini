package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(id = "txtUsername")
	private WebElement campoUsuario;
	
	@FindBy(id = "txtPassword")
	private WebElement campoSenha;
	
	@FindBy(name = "Submit")
	private WebElement botaoLogin;
	
	@FindBy(linkText = "Forgot your password?")
	private WebElement esqueceusSenha;
	
	public void InformarCampoUsuario(String usuario) {			
		campoUsuario.sendKeys(usuario);				
	}
	
	public void InformarCampoSenha(String senha) {		
		campoSenha.sendKeys(senha);		
	}
	
	public void AcionarBotaoLogin() {		
		botaoLogin.click();		
	}
	
	public void RealizarLogin(String usuario, String senha) {
		InformarCampoUsuario(usuario);
		InformarCampoSenha(senha);
		AcionarBotaoLogin();
	}
	
}
