package calc;

/**
 * Es un objeto que contiene metodos para resolver la division de variables
 * atendiendo al tipo de numero. Ademas permite calcular raices de variables con
 * unos parametros a determinar.
 * 
 * 
 * @author Hector
 * @version 1.0
 */

public class Cociente {
	
	public Cociente() {
		
	}

	/**
	 * Este metodo estara orientado a la division de real1 y real2, esto es
	 * real1/real2. Por tanto aceptara tanto numeros enteros como decimales,
	 * positivos y negativos. El denominador sera menor o mayor que 0, pidiendo que
	 * se cambie la variable por un numero distinto en caso de introducirse.
	 * 
	 * @param real1 Es el primer valor real para realizar el cálculo.
	 * @param real2 Es el segundo valor real para realizar el cálculo.
	 * 
	 * @return dara salida a un numero real resultado de la division de las 2
	 *         variables. Si el parámetro real2 es cero, devolverá null pues la
	 *         operación no se puede realizar.
	 * 
	 */
	public Double cociente2Reales(double real1, double real2) {
		Double resultado = null;
		if (real2 != 0) {
			resultado = real1 / real2;
		} else {
			System.out.println("Error: el denominador debe ser distinto de cero.");
		}
		return resultado;
	}

	/**
	 * Este motodo estaro orientado a la division de entero1 y entero2, esto es
	 * entero1/entero2. Por tanto aceptara solo numeros enteros. El denominador
	 * siempre sera menor o mayor que 0, pidiendo que se cambie la variable por un
	 * numero distinto en caso de introducirse.
	 * 
	 * @param entero1 Es el primer valor real para realizar el cálculo.
	 * @param entero2 Es el segundo valor real para realizar el cálculo.
	 * 
	 * @return dara salida a un numero entero resultado de la division de las 2
	 *         variables. En caso de que el cociente no resultara entero lo
	 *         redondeara al entero mas proximo por exceso.
	 * 
	 */
	public Integer cociente2Enteros(int entero1, int entero2) {
		Integer resultado = null;
		if (entero2 != 0) {
			resultado = entero1 / entero2;
		} else {
			System.out.println("Error: el denominador debe ser distinto de cero.");
		}
		return resultado;
	}

	/**
	 * Este metodo estara orientado al calculo de la inversa de un numero, esto es
	 * 1/real1. Por tanto aceptara tanto numeros enteros como decimales, positivos y
	 * negativos, pero siempre menor o mayor que 0.
	 * 
	 * @param real1 Es el primer valor real para realizar el cálculo.
	 * 
	 * @return dara salida a un numero real resultado de la operacion.
	 * 
	 */
	public Double inversa(double real1) {
		Double resultado = null;
		if (real1 != 0) {
			resultado = 1 / real1;
		} else {
			System.out.println("Error: el denominador debe ser distinto de cero.");
		}
		return resultado;
	}

	/**
	 * Este motodo estaro orientado a resolver la raiz de dos variables de entrada,
	 * siendo la primera introducida el radicando y la segunda el indice. Aceptara
	 * tanto numeros enteros positivos como decimales positivos en funcion de la
	 * variable escogida. En ningun caso aceptara numeros negativos el radicando,
	 * pidiendo que se cambie la variable por un numero distinto.
	 * 
	 * @param real1 Es el primer valor real para realizar el cálculo.
	 * 
	 * @return devolvera el resultado de hacer la raiz de la primera variable
	 *         introducida con un indice igual a la segunda variable. El numero
	 *         devuelto sera siempre positivo.
	 * 
	 */
	public Double raiz(double real1) {
		Double resultado = null;
		if (real1 >= 0) {
			resultado = Math.sqrt(real1);
		} else {
			System.out.println("Error: el radicando debe ser mayor o igual que cero.");
		}
		return resultado;
	}

}
