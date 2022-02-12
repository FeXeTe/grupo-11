package calc;

/**
 * Esta clase contiene los siguientes métodos para realizar restas. <br>
 * No admite números negativos.
 * 
 * <ul>
 * <li> Resta de dos números reales
 * <li> Resta de dos números enteros
 * <li> Resta de tres números reales
 * <li> Resta con valor acumulado
 * </ul>
 * 
 * @author Daniel Fechete
 * @version 1.5
 * @see Cociente
 * @see Producto
 * @see Suma
 */
public class Resta {
	
	private int acumulador = 0;

	/**
	 * Instancia un objeto de la clase Resta.
	 */
	public Resta() {
		super();
	}

	public int getAcumulador() {
		return acumulador;
	}

	public void setAcumulador(int acumulador) {
		this.acumulador = acumulador;
	}

	/**
	 * Este método calcula <br>
	 * la resta de 2 números <b>reales</b>.
	 * 
	 * @param r1 Número <b>real</b> que queremos restar.
	 * @param r2 Número <b>real</b> que queremos restar.
	 * @return Devuelve la resta de <b>r1</b> y <b>r2</b>.
	 */
	public double res(double r1, double r2) {
		if (r1<0 && r2<0) {
			System.out.println("No admito números negativos");
			return 0;
		}
		else
			return r1-r2;
			
	}

	/**
	 * Este método calcula <br>
	 * la resta de 2 números <b>enteros</b>.
	 * 
	 * @param rs1 Número <b>entero</b> que queremos restar.
	 * @param rs2 Número <b>entero</b> que queremos restar.
	 * @return Devuelve la resta de <b>rs1</b> y <b>rs2</b>.
	 */
	public int res(int rs1, int rs2) {
		if (rs1<0 && rs2<0) {
			System.out.println("No admito números negativos");
			return 0;
		}
		else
			return rs1-rs2;
	}

	/**
	 * Este método calcula <br>
	 * la resta de 3 números <b>reales</b>.
	 * 
	 * @param rs1 Número <b>real</b> que queremos restar.
	 * @param rs2 Número <b>real</b> que queremos restar.
	 * @param rs3 Número <b>real</b> que queremos restar.
	 * @return Devuelve la resta de <b>rs1</b>, <b>rs2</b> y <b>rs3</b>.
	 */
	public double res(int rs1, int rs2, int rs3) {
		if (rs1<0 && rs2<0 && rs3<0) {
			System.out.println("No admito números negativos");
			return 0;
		}
		else
			return rs1-rs2-rs3;
	}

	/**
	 * Este método realiza restas acumulando el valor. Al atributo <b>acumulador</b>
	 * le resta el parámetro que le pasamos <br>
	 * al método. Aunque no devuelve nada, por cada resta que realicemos mediante<br>
	 * este método el valor final se acumula y queda guardado en el atributo <b>acumulador</b>.
	 * 
	 * @param n Parámetro que debe ser un número de tipo entero.
	 */
	public void acumulado(int n) {
		acumulador-=n;
	}
}
