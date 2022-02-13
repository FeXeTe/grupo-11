package calc;
/**
 * 
 * La clase <u><b>Suma</u></b> permite implementar distintos tipos de metodos relacionados 
 * con las operaciones de suma que se realicen en la calculadora:
 * 
 * <ul>
 * <li> Suma de dos números reales
 * <li> Suma de dos números enteros
 * <li> Suma de tres números reales
 * <li> Suma con valor acumulado
 * </ul>
 * 
 * <i>
 *  Esta clase no soporta la adición de números negativos.
 * </i>
 * 
 * 
 * @author Daniel Mendoza
 * @version 1.3
 * 
 * @see Resta
 * @see Producto
 * @see Cociente
 */

public class Suma {


	/**
	 * Atributo de clase para almacenar el valor acumulado del método ValorAcumulado.
	 */
	private double acumulado = 0;


	public Suma() {

	}

	/**
	 * El método <u>SumdosReales</u> calcula la suma de dos números reales y devuelve el
	 * resultado.
	 * 
	 * @param real1 primer número real a sumar.
	 * @param real2 segundo número real a sumar.
	 * @return el resultado de la suma de los dos números positivos, o un codigo de error si se introduce algún número negativo.
	 */
	public double SumdosReales(double real1, double real2) {
		double solucion;
		solucion = real1 + real2;
		if (real1 >= 0 || real2 >= 0)
		return solucion;
		else if (real1 < 0 || real2 < 0)
		System.out.println("No se admiten valores negativos");
		return 0;

	}

	/**
	 * El método <u>SumdosEnteros</u> calcula la suma de dos números enteros y devuelve el
	 * resultado.
	 * 
	 * @param enter1 primer número entero a sumar.
	 * @param enter2 segundo número entero a sumar.
	 * @return el resultado de la suma de los dos números positivos, o un codigo de error si se introduce algún número negativo.
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
	 * El método <u>SumtresReales</u> calcula la suma de tres números reales y devuelve el
	 * resultado.
	 * 
	 * @param real1 primer número real a sumar.
	 * @param real2 segundo número real a sumar.
	 * @param real3 tercer número real a sumar.
	 * @return el resultado de la suma de los tres números positivos, o un codigo de error si se introduce algún número negativo.
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
	 * El método <u>ValorAcumulado</u> calcula sumas y almacena el valor total.
	 * 
	 * @param parámetro acumulador número real.
	 */
	public void ValorAcumulado(double numero) {
		acumulado += numero;

	}


	public double getAcumulado() {
		return acumulado;
	}


	public void setAcumulado(double acumulado) {
		this.acumulado = acumulado;
		
	}
	
}