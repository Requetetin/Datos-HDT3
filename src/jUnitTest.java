import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class jUnitTest {

	@Test
	public void test() {
		ArrayList<Comparing> uno = new ArrayList<Comparing>();
		ArrayList<Comparing> dos = new ArrayList<Comparing>();
		

		Selection selec = new Selection();
		Radix rad = new Radix();
		Merge merg = new Merge();
		Insertion ins = new Insertion();
		Quick quick = new Quick();
		
		uno.add(new Comparing(5));
		uno.add(new Comparing(2));
		uno.add(new Comparing(15));
		uno.add(new Comparing(6));
		uno.add(new Comparing(9));
		
		dos.add(new Comparing(2));
		dos.add(new Comparing(5));
		dos.add(new Comparing(6));
		dos.add(new Comparing(9));
		dos.add(new Comparing(15));
		
		ArrayList<Comparing> s = new ArrayList<Comparing>();
		s = selec.sortList(uno);
		
		ArrayList<Comparing> r = new ArrayList<Comparing>();
		r = rad.sortList(uno);
		
		ArrayList<Comparing> q = new ArrayList<Comparing>();
		q = quick.sortList(uno);
		
		ArrayList<Comparing> m = new ArrayList<Comparing>();
		m = merg.sortList(uno);
		
		ArrayList<Comparing> in = new ArrayList<Comparing>();
		in = ins.sortList(uno);
		
		/*for(int i=0; i<uno.size(); i++) {//Selection
			assertEquals(dos.get(i).getValor(), s.get(i).getValor());
		}*/
		/*for(int i=0; i<uno.size(); i++) {//Radix
			assertEquals(dos.get(i).getValor(), r.get(i).getValor());
		}*/
		/*for(int i=0; i<uno.size(); i++) {//Quick
			assertEquals(dos.get(i).getValor(), q.get(i).getValor());
		}*/
		/*for(int i=0; i<uno.size(); i++) {//Merge
			assertEquals(dos.get(i).getValor(), m.get(i).getValor());
		}*/
		/*for(int i=0; i<uno.size(); i++) {//insert
			assertEquals(dos.get(i).getValor(), in.get(i).getValor());
		}*/
	}

}

