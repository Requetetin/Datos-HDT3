import java.util.*;
import java.io.*;

/**
 * @author Martín Amado Girón - 19020
 * @since 09/02/2020
 * @version 11/02/2020
 * @className Driver.java
 * Main del programa, encargado de llenar los archivos previo y luego al sort
 */


public class Driver{
	public static void main(String[] args){		
		Random rand = new Random();
		ArrayList<Comparing> arr = new ArrayList<Comparing>();
		//int r = rand.nextInt(2091)+10;
		int r = rand.nextInt(2991)+10;
		File datos = new File("desorden.txt");
		try{
			BufferedWriter writer = new BufferedWriter(new FileWriter(datos));
			for(int i=0; i<=r; i++){
				//int s = rand.nextInt(3001);
				int s = rand.nextInt(3001);
				arr.add(new Comparing(i));
				writer.write(s + "\n");
				
			}
			writer.close();
		}catch(Exception e){
			System.out.println("No hay entrada");
		}

		/*Merge merge = new Merge();
		arr = merge.sortList(arr);*/
		


		/*Selection sel = new Selection();
		arr = sel.sortList(arr);*/

		/*Quick quick = new Quick();
		arr = quick.sortList(arr);*/
		

		/*Insertion ins = new Insertion();
		arr = ins.sortList(arr);*/
		

		Radix rad = new Radix();
		arr = rad.sortList(arr);
		


		

		File output = new File("orden.txt");
		try{
			BufferedWriter wrt = new BufferedWriter(new FileWriter(output));
			for(int i=0; i<arr.size(); i++){
				wrt.write(arr.get(i).getValor()+"\n");
			}
			wrt.close();
		}catch(Exception e){
			System.out.println("No hay salida");
		}



		
	}
}