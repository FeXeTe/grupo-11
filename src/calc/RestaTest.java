package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RestaTest {

	Resta restaTest = new Resta();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("########## INICIO TEST - Clase Resta ##########");

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("########## FIN TEST - Clase Resta ##########");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Testing");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Test done [x]");
		System.out.println("-------------");
	}

	@Test
	void testResDoubleDouble() {
		System.out.println("testResDoubleDouble");
		assertEquals(-84.62, restaTest.res(25.5, 110.12));
	}

	// DEBERIA ARROJAR VALOR NULO POR EXCEPCION EN VEZ DE "0" YA QUE NO SE ADMITEN
	// AMBOS VALORES NEGATIVOS SEGUN EL METODO

	@Test
	void testResDoubleDouble2() {
		System.out.println("testResDoubleDouble2");
		assertEquals(null, restaTest.res(-25.5, -110.12));
	}

	@Test
	void testResDoubleDouble3() {
		System.out.println("testResDoubleDouble3");
		assertEquals(-135.62, restaTest.res(-25.5, 110.12));
	}

	@Test
	void testResDoubleDouble4() {
		System.out.println("testResDoubleDouble4");
		assertEquals(135.62, restaTest.res(25.5, -110.12));
	}

	@Test
	void testResIntInt() {
		System.out.println("testResIntInt");
		assertEquals(-85, restaTest.res(25, 110));

	}

	// DEBERIA ARROJAR VALOR NULO POR EXCEPCION EN VEZ DE "0" YA QUE NO SE ADMITEN
	// AMBOS VALORES NEGATIVOS SEGUN EL METODO

	@Test
	void testResIntInt2() {
		System.out.println("testResIntInt2");
		assertEquals(85, restaTest.res(-25, -110));
	}

	@Test
	void testResIntInt3() {
		System.out.println("testResIntInt3");
		assertEquals(-135, restaTest.res(-25, 110));
	}

	@Test
	void testResIntInt4() {
		System.out.println("testResIntInt4");
		assertEquals(135, restaTest.res(25, -110));
	}

	@Test
	void testResIntIntInt() {
		System.out.println("testResIntIntInt");
		assertEquals(-165, restaTest.res(55, 90, 130));
	}

	@Test
	void testResIntIntInt2() {
		System.out.println("testResIntIntInt2");
		assertEquals(-95, restaTest.res(-55, -90, -130));
	}

	@Test
	void testResIntIntInt3() {
		System.out.println("testResIntIntInt3");
		assertEquals(-275, restaTest.res(-55, 90, 130));
	}

	@Test
	void testResIntIntInt4() {
		System.out.println("testResIntIntInt4");
		assertEquals(15, restaTest.res(55, -90, 130));
	}

	@Test
	void testResIntIntInt5() {
		System.out.println("testResIntIntInt5");
		assertEquals(95, restaTest.res(55, 90, -130));
	}

	@Test
	void testAcumulado() {
		System.out.println("testAcumulado");
		restaTest.setAcumulador(475);
		restaTest.acumulado(75);
		assertEquals(400,restaTest.getAcumulador());
	}

}
