package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.LoginPage;

import static utils.Utils.*;

public class Hooks {

	@Before(value = "@login")
	public void funcionalidadeLogin() {
		acessarSistema();
	}
	
	@Before(value = "@cadastrarUsuario")
	public void funcionalidadeCadastro() {
		acessarSistema();
		Na(LoginPage.class).RealizarLogin("Admin", "admin123");
	}
	
	@After
	public void tearDown() {
//		driver.quit();
	}
	
}
