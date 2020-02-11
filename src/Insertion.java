import java.util.ArrayList;

public class Insertion implements iSorts{

	@Override
	public ArrayList<Comparing> sortList(ArrayList<Comparing> data) {
		int n = data.size();
		int numSorted = 1; // number of values in place
		int index; // general index
		while (numSorted < n){
			Comparing temp = data.get((numSorted));
			for (index = numSorted; index > 0; index--){
				if (data.get(numSorted).compareTo(data.get(index-1))<0)
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