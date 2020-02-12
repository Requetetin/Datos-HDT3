import java.util.ArrayList;

/**
 * @author Martín Amado Girón - 19020
 * @since 09/02/2020
 * @version 11/02/2020
 * @className Quick.java
 * Literatura Citada: Bailey, D. (septiembre 2007). "Java Stuctures Data Structure in Java
 * for the Principled Programmer". Williams College.
 * Se encarga de hacer ordenar una estructura de datos Comparing por método de quick
 */

public class Quick implements iSorts{


	/**
     * Método que ordena la lista por medio de quick
     * @pre la lista no esta vacia
     * @pos ordena la lista
     * @param data es la lista de objetos que deben de ser ordenados
     * @return devuelve la lista ordenada
     */
	@Override
	public ArrayList<Comparing> sortList(ArrayList<Comparing> data) {
		
		quickSortRecursive(data, 0, data.size()-1);
		
		return data;
	}
	

	/**
	* Utilizó la literatura citada para el método
	* Consultar la literatura para pre-post
	*/
	private int partition(ArrayList<Comparing> data, int left, int right) {
		while(true) {
			while(left<right && data.get(left).compareTo(data.get(right))<0) right--;
			
			if(left<right) swap(data,left++, right);
			
			else return right;
			
			while(left<right && data.get(left).compareTo(data.get(right))<0) left++;
			if(left<right) swap(data, left, right--);
			else return right;
		}
	}
	

	/**
	* Utilizó la literatura citada para el método
	* Consultar la literatura para pre-post
	*/
	private void swap(ArrayList<Comparing> data, int max, int last){
		Comparing ind = data.get(last);
		data.set(last, data.get(max));
		data.set(max, ind);
		

	}
	

	/**
	* Utilizó la literatura citada para el método
	* Consultar la literatura para pre-post
	*/
	private void quickSortRecursive(ArrayList<Comparing> data, int left, int right){
		
		int pivot;
		if(left>= right) return;
		pivot = partition(data,left,right);
		quickSortRecursive(data, left, pivot-1);
		quickSortRecursive(data, pivot+1, right);
		
	}

	
}	
