import java.util.ArrayList;

public class Quick implements iSorts{

	@Override
	public ArrayList<Comparing> sortList(ArrayList<Comparing> data) {
		
		data = quickSortRecursive(data, 0, data.size()-1);
		
		return data;
	}
	
	private int partition(ArrayList<Comparing> data, int left, int right) {
		while(true) {
			while(left<right && data.get(right).compareTo(data.get(left))<0) right--;
			
			if(left<right) swap(data,left++, right);
			
			else return left;
			
			while(left<right && data.get(right).compareTo(data.get(left))<0) left++;
			if(left<right) swap(data, left++, right);
			else return right;
		}
	}
	
	private ArrayList<Comparing> swap(ArrayList<Comparing> data, int max, int last){
		Comparing ind = data.get(last);
		data.set(last, data.get(max));
		data.set(max, ind);
		return data;

	}
	
	private ArrayList<Comparing> quickSortRecursive(ArrayList<Comparing> data, int left, int right){
		
		int pivot;
		if(left>= right) return data;
		pivot = partition(data,left,right);
		data = quickSortRecursive(data, left, pivot-1);
		data = quickSortRecursive(data, pivot+1, right);
		
		return data;
	}

	
}	
