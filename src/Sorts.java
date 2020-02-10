

public class Sorts /*implements iSorts*/{
	public void selectionSort(int data[], int n){
		// pre: 0 <= n <= data.length
		// post: values in data[0..n-1] are in ascending order

		int numUnsorted = n;
		int index; // general index
		int max; // index of largest value
		while (numUnsorted > 0){
		// determine maximum value in array
			max = 0;
			for (index = 1; index < numUnsorted; index++){
				if (data[max] < data[index]) max = index;
			}
		swap(data,max,numUnsorted-1);
		numUnsorted--;
		}

	}


	public void mergeSort(int data[], int n){

	}


	public void quickSort(int data[], int n){

	}


	public void radixSort(int data[]){

	}


	public void insertionSort(int data[], int n){

	}
}