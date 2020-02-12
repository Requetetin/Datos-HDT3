import java.util.ArrayList;

/**
 * @author Martín Amado Girón - 19020
 * @since 09/02/2020
 * @version 11/02/2020
 * @className Selection.java
 * Literatura Citada: Bailey, D. (septiembre 2007). "Java Stuctures Data Structure in Java
 * for the Principled Programmer". Williams College.
 * Se encarga de hacer ordenar una estructura de datos Comparing por método de selección
 */

public class Selection implements iSorts{


	/**
     * Método que ordena la lista por medio de selección
     * @pre la lista no esta vacia
     * @pos ordena la lista
     * @param data es la lista de objetos que deben de ser ordenados
     * @return devuelve la lista ordenada
     */
	@Override
	public ArrayList<Comparing> sortList(ArrayList<Comparing> data) {
		// pre: 0 <= n <= data.length
		// post: values in data[0..n-1] are in ascending order
		int numUnsorted = data.size();
		int index; // general index
		int max; // index of largest value
		while (numUnsorted > 0){
		// determine maximum value in array
			max = 0;
			for (index = 1; index < numUnsorted; index++){
				if (data.get(max).compareTo(data.get(index))<0) max = index;
			}
			data = swap(data,max,numUnsorted-1);
			numUnsorted--;
		}
		return data;
	}


	/**
	* Utilizó la literatura citada para el método
	* Consultar la literatura para pre-post
	*/
	private ArrayList<Comparing> swap(ArrayList<Comparing> data, int max, int last){
		Comparing ind = data.get(last);
		data.set(last, data.get(max));
		data.set(max, ind);
		return data;

	}

	
}
	
