package listeOrnekleri;

import java.util.ArrayList;
import java.util.ListIterator;

public class listeOrneleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList listeYapisi = new ArrayList();
		
		listeYapisi.add("Edirne");
		listeYapisi.add("�stanbul");
		listeYapisi.add("K�rklareli");
		listeYapisi.add("Tekirda�");
		listeYapisi.add("�anakkale");
		listeYapisi.add(1);
		listeYapisi.add("Edirne");
		listeYapisi.set(5, "Bursa");
		
		ListIterator li = listeYapisi.listIterator();
		
		System.out.println("Ba�tan tarama");
		
		while(li.hasNext()){
			System.out.print("�ndis de�eri : " + li.nextIndex() + " ");
			System.out.println("Eleman�m�z : " + li.next());
		}
		
		System.out.println("Sondan tarama");
		
		while(li.hasPrevious()){
			System.out.print("�ndis de�eri : " + li.previousIndex() + " ");
			System.out.println("Eleman�m�z : " + li.previous());
		}
		
		System.out.println(listeYapisi.get(4));
	}

	/*
	 * listIterator
	 * add()
	 * set()
	 * hasNext()
	 * hasPrevious()
	 * next()
	 * previous()
	 * nextIndex()
	 * previousIndex()
	 * 
	 */
}
