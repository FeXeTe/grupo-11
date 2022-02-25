package calc;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
/**
 * 
 * Test de la clase <u><b>Producto</u></b> que probar� los distintos tipos de metodos relacionados 
 * con las operaciones de multiplicaci�n que se realicen en la calculadora:
 * 
 * <ul>
 * <li> Producto de dos n�meros reales
 * <li> Producto de dos n�meros enteros
 * <li> Producto de tres n�meros reales
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
	 * Test del m�todo <u>ProductoMetodo1</u>:
     * <ul>
     * <li> Se quiere comprobar que el valor esperado del producto de dos n�meros reales es igual al resultado obtenido por el m�todo.
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
	 * Test del m�todo <u>ProductoMetodo2</u>
     * <ul>
     * <li> Se quiere comprobar que el valor esperado del producto de dos n�meros enteros es igual al resultado obtenido por el m�todo.
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
	 * Test del m�todo <u>ProductoMetodo3</u>
     * <ul>
     * <li> Se quiere comprobar que el valor esperado del producto de tres n�meros reales es igual al resultado obtenido por el m�todo.
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
	 * Test del m�todo <u>CalculatePower</u>:
     * <ul>
     * <li> Se quiere comprobar que el valor esperado del calculo de la potencia es igual al resultado obtenido por el m�todo.
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
	 * Test del m�todo <u>ProductoMetodo1</u> con valor negativo:
     * <ul>
     * <li> Se quiere comprobar que al introducir un n�mero negativo como par�metro de entrada el m�todo devolver� como resultado <b>null</b> y el mensaje "Valores negativos no admitidos".
     * </ul>
	 */
	
	@Test
	void testProductoMetodo1valornegativo() {
		Producto p1 = new Producto();
		assertNull(p1.productoMetodo1(-7.55, 4.14));
		
	}
	
	/** 
	 * Test del m�todo <u>CalculatePower</u> con exponente negativo:
     * <ul>
     * <li> Se quiere comprobar que al introducir un n�mero negativo como exponente el m�todo devolver� como resultado <b>null</b> y el mensaje "Valores negativos en base o exponente no admitidos".
     * </ul>
	 */

	@Test
	void testCalculatePowerexponentenegativo() {
		Producto p1 = new Producto();
		assertNull(p1.calculatePower(19, -5));
		
	}
	
	/** 
	 * Test del m�todo <u>CalculatePower</u> con base negativa:
     * <ul>
     * <li> Se quiere comprobar que al introducir un n�mero negativo como base el m�todo devolver� como resultado <b>null</b> y el mensaje "Valores negativos en base o exponente no admitidos".
     * </ul>
	 */

	
	@Test
	void testCalculatePowerbasenegativa() {
		Producto p1 = new Producto();
		assertNull(p1.calculatePower(-19, 5));
		
	}
	
	/** 
	 * Test del m�todo <u>CalculatePower</u> que lanza la excepci�n IndexOutOfBoundsException:
     * <ul>
     * <li> Se quiere comprobar que al introducir un n�mero muy grande como par�metro de entrada el m�todo devolver� la excepci�n IndexOutOfBoundsException.
     * </ul>
	 */
	// excepci�n no implementada en el c�digo original por tanto dar� un fallo al testarlo.
	@Test
	void testProductoConExcepcion() {
	Producto p1 = new Producto();
	assertThrows(IndexOutOfBoundsException.class, () -> { p1.calculatePower(2147483647, 2); } );
	}

		 	
	    
}
	     