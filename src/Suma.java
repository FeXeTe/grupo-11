
//descripcion clase
/**
 * La clase Suma permite implementar distintos tipos de metodos relacionados con
 * las operaciones de suma que se realicen en la calculadora. Esta clase no
 * soporta la adición de números negativos.
 * 
 * @exception IllegalArgumentException cuando se introduzca un número negativo.
 * 
 * @author Daniel Mendoza
 * @version 1.0
 */

public class Suma {

//parametros de entrada		
	/**
	 * Valor numerico real
	 */
	private double real1;
	/**
	 * Valor numerico real
	 */
	private double real2;
	/**
	 * Valor numerico real
	 */
	private double real3;

	/**
	 * Valor numerico entero
	 */
	private int enter1;
	/**
	 * Valor numerico entero
	 */
	private int enter2;

	/**
	 * Valor acumulado
	 */
	private int acumulador;

//constructor 
	public Suma() {

	}

//getters and setters
	public double getReal1() {
		return real1;
	}

	public void setReal1(double real1) {
		this.real1 = real1;
	}

	public double getReal2() {
		return real2;
	}

	public void setReal2(double real2) {
		this.real2 = real2;
	}

	public double getReal3() {
		return real3;
	}

	public void setReal3(double real3) {
		this.real3 = real3;
	}

	public int getEnter1() {
		return enter1;
	}

	public void setEnter1(int enter1) {
		this.enter1 = enter1;
	}

	public int getEnter2() {
		return enter2;
	}

	public void setEnter2(int enter2) {
		this.enter2 = enter2;
	}

	public int getAcumulador() {
		return acumulador;
	}

	public void setAcumulador(int acumulador) {
		this.acumulador = acumulador;
	}

// metodos
	/**
	 * El método SumdosReales calcula la suma de dos números reales y devuelve el
	 * resultado.
	 * 
	 * @param real1 número real.
	 * @param real2 número real.
	 * @return solución.
	 */
	public double SumdosReales(double real1, double real2) {

	}

	/**
	 * El método SumdosEnteros calcula la suma de dos números enteros y devuelve el
	 * resultado.
	 * 
	 * @param enter1 número entero.
	 * @param enter2 número entero.
	 * @return solución.
	 */
	public int SumdosEnteros(int enter1, int enter2) {

	}

	/**
	 * El método SumtresReales calcula la suma de tres números reales y devuelve el
	 * resultado.
	 * 
	 * @param real1 número real.
	 * @param real2 número real.
	 * @param real3 número real.
	 * @return solución.
	 */
	public double SumtresReales(double real1, double real2, double real3) {

	}

	/**
	 * El método ValorAcumulado calcula sumas y almacena el valor total.
	 * 
	 * @param acumulador número entero.
	 */
	public void ValorAcumulado(int acumulador) {

	}
}
