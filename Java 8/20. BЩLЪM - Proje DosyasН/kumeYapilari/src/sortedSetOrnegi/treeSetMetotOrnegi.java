package sortedSetOrnegi;

import java.util.Iterator;
import java.util.TreeSet;

public class treeSetMetotOrnegi {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet();
		
		ts.add(1);
		ts.add(17);
		ts.add(42);
		ts.add(33);
		ts.add(19);
		ts.add(71);
		
		System.out.println("Aðaç yapýmýzýn elemanlarý :" + ts);
		System.out.println("Aðaç yapýmýzýn en küçük elemaný : " + ts.first());
		System.out.println("Aðaç yapýmýzýn en büyük elemaný : " + ts.last());
		System.out.println("22'den küçük elemanlar : " + ts.headSet(22));
		System.out.println("7 ile 27 arasýndaki deðerler" + ts.subSet(7, 27));
		System.out.println("33 ten büyük elemanlar : " + ts.tailSet(33));
	}

}
