/**
 * @author Martín Amado Girón - 19020
 * @since 09/02/2020
 * @version 11/02/2020
 * @className Comparing.java
 * Clase que implementa Comparable, utilizada como la
 * estructura de datos principal del programa
 */

public class Comparing implements Comparable<Comparing>{

	int aComparar;
	
	/**
     * Constructor
     * @param aComparar valor ingresado que se guardara como entero
     */
	public Comparing(int aComparar){
		this.aComparar = aComparar;
	}

	/**
     * Método implementado de Comparable, utilizado para la comparación de dos valores
     * @pre 
     * @pos 
     * @param o El objeto con el que se desea comparar
     * @return devuelve 0 si son iguales, >0 si el parámetro es menor y <0 si el parámetro es mayor
     */
	@Override
	public int compareTo(Comparing o) {
		int r = this.aComparar-o.getValor();
		return r;
	}
	

	/**
     * Método que devuelve el valor del objeto deseado
     * @param 
     * @return El valor entero del objeto que se busca
     */
	public int getValor() {
		return this.aComparar;
	}


	/**
     * Método que guarda el valor del objeto deseado
     * @param aComparar Valor que se desea guardar
     * @return 
     */
	public void setV(int aComparar){
		this.aComparar = aComparar;
	}
	
	
	

	

}