
/**
 * La clase Cociente es un objeto que contiene métodos para resolver la división
 * de variables atendiendo al tipo de número. Además permite calcular raízes de
 * variables con unos parámetros a determinar.
 * 
 * 
 * @author Héctor
 * @version 1.0
 */

public class Cociente {

	/**
	 * @param real1 puede tomar cualquier valor de número real.
	 */
	private double real1;

	/**
	 * @param real2 puede tomar cualquier valor de número real.
	 */
	private double real2;

	/**
	 * @param entero1 puede tomar cualquier valor de número entero.
	 */
	private int entero1;

	/**
	 * @param entero2 puede tomar cualquier valor de número entero.
	 */
	private int entero2;

	/**
	 * Este método estará orientado a la división de real1 y real2, esto es
	 * real1/real2. Por tanto aceptará tanto números enteros como decimales,
	 * positivos y negativos. El denominador será menor o mayor que 0, pidiendo que se cambie la
	 * variable por un número distinto en caso de introducirse.
	 * 
	 * @return dará salida a un número real resultado de la división de las 2
	 *         variables.
	 * 
	 */

	public double cociente2Reales(double real1, double real2) {

	}

	/**
	 * Este método estará orientado a la división de entero1 y entero2, esto es
	 * entero1/entero2. Por tanto aceptará sólo números enteros. El denominador
	 * siempre será menor o mayor que 0, pidiendo que se cambie la variable por un número distinto
	 * en caso de introducirse.
	 * 
	 * @return dará salida a un número entero resultado de la división de las 2
	 *         variables. En caso de que el cociente no resultara entero lo
	 *         redondeará al entero más próximo por exceso.
	 * 
	 */

	public int cociente2Enteros(int entero1, int entero2) {

	}

	/**
	 * Este método estará orientado al cálculo de la inversa de un número, esto es
	 * 1/real1. Por tanto aceptará tanto números enteros como decimales, positivos y
	 * negativos, pero siempre menor o mayor que 0.
	 * 
	 * @return dará salida a un número real resultado de la operación.
	 * 
	 */
	public double inversa(double real1) {

	}

	/**
	 * Este método estará orientado a resolver la raíz de dos variables de entrada,
	 * siendo la primera introducida el radicando y la segunda el índice. Aceptará
	 * tanto números enteros positivos como decimales positivos en función de la
	 * variable escogida. En ningún caso aceptará números negativos el radicando,
	 * pidiendo que se cambie la variable por un número distinto.
	 * 
	 * @return devolverá el resultado de hacer la raíz de la primera variable
	 *         introducida con un índice igual a la segunda variable. El número
	 *         devuelto será siempre positivo.
	 * 
	 */
	public class raiz {

	}

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

	public double getEntero1() {
		return entero1;
	}

	public void setEntero1(int entero1) {
		this.entero1 = entero1;
	}

	public double getEntero2() {
		return entero2;
	}

	public void setEntero2(int entero2) {
		this.entero2 = entero2;
	}

	/**
	 * Constructor que permite establecer el valor de las variables que se usarán en
	 * cada método.
	 * 
	 * @param real1   es el valor del numerador o del radicando. Será mayor que 0
	 *                cuando se trate de una raíz.
	 * @param real2   es el valor del denominador o del índice. Será mayor o menor
	 *                que 0 cuando se trate de un cociente.
	 * @param entero1 es el valor del numerador.
	 * @param entero2 es el valor del denominador, será mayor o menor que 0.
	 */

	public Cociente(double real1, double real2, int entero1, int entero2) {
		super();
		this.real1 = real1;
		this.real2 = real2;
		this.entero1 = entero1;
		this.entero2 = entero2;
	}

}
