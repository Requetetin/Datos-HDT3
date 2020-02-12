import java.util.ArrayList;
import java.util.Vector;

/**
 * @author Martín Amado Girón - 19020
 * @since 09/02/2020
 * @version 11/02/2020
 * @className Radix.java
 * Literatura Citada: Bailey, D. (septiembre 2007). "Java Stuctures Data Structure in Java
 * for the Principled Programmer". Williams College.
 * Se encarga de hacer ordenar una estructura de datos Comparing por método de radix
 */

public class Radix implements iSorts{

	ArrayList<Comparing> local;


	/**
     * Método que ordena la lista por medio de radix
     * @pre la lista no esta vacia
     * @pos ordena la lista
     * @param data es la lista de objetos que deben de ser ordenados
     * @return devuelve la lista ordenada
     */
	@Override
	public ArrayList<Comparing> sortList(ArrayList<Comparing> data) {
		local = data;
		for(int i=0; i<6; i++){
			bucketPass(i);
		}
		return local;
	}
	

	/**
	* Utilizó la literatura citada para el método
	* Consultar la literatura para pre-post
	*/
	public int digit(int n, int d) {
		if(d==0) return n%10;
		else return digit(n/10, d-1);
	}
	

	/**
	* Utilizó la literatura citada para el método
	* Consultar la literatura para pre-post
	*/
	public void bucketPass(int d){
		int i,j;
		int value;
		
		Vector<Vector<Integer>> bucket = new Vector<Vector<Integer>>(10);
		bucket.setSize(10);
		
		for(j=0; j<10; j++) bucket.set(j, new Vector<Integer>());
		
		int n = local.size();
		for(i=0; i<n; i++) {
			value = local.get(i).getValor();
			j = digit(value, d);
			bucket.get(j).add(value);
		}
		
		i=n;
		for(j=9; j>=0; j--) {
			while(!bucket.get(j).isEmpty()) {
				i--;
				value = bucket.get(j).remove(bucket.get(j).size()-1);
				local.get(i).setV(value);
			}
		}
		
	}

	
	
}