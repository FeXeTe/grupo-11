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
		
		// TEST CLASE RESTA **
		
		Resta resta = new Resta();
				
		System.out.println("\n\n===== TEST CLASE RESTA =====\n");
		System.out.println("Resta de 2 numeros reales");
		System.out.println(resta.res(123.324, 24.33)+"\n");
		System.out.println("Resta de 2 numeros enteros");
		System.out.println(resta.res(50, -20)+"\n");
		System.out.println("Resta de 3 nÃºmeros reales");
		System.out.println(resta.res(100, 25, 10)+"\n");
		resta.acumulado(125);
		System.out.println(resta.getAcumulador());
		
		// TEST CLASE SUMA //
		
		Suma suma = new Suma();
		
		System.out.println("Suma de dos números reales \nEl resultado es: " + suma.SumdosReales(2.5, 2.5));
		System.out.println("Suma de dos números enteros \nEl resultado es: " + suma.SumdosEnteros(5, 5));
		System.out.println("Suma de tres números reales \nEl resultado es: " + suma.SumtresReales(1.75, 2.5, 3.2));
		suma.setAcumulado(10.1);
		suma.ValorAcumulado(5.5);
		System.out.println("Acumulado: " + suma.getAcumulado());
	}
}
