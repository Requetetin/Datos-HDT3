import java.util.ArrayList;
import java.util.Vector;

public class Radix implements iSorts{

	ArrayList<Comparing> local;

	@Override
	public ArrayList<Comparing> sortList(ArrayList<Comparing> data) {
		local = data;
		for(int i=0; i<6; i++){
			bucketPass(i);
		}
		return local;
	}
	
	public int digit(int n, int d) {
		if(d==0) return n%10;
		else return digit(n/10, d-1);
	}
	
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