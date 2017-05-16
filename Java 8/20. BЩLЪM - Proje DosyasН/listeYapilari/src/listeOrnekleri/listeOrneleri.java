package listeOrnekleri;

import java.util.ArrayList;
import java.util.ListIterator;

public class listeOrneleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList listeYapisi = new ArrayList();
		
		listeYapisi.add("Edirne");
		listeYapisi.add("Ýstanbul");
		listeYapisi.add("Kýrklareli");
		listeYapisi.add("Tekirdað");
		listeYapisi.add("Çanakkale");
		listeYapisi.add(1);
		listeYapisi.add("Edirne");
		listeYapisi.set(5, "Bursa");
		
		ListIterator li = listeYapisi.listIterator();
		
		System.out.println("Baþtan tarama");
		
		while(li.hasNext()){
			System.out.print("Ýndis deðeri : " + li.nextIndex() + " ");
			System.out.println("Elemanýmýz : " + li.next());
		}
		
		System.out.println("Sondan tarama");
		
		while(li.hasPrevious()){
			System.out.print("Ýndis deðeri : " + li.previousIndex() + " ");
			System.out.println("Elemanýmýz : " + li.previous());
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
