package calc;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
/**
 * 
 * Test de la clase <u><b>Producto</u></b> que probará los distintos tipos de metodos relacionados 
 * con las operaciones de multiplicación que se realicen en la calculadora:
 * 
 * <ul>
 * <li> Producto de dos números reales
 * <li> Producto de dos números enteros
 * <li> Producto de tres números reales
 * <li> Potencia
 * </ul>
 * 
 * 
 * @author Daniel Mendoza
 * @version 1.0
 * 
 * @see SumaTest
 * @see RestaTest
 * @see CocienteTest
 */
class ProductoTest {
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("TEST CLASE PRODUCTO\n");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("\nFIN TEST");
	}


	/** 
	 * Test del método <u>ProductoMetodo1</u>:
     * <ul>
     * <li> Se quiere comprobar que el valor esperado del producto de dos números reales es igual al resultado obtenido por el método.
     * </ul>
	 */

	@Test
	void testProductoMetodo1() {
		Producto p1 = new Producto();
		double resultado = p1.productoMetodo1(7.55, 4.14);
		double esperado = 31;
		assertEquals(esperado, resultado);
		
	}
	
	/** 
	 * Test del método <u>ProductoMetodo2</u>
     * <ul>
     * <li> Se quiere comprobar que el valor esperado del producto de dos números enteros es igual al resultado obtenido por el método.
     * </ul>
	 */

	@Test
	void testProductoMetodo2() {
		Producto p1 = new Producto();
		int resultado = p1.productoMetodo2(38, 89);
		int esperado = 3382;
		assertEquals(esperado, resultado);
	}
	
	/** 
	 * Test del método <u>ProductoMetodo3</u>
     * <ul>
     * <li> Se quiere comprobar que el valor esperado del producto de tres números reales es igual al resultado obtenido por el método.
     * </ul>
	 */

	@Test
	void testProductoMetodo3() {
		Producto p1 = new Producto();
		double resultado = p1.productoMetodo3(2.1, 90.54, 27.89);
		double esperado = 5302;
		assertEquals(esperado, resultado);
	}
	
	/** 
	 * Test del método <u>CalculatePower</u>:
     * <ul>
     * <li> Se quiere comprobar que el valor esperado del calculo de la potencia es igual al resultado obtenido por el método.
     * </ul>
	 */
	
	@Test
	void testCalculatePower() {
		Producto p1 = new Producto();
		int resultado = p1.calculatePower(19,5);
		int esperado = 2476099;
		assertEquals(esperado, resultado);
		
	}
	
	/** 
	 * Test del método <u>ProductoMetodo1</u> con valor negativo:
     * <ul>
     * <li> Se quiere comprobar que al introducir un número negativo como parámetro de entrada el método devolverá como resultado <b>null</b> y el mensaje "Valores negativos no admitidos".
     * </ul>
	 */
	
	@Test
	void testProductoMetodo1valornegativo() {
		Producto p1 = new Producto();
		assertNull(p1.productoMetodo1(-7.55, 4.14));
		
	}
	
	/** 
	 * Test del método <u>CalculatePower</u> con exponente negativo:
     * <ul>
     * <li> Se quiere comprobar que al introducir un número negativo como exponente el método devolverá como resultado <b>null</b> y el mensaje "Valores negativos en base o exponente no admitidos".
     * </ul>
	 */

	@Test
	void testCalculatePowerexponentenegativo() {
		Producto p1 = new Producto();
		assertNull(p1.calculatePower(19, -5));
		
	}
	
	/** 
	 * Test del método <u>CalculatePower</u> con base negativa:
     * <ul>
     * <li> Se quiere comprobar que al introducir un número negativo como base el método devolverá como resultado <b>null</b> y el mensaje "Valores negativos en base o exponente no admitidos".
     * </ul>
	 */

	
	@Test
	void testCalculatePowerbasenegativa() {
		Producto p1 = new Producto();
		assertNull(p1.calculatePower(-19, 5));
		
	}
	
	/** 
	 * Test del método <u>CalculatePower</u> que lanza la excepción IndexOutOfBoundsException:
     * <ul>
     * <li> Se quiere comprobar que al introducir un número muy grande como parámetro de entrada el método devolverá la excepción IndexOutOfBoundsException.
     * </ul>
	 */
	// excepción no implementada en el código original por tanto dará un fallo al testarlo.
	@Test
	void testProductoConExcepcion() {
	Producto p1 = new Producto();
	assertThrows(IndexOutOfBoundsException.class, () -> { p1.calculatePower(2147483647, 2); } );
	}

		 	
	    
}
	     