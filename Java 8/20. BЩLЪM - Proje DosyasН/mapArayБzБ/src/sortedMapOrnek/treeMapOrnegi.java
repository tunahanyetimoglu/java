package sortedMapOrnek;

import java.util.TreeMap;
import java.util.TreeSet;

public class treeMapOrnegi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap agac = new TreeMap<>();
		
		agac.put(17, "�anakkale");
		agac.put(22, "Edirne");
		agac.put(39, "K�rklareli");
		agac.put(16, "Bursa");
		agac.put(34, "�stanbul");
		agac.put(71, "K�r�kkale");
		
		System.out.println("TreeMap yap�m�z : " + agac);
		System.out.println("22 ve 22den b�y�k degerler : " + agac.ceilingEntry(22));
		System.out.println("22 ve 22den b�y�k anahtarlar : " + agac.ceilingKey(22));
		System.out.println("Azalan s�rda anahtarlar : " + agac.descendingKeySet());
		System.out.println("Azalan s�rada yap�m�z : " + agac.descendingMap());
		System.out.println("22 ve 22den k���k degerler : " + agac.floorEntry(22));
		System.out.println("22 ve 22den k���k anahtarlar : " + agac.floorKey(22));
		System.out.println("22den k���k degerler : " + agac.headMap(22));
		System.out.println("22den b�y�k degerler : " + agac.higherEntry(22));
		System.out.println("22den b�y�k anahtarlar : " + agac.higherKey(22));
		System.out.println("22den k���k anahtarlar : " + agac.lowerKey(22));
		System.out.println("22den b�y�k degerler : " + agac.lowerEntry(22));
		System.out.println("22 ile 39 aras�ndaki deger : " + agac.subMap(22, 39));
		System.out.println("22 ve 22den b�y�k deger : " + agac.tailMap(22));
	}

}

/*
*	ceilingEntry(Key)
*	ceilingKey(Key)
*	descendingKeySet()
*	descendingMap()
*	firstEntry()
*	floorEntry(key)
*	floorKey(key)
*	headMap(key)
*higherEntry(Key)
*	higherKey(Key)
*	lastEntry()
*	lowerEntry(Key)
*	lowerKey(Key)
*	pollFirstEntry()
*	pollLastEntry()
*	subMap(k,l)
*	tailMap(key) 
*/