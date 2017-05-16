package mapOrnekleri;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class linkedHashMapOrnegi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		
		lhm.put("Çanakkale", 17);
		lhm.put("Tekirdað", 59);
		lhm.put("Edirne", 22);
		lhm.put("Kýrklareli", 39);
		
		System.out.println("Baðlý HashMap yapýmýz : " + lhm);
		Set anahtar = lhm.keySet();
		System.out.println("Anahtarlarýmýz : " + anahtar);
		Collection deger = lhm.values();
		System.out.println("Degerlerimiz : " + deger);
	}

}
