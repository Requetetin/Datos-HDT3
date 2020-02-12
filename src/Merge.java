import java.util.ArrayList;

/**
 * @author Martín Amado Girón - 19020
 * @since 09/02/2020
 * @version 11/02/2020
 * @className Merge.java
 * Literatura Citada: Bailey, D. (septiembre 2007). "Java Stuctures Data Structure in Java
 * for the Principled Programmer". Williams College.
 * Se encarga de hacer ordenar una estructura de datos Comparing por método de Merge
 */

public class Merge implements iSorts{

	
	/**
     * Método que ordena la lista por medio de merge
     * @pre la lista no esta vacia
     * @pos ordena la lista
     * @param data es la lista de objetos que deben de ser ordenados
     * @return devuelve la lista ordenada
     */
    @Override
	public ArrayList<Comparing> sortList(ArrayList<Comparing> data) {
		ArrayList<Comparing> local = new ArrayList<Comparing>();
		local.addAll(data);

		mergeSortRecursive(data, local, 0, data.size()-1);
		return data;
	}
	

	/**
	* Utilizó la literatura citada para el método
	* Consultar la literatura para pre-post
	*/
	private void merge(ArrayList<Comparing> data, ArrayList<Comparing> local, int low, int middle, int high) {
		
		int ri = low;
		int ti = low;
		int di = middle;
		
		while(ti<middle && di<=high) {
			if(data.get(di).compareTo(local.get(ti))<0) {
				data.set(ri++, data.get(di++));
			}else {
				data.set(ri++, local.get(ti++));
			}
		}
		while(ti<middle) {
			data.set(ri++, local.get(ti++));
		}
		
		
	}
	

	/**
	* Utilizó la literatura citada para el método
	* Consultar la literatura para pre-post
	*/
	private void mergeSortRecursive(ArrayList<Comparing> data, ArrayList<Comparing> local, int low, int high){
		
		int n = high-low+1;
		int middle = low +n/2;
		int i;
		
		if(n<2) return;
		
		for(i=low; i<middle;i++) {
			local.set(i, data.get(i));
		}
		
		mergeSortRecursive(local,data,low,middle-1);
		
		mergeSortRecursive(data, local, middle, high);
		
		merge(data, local, low, middle, high);
		
		
	}
	
}