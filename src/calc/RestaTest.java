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
		double r1 = 25.50;
		double r2 = 110.12;
		if (r1 < 0 && r2 < 0) {
		} else {
			double expected = -84.62;
			double real = (r1 - r2);
			assertEquals(expected, real);
		}

	}

	@Test
	void testResDoubleDouble2() {
		System.out.println("testResDoubleDouble2");
		double r1 = -25.50;
		double r2 = -110.12;

		if (r1 < 0 && r2 < 0) {
			assertTrue(r1 < 0 && r2 < 0);
		} else {
		}

	}

	@Test
	void testResIntInt() {
		System.out.println("testResIntInt");
		int rs1 = 55;
		int rs2 = 90;

		if (rs1 < 0 && rs2 < 0) {

		} else {
			int expected = -35;
			int real = (rs1 - rs2);
			assertEquals(expected, real);
		}

	}

	@Test
	void testResIntInt2() {
		System.out.println("testResIntInt2");
		int rs1 = -55;
		int rs2 = -90;

		if (rs1 < 0 && rs2 < 0) {
			assertTrue(rs1 < 0 && rs2 < 0);
		} else {
		}

	}

	@Test
	void testResIntIntInt() {
		System.out.println("testResIntIntInt");
		int rs1 = 55;
		int rs2 = 90;
		int rs3 = 130;

		if (rs1 < 0 && rs2 < 0 && rs3 < 0) {

		} else {
			int expected = -165;
			int real = (rs1 - rs2 - rs3);
			assertEquals(expected, real);
		}
	}

	@Test
	void testResIntIntInt2() {
		System.out.println("testResIntIntInt2");
		int rs1 = -55;
		int rs2 = -90;
		int rs3 = -130;

		if (rs1 < 0 && rs2 < 0 && rs3 < 0) {
			assertTrue(rs1 < 0 && rs2 < 0 && rs3 < 0);
		} else {
		}
	}

	@Test
	void testAcumulado() {
		System.out.println("testAcumulado");
		int acumulador = 75;
		int n = 50;
		double expected = 25;
		double real = (acumulador -= n);
		assertEquals(expected, real);
	}

}
