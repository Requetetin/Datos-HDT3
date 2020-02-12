import java.util.ArrayList;

/**
 * @author Brandon Hernández 19376
 * @since 10/02/2020
 * @version 10/02/2020
 * @className iSorts.java
 * Interfaz iSorts con un solo metodo para hacer sort
 */

interface iSorts{

	/**
     * Método que ordena la lista por medio del método qu elo implemente
     * @pre la lista no esta vacia
     * @pos ordena la lista
     * @param data es la lista de objetos que deben de ser ordenados
     * @return devuelve la lista ordenada
     */
	public ArrayList<Comparing> sortList(ArrayList<Comparing> data);

}