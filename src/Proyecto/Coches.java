package Proyecto;
/**<h1>Clase Coche</h1>
 * Esta clase instancia objetos de tipo coche.
 *
 *
 * @author Hugo
 * @version 1.0
 */
public class Coches {
	int numbastidor;
	String Marca;
	String Modelo;
	int precio;
	String segundamano;
	/**
	 * <h2>Atributos</h2>
	 * @param <b>numbastidor</b> recoge el numero de bastidor del vehiculo que es como el dni.
	 * @param <b>Marca</b> recoge la marca del vehiculo.
	 * @param <b>Modelo</b> recoge el modelo del vehiculo.
	 * @param <b>precio</b> recoge el precio del vehiculo.
	 * @param <b>segundamano</b> en este caso solo se admite 'si' o 'no'.
	 */
	public Coches(int numbastidor,String Marca,	String Modelo,int precio, String segundamano) {
		this.numbastidor = numbastidor;
		this.Marca= Marca;
		this.Modelo = Modelo;
		this.precio = precio;
		if(segundamano.equalsIgnoreCase("si")||segundamano.equalsIgnoreCase("no")) {
			this.segundamano = segundamano;
		}
	}
	/**<h2>Método 1</h2>
	 * Este metodo imprime la informacion del coche.
	 */
	public void imprimeInformacion() {
		System.out.println("Número de bastidor:"+numbastidor+" Marca:"+Marca+" Modelo:"+Modelo+" Precio:"+precio);
	
	} 
	/**
	 * <h2>Método 2</h2>
	 * @param nummeses recoge el numero de meses en el que el cliente quiere pagar el precio.
	 * La variable <b>cuota</b> te calcula el resultado de dividir el precio del coche entre el numero de meses.
	 * La variable <b>intereses</b> te calcula la cantidad de intereses del precio del coche con un 7% de interes.
	 * Este metodo no tiene ningun return, pero devuelve un mensaje con la cuota mensual del coche y los intereses. 
	 */
	public void cuotaMensual(int nummeses) {
		double cuota=0;
		double intereses = 0;
		
		intereses = 0.07 * this.precio;
		cuota = this.precio/nummeses;
		
		System.out.println("La cuota mensual seria:"+cuota+" más el 7% de intereses:"+intereses);
		
	}
}
