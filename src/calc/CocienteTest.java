package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CocienteTest {
	
	Cociente cTest = new Cociente();
	
	@Test
	void testCociente2Reales() {
		// Test if
		assertEquals(1.8, cTest.cociente2Reales(4.5, 2.5));
		// Test else
		assertEquals(null, cTest.cociente2Reales(4.5, 0));
	}
	
	@Test
	void testCociente2Enteros() {
		//Test if
		assertEquals(2,cTest.cociente2Enteros(4, 2));
		//Test else
		assertEquals(null,cTest.cociente2Enteros(4, 0));
	}
	
	@Test
	void testInversa() {
		//Test if
		assertEquals(0.2, cTest.inversa(5));
		//Test else
		assertEquals(null, cTest.inversa(0));
	}
	
	@Test
	void testRaiz() {
		//Test if
		assertEquals(4, cTest.raiz(16));
		//Test else
		assertEquals(null, cTest.raiz(0));
	}
}