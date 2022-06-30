package servicos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import entidades.Conta;
import entidades.Usuario;
import utils.APIConnection;
import utils.DatabaseConnection;

public class SaqueTest {

	@Test
	public void testRealizaSaque() {

		APIConnection consultaSPCMock = Mockito.mock(APIConnection.class);
		DatabaseConnection insertContaMock = Mockito.mock(DatabaseConnection.class);

		Usuario bruno = new Usuario("Bruno");
		Conta contaBruno = new Conta();
		contaBruno.setUsuario(bruno);
		contaBruno.setAgencia("1234");
		contaBruno.setSaldo(500.00);

		Saque saqueBruno = new Saque();

		saqueBruno.setAPIConnection(consultaSPCMock);
		saqueBruno.setDatabaseConnection(insertContaMock);

		Mockito.when(consultaSPCMock.consultaSPC(contaBruno.getUsuario().getNome())).thenReturn(true);

		saqueBruno.realizaSaque(contaBruno, 300.00);

		assertEquals(200.00, contaBruno.getSaldo(), 0.01);
		Mockito.verify(insertContaMock).insertConta(contaBruno);
	}

	@Test
	public void testRealizaSaqueSaldoInsuficiente() {
		Usuario bruno = new Usuario("Bruno");
		Conta contaBruno = new Conta();
		contaBruno.setUsuario(bruno);
		contaBruno.setAgencia("1234");
		contaBruno.setSaldo(500.00);

		Saque saqueBruno = new Saque();
		saqueBruno.realizaSaque(contaBruno, 600.00);

		assertEquals(500.00, contaBruno.getSaldo(), 0.01);
	}

}
