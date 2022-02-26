package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumaTest {

	Suma suma;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {		
		suma = new Suma();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("         ***********************         ");
		suma = null;
	}
	
	@Test
	void testSumdosReales_1() {	
		System.out.println("testSumdosReales_1");
		double resultadoReal = suma.SumdosReales(2.2, 3.3);
		double resultadoEsperado = 5.5;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void testSumdosReales_2() {
		System.out.println("testSumdosReales_2");
		double resultadoReal = suma.SumdosReales(2.2, -3.3);
		double resultadoEsperado = 0;
		assertEquals(resultadoReal, resultadoEsperado);
	} 

	@Test
	void testSumdosEnteros_1() {
		System.out.println("testSumdosEnteros_1");
		int resultadoReal = suma.SumdosEnteros(2, 3);
		int resultadoEsperado = 5;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void testSumdosEnteros_2() {
		System.out.println("testSumdosEnteros_2");
		int resultadoReal = suma.SumdosEnteros(-2, -3);
		int resultadoEsperado = 0;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void testSumdosEnteros_3() {
		System.out.println("testSumdosEnteros_3");
		int resultadoReal = suma.SumdosEnteros(-2, 3);
		int resultadoEsperado = 0;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void testSumtresReales_1() {
		System.out.println("testSumtresReales_1");
		double resultadoReal = suma.SumtresReales(1.0, 2.0, 8.0);
		double resultadoEsperado = 11;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void testSumtresReales_2() {
		System.out.println("testSumtresReales_2");
		double resultadoReal = suma.SumtresReales(-1.0, -2.0, -8.0);
		double resultadoEsperado = 0;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void testSumtresReales_3() {
		System.out.println("testSumtresReales_3");
		double resultadoReal = suma.SumtresReales(-1.0, 2.0, 8.0);
		double resultadoEsperado = 0;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void testSumtresReales_4() {
		System.out.println("testSumtresReales_4");
		double resultadoReal = suma.SumtresReales(1.0, -2.0, -8.0);
		double resultadoEsperado = 0;
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test	
	void testValorAcumulado() {	
		System.out.println("testValorAcumulado");
		suma.ValorAcumulado(10.1);
		assertEquals(10.1, suma.getAcumulado());		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
