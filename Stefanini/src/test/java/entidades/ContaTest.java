package entidades;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ContaTest {

	Conta contaTeste;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		contaTeste = new Conta();
		contaTeste.setAgencia("1234");
		contaTeste.setConta("12345678");
		contaTeste.setSaldo(1200.00);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testContaConstrutor() {
		Usuario usuarioTest = new Usuario("Teste");
		Date dataAbertura = new Date(2021, 10, 13);	
		Conta contaTest = new Conta(usuarioTest, "1234", "123456", 1200.00, dataAbertura);
		
		assertEquals(usuarioTest, contaTest.getUsuario());
		assertEquals("1234", contaTest.getAgencia());
		assertEquals("123456", contaTest.getConta());
		assertEquals(1200.00, contaTest.getSaldo(), 0.01);
		assertEquals(dataAbertura, contaTest.getDataAbertura());
	}
	
	@Test
	public void testGetSetUsuario() {
		Usuario usuarioTest = new Usuario("Teste");
		contaTeste.setUsuario(usuarioTest);
		assertEquals(usuarioTest, contaTeste.getUsuario());
	}

	@Test
	public void testGetSetAgencia() {
		assertEquals("1234", contaTeste.getAgencia());
	}

	@Test
	public void testGetSetNumeroConta() {
		assertEquals("12345678", contaTeste.getConta());
	}

	@Test
	public void testGetSetSaldo() {
		assertEquals(1200.00, contaTeste.getSaldo(), 0.01);
	}
	
	@Test
	public void testGetSetDataAbertura() {
		Date dataAbertura = new Date(2021, 10, 13);		
		contaTeste.setDataAbertura(dataAbertura);
		assertEquals(dataAbertura, contaTeste.getDataAbertura());
	}
	
	@Test
	public void testGetSetDataEncerramento() {
		Date dataEncerramento = new Date(2022, 10, 13);		
		contaTeste.setDataEncerramento(dataEncerramento);
		assertEquals(dataEncerramento, contaTeste.getDataEncerramento());
	}

}
