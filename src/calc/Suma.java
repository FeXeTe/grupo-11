package calc;

/**
 * 
 * La clase Suma permite implementar distintos tipos de metodos relacionados 
 * con las operaciones de suma que se realicen en la calculadora:
 * 
 * <ul>
 * <li> Suma de dos n�meros reales
 * <li> Suma de dos n�meros enteros
 * <li> Suma de tres n�meros reales
 * <li> Suma con valor acumulado
 * </ul>
 * 
 * <i>
 *  Esta clase no soporta la adici�n de n�meros negativos.
 * </i>
 * 
 * 
 * @author Daniel Mendoza
 * @version 1.1
 * 
 * @see Resta
 * @see Producto
 * @see Cociente
 */

public class Suma {


	/**
	 * Atributo de clase para almacenar el valor acumulado del m�todo acumulador
	 */
	private double acumulado = 0;


	public Suma() {

	}

	/**
	 * El m�todo SumdosReales calcula la suma de dos n�meros reales y devuelve el
	 * resultado.
	 * 
	 * @param real1 primer n�mero real a sumar.
	 * @param real2 segundo n�mero real a sumar.
	 * @return el resultado de la suma de los dos n�meros positivos, o un codigo de error si se introduce alg�n n�mero negativo.
	 */
	public double SumdoReales(double real1, double real2) {
		double solucion;
		solucion = real1 + real2;
		if (real1 >= 0 || real2 >= 0)
		return solucion;
		else if (real1 < 0 || real2 < 0)
		System.out.println("No se admiten valores negativos");
		return 0;

	}

	/**
	 * El m�todo SumdosEnteros calcula la suma de dos n�meros enteros y devuelve el
	 * resultado.
	 * 
	 * @param enter1 primer n�mero entero a sumar.
	 * @param enter2 segundo n�mero entero a sumar.
	 * @return el resultado de la suma de los dos n�meros positivos, o un codigo de error si se introduce alg�n n�mero negativo.
	 */
	public int SumdosEnteros(int enter1, int enter2) {
		int solucion;
		solucion = enter1 + enter2;
		if (enter1 >= 0 || enter2 >= 0)
		return solucion;
		else if (enter1 < 0 || enter2 < 0)
		System.out.println("No se admiten valores negativos");
		return 0;
		

	}

	/**
	 * El m�todo SumtresReales calcula la suma de tres n�meros reales y devuelve el
	 * resultado.
	 * 
	 * @param real1 primer n�mero real a sumar.
	 * @param real2 segundo n�mero real a sumar.
	 * @param real3 tercer n�mero real a sumar.
	 * @return el resultado de la suma de los tres n�meros positivos, o un codigo de error si se introduce alg�n n�mero negativo.
	 */
	public double SumtresReales(double real1, double real2, double real3) {
		double solucion;
		solucion = real1 + real2 + real3;
		if (real1 >= 0 || real2 >= 0 || real3 >= 0)
		return solucion;
	    else if (real1 < 0 || real2 < 0 || real3 < 0)
	    System.out.println("No se admiten valores negativos");
		return 0;
		

	}

	/**
	 * El m�todo ValorAcumulado calcula sumas y almacena el valor total.
	 * 
	 * @param acumulador n�mero entero.
	 */
	public void ValorAcumulado(double numero) {

	}


	public double getAcumulado() {
		return acumulado;
	}


	public void setAcumulado(double acumulado) {
		this.acumulado = acumulado;
		
	}
	
}