package calc;

/**
 * La clase Cociente es un objeto que contiene m�todos para resolver la divisi�n
 * de variables atendiendo al tipo de n�mero. Adem�s permite calcular ra�zes de
 * variables con unos par�metros a determinar.
 * 
 * 
 * @author H�ctor
 * @version 1.0
 */

public class Cociente {

	/**
	 * @param real1 puede tomar cualquier valor de n�mero real.
	 */
	private double real1;

	/**
	 * @param real2 puede tomar cualquier valor de n�mero real.
	 */
	private double real2;

	/**
	 * @param entero1 puede tomar cualquier valor de n�mero entero.
	 */
	private int entero1;

	/**
	 * @param entero2 puede tomar cualquier valor de n�mero entero.
	 */
	private int entero2;

	/**
	 * Este m�todo estar� orientado a la divisi�n de real1 y real2, esto es
	 * real1/real2. Por tanto aceptar� tanto n�meros enteros como decimales,
	 * positivos y negativos. El denominador ser� menor o mayor que 0, pidiendo que se cambie la
	 * variable por un n�mero distinto en caso de introducirse.
	 * 
	 * @return dar� salida a un n�mero real resultado de la divisi�n de las 2
	 *         variables.
	 * 
	 */

	public double cociente2Reales(double real1, double real2) {

	}

	/**
	 * Este m�todo estar� orientado a la divisi�n de entero1 y entero2, esto es
	 * entero1/entero2. Por tanto aceptar� s�lo n�meros enteros. El denominador
	 * siempre ser� menor o mayor que 0, pidiendo que se cambie la variable por un n�mero distinto
	 * en caso de introducirse.
	 * 
	 * @return dar� salida a un n�mero entero resultado de la divisi�n de las 2
	 *         variables. En caso de que el cociente no resultara entero lo
	 *         redondear� al entero m�s pr�ximo por exceso.
	 * 
	 */

	public int cociente2Enteros(int entero1, int entero2) {

	}

	/**
	 * Este m�todo estar� orientado al c�lculo de la inversa de un n�mero, esto es
	 * 1/real1. Por tanto aceptar� tanto n�meros enteros como decimales, positivos y
	 * negativos, pero siempre menor o mayor que 0.
	 * 
	 * @return dar� salida a un n�mero real resultado de la operaci�n.
	 * 
	 */
	public double inversa(double real1) {

	}

	/**
	 * Este m�todo estar� orientado a resolver la ra�z de dos variables de entrada,
	 * siendo la primera introducida el radicando y la segunda el �ndice. Aceptar�
	 * tanto n�meros enteros positivos como decimales positivos en funci�n de la
	 * variable escogida. En ning�n caso aceptar� n�meros negativos el radicando,
	 * pidiendo que se cambie la variable por un n�mero distinto.
	 * 
	 * @return devolver� el resultado de hacer la ra�z de la primera variable
	 *         introducida con un �ndice igual a la segunda variable. El n�mero
	 *         devuelto ser� siempre positivo.
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
	 * Constructor que permite establecer el valor de las variables que se usar�n en
	 * cada m�todo.
	 * 
	 * @param real1   es el valor del numerador o del radicando. Ser� mayor que 0
	 *                cuando se trate de una ra�z.
	 * @param real2   es el valor del denominador o del �ndice. Ser� mayor o menor
	 *                que 0 cuando se trate de un cociente.
	 * @param entero1 es el valor del numerador.
	 * @param entero2 es el valor del denominador, ser� mayor o menor que 0.
	 */

	public Cociente(double real1, double real2, int entero1, int entero2) {
		super();
		this.real1 = real1;
		this.real2 = real2;
		this.entero1 = entero1;
		this.entero2 = entero2;
	}

}
