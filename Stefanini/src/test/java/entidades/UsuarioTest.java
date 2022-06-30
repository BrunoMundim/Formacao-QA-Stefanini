package entidades;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UsuarioTest {

	@Test
	public void instanciaUsuarioTest() {
		Usuario bruno = new Usuario();
	}

	@Test
	public void instanciaUsuarioStringTeste() {
		Usuario bruno = new Usuario("Bruno");
	}

	@Test
	public void usuarioGetSetTeste() {
		Usuario bruno = new Usuario();
		bruno.setNome("Bruno Mundim");
		assertEquals("Bruno Mundim", bruno.getNome());
	}

	@Test
	public void assertivasTest() {
		assertTrue(true);
		assertFalse(false);
		Usuario bruno = new Usuario("Bruno");
		Usuario bruno2 = bruno;
		Usuario bruno3 = new Usuario("Bruno");
		assertSame(bruno, bruno2);
		assertNotSame(bruno, bruno3);
		assertNotEquals("Bruno", "Mundim");
		assertSame("Nao sao os mesmos usuarios", bruno, bruno2);
	}

}
