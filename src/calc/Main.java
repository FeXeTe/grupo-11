package calc;


public class Main {

	
	public static void main(String[] args) {		
		
		// TEST CLASE COCIENTE //
		
		Cociente cociente = new Cociente();
		
		System.out.println(cociente.cociente2Enteros(1, 0));
		System.out.println(cociente.cociente2Reales(2, 0));
		System.out.println(cociente.inversa(2.1));
		System.out.println(cociente.raiz(5.3));
		
		// TEST CLASE PRODUCTO //
		
		Producto p1 = new Producto();
		
		System.out.println();
		System.out.println("Producto de 2 numeros reales: " + p1.productoMetodo1(7.55, 4.14));
		System.out.println();
		System.out.println("Producto de 2 numeros enteros: " + p1.productoMetodo2(38, 89));
		System.out.println();
		System.out.println("Producto de 3 numeros reales: " + p1.productoMetodo3(2.1, 90.54, 27.89));
		System.out.println();
		System.out.println("Calculo de potencia, ambos numeros positivos: " + p1.calculatePower(19, 5));
		System.out.println();
		System.out.println("Calculo de potencia, exponente negativo: " + p1.calculatePower(19, -5));
		System.out.println();
		System.out.println("Calculo de potencia, base negativa: " + p1.calculatePower(-19, 5));
		
		
	}
}
