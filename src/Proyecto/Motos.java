package Proyecto;

import java.util.Scanner;
/**
 * <h1>Clase Moto</h1>
 * Esta clase instancia objetos de tipo moto.
 * 
 * @author Hugo
 * @version 1.0
 */

public class Motos {
	int numbastidor;
	String Marca;
	String Modelo;
	int numruedas;
	int numasientos;
	int precio;
	String segundamano;

/**<h2>Atributos</h2>
 * 	
 * @param <b>numbastidor</b> almacena el número de bastidor de la moto.
 * @param <b>Marca</b> almacena la marca de la moto.
 * @param <b>Modelo</b> almacena el modelo de la moto.
 * @param <b>numruedas</b> recoge el número de ruedas que tiene la moto ya sean dos o tres.
 * @param <b>numasientos</b> recoge el número de asientos que tenga la moto, que pueden ser dos o uno.
 * @param <b>precio</b> recoge el precio de la moto que no puede ser superior a 10000€.
 * @param <b>segundamano</b> nos dice si es o no de segunda mano.
 */
	
public Motos(int numbastidor,String Marca,String Modelo,int numruedas,int numasientos,int precio,String segundamano) {
	this.numbastidor = numbastidor;
	this.Marca = Marca;
	this.Modelo = Modelo;
	this.numruedas = numruedas;
	this.numasientos = numasientos;
	if(precio<=10000) {
	this.precio = precio;
	}
	if(segundamano.equalsIgnoreCase("si")||segundamano.equalsIgnoreCase("no")) {
		this.segundamano = segundamano;
		}
	}

/**<h2>Método 1</h2>
 * 
 * Al igual que el metodo del coche te imprime toda la información de la moto.
 */
public void imprimeInformacionMoto() {
	System.out.println("Número de bastidor:"+numbastidor+" Marca:"+Marca+" Modelo:"+Modelo+" Precio:"+precio+"numasientos:"+numasientos+"numruedas:"+numruedas+"Es de segunda mano:"+segundamano);
	
}
/**<h2>Método 2</h2>
 * 
 * Como en el metodo del coche te calcula la cuota mensual para el pago de la moto
 * @param <b>nummeses</b>, te recoge el número de meses en los que se quiere pagar la moto.
 */
public void calcularCuotaMensual(int nummeses) {
	double cuota=0;
	double intereses = 0;
	
	intereses = 0.07 * this.precio;
	cuota = this.precio/nummeses;
	
	System.out.println("La cuota mensual seria:"+cuota+" más el 7% de intereses:"+intereses);

}
/**<h2>Método 3</h2>
 * 
 * En este metodo te ofrece un precio en caso de quere vender tu moto según las caracteristicas que tenga como el <b> numero de kilometros, de accidentes o dueños.</b>
 */
	public void venderMoto() {
	long preciofinal=0;	
		Scanner teclado = new Scanner (System.in);
		System.out.println("Ha decidido que quiere vender su moto, asi que adjuntenos la siguiente información, número de kilometros:");
		long numkilometros = teclado.nextLong();
		System.out.println("Número de accidentes");
		int numaccidentes = teclado.nextInt();
		System.out.println("Número de dueños");
		int numdueños = teclado.nextInt();
	
	if (numaccidentes >=1&& numkilometros >= 100000) {
		preciofinal = this.precio - 5000;
	}else if(numaccidentes ==0 && numkilometros >= 100000) {
		preciofinal = this.precio - 3000;
	}else if (numaccidentes >=1&& numkilometros < 100000) {
		preciofinal = this.precio - 3500;
	}else if (numaccidentes ==1 && numkilometros < 100000) {
		preciofinal = this.precio - 2000;
	}
	System.out.println("Con esta informacion le podemos ofrecer: "+preciofinal+"€.");
	}
}


