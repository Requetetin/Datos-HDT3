

public class Comparing implements Comparable<Comparing>{

	int aComparar;
	

	public Comparing(int aComparar){
		this.aComparar = aComparar;
	}
	@Override
	public int compareTo(Comparing o) {
		int r = this.aComparar-o.getValor();
		return r;
	}
	
	public int getValor() {
		return this.aComparar;
	}

	public void setV(int aComparar){
		this.aComparar = aComparar;
	}
	
	
	

	

}