package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RestaTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("INICIO TEST - Clase Resta -----------------------");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("FIN TEST - Clase Resta -----------------------");
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testResDoubleDouble() {
		double r1 = 25.50;
		double r2 = 110.12;
		if (r1 < 0 && r2 < 0) {
			System.out.println("No admito numeros negativos");
		} else {
			double expected = -84.62;
			double real = (r1 - r2);
			assertEquals(expected, real);
		}

	}

	@Test
	void testResDoubleDouble2() {
		double r1 = -25.50;
		double r2 = 110.12;

		if (r1 < 0 && r2 < 0) {
			System.out.println("No admito numeros negativos");
		} else {
			double expected = -135.62;
			double real = (r1 - r2);
			assertEquals(expected, real);
		}

	}

	@Test
	void testResDoubleDouble3() {
		double r1 = 25.50;
		double r2 = -110.12;

		if (r1 < 0 && r2 < 0) {
			System.out.println("No admito numeros negativos");
		} else {
			double expected = 135.62;
			double real = (r1 - r2);
			assertEquals(expected, real);
		}

	}

	@Test
	void testResDoubleDouble4() {
		double r1 = -25.50;
		double r2 = -110.12;

		if (r1 < 0 && r2 < 0) {
			System.out.println("No admito numeros negativos");
			assertTrue(r1 < 0 && r2 < 0);
		} else {
			assertTrue(!(r1 < 0 && r2 < 0));
		}

	}

	@Test
	void testResIntInt() {
		fail("Not yet implemented");
	}

	@Test
	void testResIntIntInt() {
		fail("Not yet implemented");
	}

	@Test
	void testAcumulado() {
		fail("Not yet implemented");
	}

}
