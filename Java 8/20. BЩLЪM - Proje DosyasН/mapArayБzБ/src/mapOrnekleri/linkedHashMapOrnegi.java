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
		
		lhm.put("�anakkale", 17);
		lhm.put("Tekirda�", 59);
		lhm.put("Edirne", 22);
		lhm.put("K�rklareli", 39);
		
		System.out.println("Ba�l� HashMap yap�m�z : " + lhm);
		Set anahtar = lhm.keySet();
		System.out.println("Anahtarlar�m�z : " + anahtar);
		Collection deger = lhm.values();
		System.out.println("Degerlerimiz : " + deger);
	}

}
