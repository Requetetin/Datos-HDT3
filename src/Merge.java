import java.util.ArrayList;

public class Merge implements iSorts{

	

	@Override
	public ArrayList<Comparing> sortList(ArrayList<Comparing> data) {
		data = mergeSortRecursive(data, new ArrayList<Comparing>(), 0, data.size()-1);
		return data;
	}
	
	private ArrayList<Comparing> merge(ArrayList<Comparing> data, ArrayList<Comparing> temp, int low, int middle, int high) {
		
		int ri = low;
		int ti = low;
		int di = middle;
		
		while(ti<middle && di<=high) {
			if(temp.get(ti).compareTo(data.get(di))<0) {
				data.set(ri++, data.get(di++));
			}else {
				data.set(ri++, temp.get(ti++));
			}
		}
		while(ti<middle) {
			data.set(ri++, temp.get(ti++));
		}
		
		return data;
	}
	
	private ArrayList<Comparing> mergeSortRecursive(ArrayList<Comparing> data, ArrayList<Comparing> temp, int low, int high){
		
		int n = high-low+1;
		int middle = low +n/2;
		int i;
		
		if(n<2) return data;
		
		for(i=low; i<middle;i++) {
			temp.set(i, data.get(i));
		}
		
		temp = mergeSortRecursive(temp,data,low,middle-1);
		
		data = mergeSortRecursive(data, temp, middle, high);
		
		data = merge(data, temp, low, middle, high);
		
		return data;
	}
	
}