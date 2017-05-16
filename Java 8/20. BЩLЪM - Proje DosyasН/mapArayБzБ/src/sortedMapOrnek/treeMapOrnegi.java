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
		
		agac.put(17, "Çanakkale");
		agac.put(22, "Edirne");
		agac.put(39, "Kýrklareli");
		agac.put(16, "Bursa");
		agac.put(34, "Ýstanbul");
		agac.put(71, "Kýrýkkale");
		
		System.out.println("TreeMap yapýmýz : " + agac);
		System.out.println("22 ve 22den büyük degerler : " + agac.ceilingEntry(22));
		System.out.println("22 ve 22den büyük anahtarlar : " + agac.ceilingKey(22));
		System.out.println("Azalan sýrda anahtarlar : " + agac.descendingKeySet());
		System.out.println("Azalan sýrada yapýmýz : " + agac.descendingMap());
		System.out.println("22 ve 22den küçük degerler : " + agac.floorEntry(22));
		System.out.println("22 ve 22den küçük anahtarlar : " + agac.floorKey(22));
		System.out.println("22den küçük degerler : " + agac.headMap(22));
		System.out.println("22den büyük degerler : " + agac.higherEntry(22));
		System.out.println("22den büyük anahtarlar : " + agac.higherKey(22));
		System.out.println("22den küçük anahtarlar : " + agac.lowerKey(22));
		System.out.println("22den büyük degerler : " + agac.lowerEntry(22));
		System.out.println("22 ile 39 arasýndaki deger : " + agac.subMap(22, 39));
		System.out.println("22 ve 22den büyük deger : " + agac.tailMap(22));
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