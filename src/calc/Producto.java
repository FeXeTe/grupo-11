package calc;

/**
 * Clase para implementar las siguientes funciones de
 * <i><b>producto</b></i>:<br>
 * <br>
 *
 * producto de 2 numeros reales,<br>
 * producto de 2 numeros enteros,<br>
 * producto de 3 numeros reales,<br>
 * potencia con base y exponente.<br>
 * <br>
 * 
 * <b>Parametros:</b><br>
 * <br>
 * p1, p2, p3, p4, p5, b1, e1<br>
 * <br>
 * 
 * <b>Resultados:</b><br>
 * <br>
 * productoenteros, productoreales, potencia.<br>
 * <br>
 * 
 * @author Alvaro H.
 * @version 1.1 implentada codigo potencia
 * 
 */

public class Producto {

	/**
	 * Parametro <b>real</b> numero 1, cuyo valor valido esta comprendido dentro de
	 * los admitidos por su tipo de dato.
	 */

	private double p1;

	/**
	 * Parametro <b>real</b> numero 2, cuyo valor valido esta comprendido dentro de
	 * los admitidos por su tipo de dato.
	 */

	private double p2;

	/**
	 * Parametro <b>real</b> numero 3, cuyo valor valido esta comprendido dentro de
	 * los admitidos por su tipo de dato.
	 */

	private double p3;

	/**
	 * Parametro <b>entero</b> numero 4, cuyo valor valido esta comprendido dentro
	 * de los admitidos por su tipo de dato.
	 */

	private int p4;

	/**
	 * Parametro <b>entero</b> numero 5, cuyo valor valido esta comprendido dentro
	 * de los admitidos por su tipo de dato.
	 */

	private int p5;

	/**
	 * Parametro <b>entero</b>, que representa la <b>base</b> de la potencia, cuyo
	 * valor valido esta comprendido dentro de los admitidos por su tipo de dato.
	 */

	private int b1;

	/**
	 * Parametro <b>entero</b>, que representa el <b>exponente</b> de la potencia,
	 * cuyo valor valido esta comprendido dentro de los admitidos por su tipo de
	 * dato.
	 */

	private int e1;

	/**
	 * Variable que almacena el valor del resultado de los metodos de multiplicacion
	 * de variables de tipo <b>entero</b>.
	 */

	private int productoenteros;

	/**
	 * Variable que almacena el valor del resultado de los metodos de multiplicacion
	 * de variables de tipo <b>real</b>.
	 */

	private double productoreales;

	/**
	 * Variable que almacena el valor de la base <b>b1 elevado al exponente e1</b>.
	 */

	private int potencia;

	/**
	 * Realiza la funcion multiplicacion de 2 parametros recibidos de tipo
	 * <b>real</b> y devuelve el resultado.
	 * 
	 * @param p1 Parametro <b>real</b>.
	 * @param p2 Parametro <b>real</b>.
	 * @return resultado del metodo.
	 */

	public double productoMetodo1(double p1, double p2) {
		productoreales = p1 * p2;
		return productoreales;
	}

	/**
	 * Realiza la funcion de multiplicacion de 2 parametros recibidos de tipo
	 * <b>entero</b> y devuelve el resultado.
	 * 
	 * @param p4 Parametro <b>entero</b>.
	 * @param p5 Parametro <b>entero</b>.
	 * @return resultado del metodo.
	 * @exception ArithmeticException         Si p4, p5, son numeros negativos.
	 * @exception ArgumentOutOfRangeException Si b1 o e1 tienen valores menores
	 *                                        -2147483648 o mayores 2147483648 lanza
	 *                                        error "valor fuera del rango
	 *                                        admitido".
	 */

	public int productoMetodo2(int p4, int p5) {
		productoenteros = p4 * p5;
		return productoenteros;
	}

	/**
	 * Realiza la funcion multiplicacion de 3 parametros recibidos de tipo
	 * <b>real</b> y devuelve el resultado.
	 * 
	 * @param p1 Parametro <b>real</b>.
	 * @param p2 Parametro <b>real</b>.
	 * @param p3 Parametro <b>real</b>.
	 * @return resultado del metodo.
	 * @exception ArithmeticException         Si p1, p2, p3 son numeros negativos
	 * @exception ArgumentOutOfRangeException Si b1 o e1 tienen valores menores
	 *                                        -2147483648 o mayores 2147483648 lanza
	 *                                        error "valor fuera del rango
	 *                                        admitido".
	 */

	public double productoMetodo3(double p1, double p2, double p3) {
		productoreales = p1 * p2 * p3;
		return productoreales;
	}

	/**
	 * Realiza la funcion de calculo de la potencia segun los 2 parametros de tipo
	 * <b>real</b>, base y exponente.
	 * 
	 * @param b1 Parametro <b>real</b>, base de la potencia.
	 * @param e1 Parametro <b>real</b>, exponente de la potencia.
	 * @exception ArithmeticException         Si b1 y/o e1 son numeros negativos.
	 * @exception ArgumentOutOfRangeException Si b1 o e1 tienen valores menores que
	 *                                        -2147483648 o mayores que 2147483648
	 *                                        lanza error "valor fuera del rango
	 *                                        admitido".
	 * @return resultado del metodo.
	 */

	public int calculatePower(int b1, int e1) {
		potencia = Math.pow(b1, e1);
		return potencia;
	}

	// CONSTRUCTOR POR DEFECTO
	// ----------------------------------------------------------

	public Producto() {

	}

	// GETTERS AND SETTERS
	// ----------------------------------------------------------

	public double getP1() {
		return p1;
	}

	public void setP1(double p1) {
		this.p1 = p1;
	}

	public double getP2() {
		return p2;
	}

	public void setP2(double p2) {
		this.p2 = p2;
	}

	public double getP3() {
		return p3;
	}

	public void setP3(double p3) {
		this.p3 = p3;
	}

	public int getP4() {
		return p4;
	}

	public void setP4(int p4) {
		this.p4 = p4;
	}

	public int getP5() {
		return p5;
	}

	public void setP5(int p5) {
		this.p5 = p5;
	}

	public int getB1() {
		return b1;
	}

	public void setB1(int b1) {
		this.b1 = b1;
	}

	public int getE1() {
		return e1;
	}

	public void setE1(int e1) {
		this.e1 = e1;
	}

	public int getProductoenteros() {
		return productoenteros;
	}

	public void setProductoenteros(int productoenteros) {
		this.productoenteros = productoenteros;
	}

	public double getProductoreales() {
		return productoreales;
	}

	public void setProductoreales(double productoreales) {
		this.productoreales = productoreales;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

}
