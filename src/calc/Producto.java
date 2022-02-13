package calc;


/**
 * Clase para implementar los siguientes metodos de <i><b>multiplicacion</b></i>.<br>
 * <br>
 *
 * @author Alvaro H.
 * @version 1.3 Refactorizacion del codigo.<br>
 * 
 * @see Suma
 * @see Resta
 * @see Cociente
 * 
 */

public class Producto {

	/**
	 * Realiza la funcion multiplicacion de 2 parametros recibidos de tipo
	 * <b>real</b> y devuelve el resultado.
	 * 
	 * @param p1 Parametro <b>real</b>.
	 * @param p2 Parametro <b>real</b>.
	 * @return resultado del metodo.
	 */

	public Integer productoMetodo1(double p1, double p2) {
		if (p1 < 0 || p2 < 0) {
			System.out.println("Valores negativos no admitidos");
			return null;
		}
		return (int) (p1 * p2);
	}

	/**
	 * Realiza la funcion de multiplicacion de 2 parametros recibidos de tipo
	 * <b>entero</b> y devuelve el resultado.
	 * 
	 * @param p1 Parametro <b>entero</b>.
	 * @param p2 Parametro <b>entero</b>.
	 * @return resultado del metodo.
	 * @exception ArithmeticException         Si p1, p2, son numeros negativos.
	 * @exception ArgumentOutOfRangeException Si b1 o e1 tienen valores menores
	 *                                        -2147483648 o mayores 2147483648 lanza
	 *                                        error "valor fuera del rango
	 *                                        admitido".
	 */

	public Integer productoMetodo2(int p1, int p2) {
		if (p1 < 0 || p2 < 0) {
			System.out.println("Valores negativos no admitidos");
			return null;
		}
		return (int) (p1 * p2);
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
	 * @exception ArgumentOutOfRangeException Si p1, p2 o p3 tienen valores menores
	 *                                        -2147483648 o mayores 2147483648 lanza
	 *                                        error "valor fuera del rango
	 *                                        admitido".
	 */

	public Integer productoMetodo3(double p1, double p2, double p3) {
		if (p1 < 0 || p2 < 0 || p3 < 0) {
			System.out.println("Valores negativos no admitidos");
			return null;
		}
		return (int) (p1 * p2 * p3);
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

	public Integer calculatePower(int b1, int e1) {
		if (b1 < 0 || e1 < 0) {
			System.out.println("Valores negativos en base o exponente no admitidos");
			return null;
		}
		return (int) Math.pow(b1, e1);
	}

	// CONSTRUCTOR POR DEFECTO
	// ----------------------------------------------------------

	public Producto() {
		super();
	}

}