import java.util.ArrayList;

public class Selection implements iSorts{

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

	private ArrayList<Comparing> swap(ArrayList<Comparing> data, int max, int last){
		Comparing ind = data.get(last);
		data.set(last, data.get(max));
		data.set(max, ind);
		return data;

	}

	
}
	
