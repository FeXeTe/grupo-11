package calc;

/**
 * Esta clase contiene m�todos para varios tipos de restas. <br>
 * No admite n�meros negativos.
 * 
 * @author Daniel Fechete
 * @version 1.0
 */
public class Resta {

	/**
	 * Atributo que se usa para met�dos <br>
	 * en los que est�n implicados n�meros reales.
	 */
	private double r1, r2;

	/**
	 * Atributo que se usa para m�todos <br>
	 * que trabajan con n�meros enteros.
	 */
	private int rs1, rs2, rs3;

	/**
	 * Atributo que se usa para el m�todo con valor acumulado.
	 */
	private int acumulador;

	/**
	 * Instancia un objeto de la clase Resta. <br>
	 * No se definen valores para los atributos.
	 */
	public Resta() {
		super();
	}

	/**
	 * Instancia un objeto de la clase Resta. <br>
	 * Se definen valores para los atributos.
	 * 
	 * @param r1         atributo de tipo real para los metodos de su tipo.
	 * @param r2         atributo de tipo real para los metodos de su tipo.
	 * @param rs1        atributo de tipo entero para los metodos de su tipo.
	 * @param rs2        atributo de tipo entero para los metodos de su tipo.
	 * @param rs3        atributo de tipo entero para los metodos de su tipo.
	 * @param acumulador Atributo que se usa para el m�todo con valor acumulado.
	 */
	public Resta(double r1, double r2, int rs1, int rs2, int rs3, int acumulador) {
		super();
		this.r1 = r1;
		this.r2 = r2;
		this.rs1 = rs1;
		this.rs2 = rs2;
		this.rs3 = rs3;
		this.acumulador = acumulador;
	}

	public double getR1() {
		return r1;
	}

	public void setR1(double r1) {
		this.r1 = r1;
	}

	public double getR2() {
		return r2;
	}

	public void setR2(double r2) {
		this.r2 = r2;
	}

	public int getRs1() {
		return rs1;
	}

	public void setRs1(int rs1) {
		this.rs1 = rs1;
	}

	public int getRs2() {
		return rs2;
	}

	public void setRs2(int rs2) {
		this.rs2 = rs2;
	}

	public int getRs3() {
		return rs3;
	}

	public void setRs3(int rs3) {
		this.rs3 = rs3;
	}

	public int getAcumulador() {
		return acumulador;
	}

	public void setAcumulador(int acumulador) {
		this.acumulador = acumulador;
	}

	/**
	 * Este m�todo calcula <br>
	 * la resta de 2 n�meros <b>reales</b>.
	 * 
	 * @param r1 N�mero <b>real</b> que queremos restar.
	 * @param r2 N�mero <b>real</b> que queremos restar.
	 * @return Devuelve la resta de <b>r1</b> y <b>r2</b>.
	 */
	public double dosReales(double r1, double r2) {
		return restadosreales;
	}

	/**
	 * Este m�todo calcula <br>
	 * la resta de 2 n�meros <b>enteros</b>.
	 * 
	 * @param rs1 N�mero <b>entero</b> que queremos restar.
	 * @param rs2 N�mero <b>entero</b> que queremos restar.
	 * @return Devuelve la resta de <b>rs1</b> y <b>rs2</b>.
	 */
	public int dosEnteros(int rs1, int rs2) {

	}

	/**
	 * Este m�todo calcula <br>
	 * la resta de 3 n�meros <b>reales</b>.
	 * 
	 * @param rs1 N�mero <b>real</b> que queremos restar.
	 * @param rs2 N�mero <b>real</b> que queremos restar.
	 * @param rs3 N�mero <b>real</b> que queremos restar.
	 * @return Devuelve la resta de <b>rs1</b>, <b>rs2</b> y <b>rs3</b>.
	 */
	public double tresReales(int rs1, int rs2, int rs3) {

	}

	/**
	 * Este m�todo realiza restas acumulando el valor. Al atributo <b>acumulador</b>
	 * le resta el par�metro que le pasamos <br>
	 * al m�todo. Aunque no devuelve nada, por cada resta que realicemos mediante
	 * <br>
	 * este m�todo el valor final se acumula y queda guardado en el atributo
	 * <b>acumulador</b>.
	 * 
	 * @param menos Par�metro que debe ser un n�mero de tipo entero.
	 */
	public void acumulado(int menos) {

	}
}
