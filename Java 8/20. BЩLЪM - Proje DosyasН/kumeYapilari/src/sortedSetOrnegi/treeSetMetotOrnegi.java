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
		
		System.out.println("A�a� yap�m�z�n elemanlar� :" + ts);
		System.out.println("A�a� yap�m�z�n en k���k eleman� : " + ts.first());
		System.out.println("A�a� yap�m�z�n en b�y�k eleman� : " + ts.last());
		System.out.println("22'den k���k elemanlar : " + ts.headSet(22));
		System.out.println("7 ile 27 aras�ndaki de�erler" + ts.subSet(7, 27));
		System.out.println("33 ten b�y�k elemanlar : " + ts.tailSet(33));
	}

}
