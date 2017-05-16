package mapOrnekleri;

import java.util.HashMap;
import java.util.Set;

public class hashMapOrnegi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hm = new HashMap(10,0.5f);
		
		hm.put(17, "Çanakkale");
		hm.put(22, "Edirne");
		hm.put(39, "Kýrklareli");
		hm.put(59, "Tekirdað");
		hm.put(59, "Ýstanbul");

		System.out.println("HashMap öðemiz içerisindeki veriler : " + hm);
		Set anahtarlar = hm.keySet();
		Set veriler = hm.entrySet();
		System.out.println("Anahtarlarýmýz : " + anahtarlar);
		System.out.println("Verilerimiz : " + veriler);
	}

}
