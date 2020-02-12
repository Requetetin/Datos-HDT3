import java.util.ArrayList;

/**
 * @author Martín Amado Girón - 19020
 * @since 09/02/2020
 * @version 11/02/2020
 * @className Insertion.java
 * Literatura Citada: Bailey, D. (septiembre 2007). "Java Stuctures Data Structure in Java
 * for the Principled Programmer". Williams College.
 * Se encarga de hacer ordenar una estructura de datos Comparing por método de inserción
 */


public class Insertion implements iSorts{


	/**
     * Método que ordena la lista por medio de inserción
     * @pre la lista no esta vacia
     * @pos ordena la lista
     * @param data es la lista de objetos que deben de ser ordenados
     * @return devuelve la lista ordenada
     */
	@Override
	public ArrayList<Comparing> sortList(ArrayList<Comparing> data) {
		int n = data.size();
		int numSorted = 1; // number of values in place
		int index; // general index
		while (numSorted < n){
			Comparing temp = data.get(numSorted);
			for (index = numSorted; index > 0; index--){
				if (temp.compareTo(data.get(index-1))<0)
				{
					data.set(index, data.get(index-1));
				} else {
					break;
				}
			}
			// reinsert value
			data.set(index, temp);
			numSorted++;
		}
		return data;
	}
	
}