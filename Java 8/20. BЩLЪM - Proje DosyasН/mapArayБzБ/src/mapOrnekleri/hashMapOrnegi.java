package mapOrnekleri;

import java.util.HashMap;
import java.util.Set;

public class hashMapOrnegi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hm = new HashMap(10,0.5f);
		
		hm.put(17, "Çanakkale");
		hm.put(22, "Edirne");
		hm.put(39, "Kırklareli");
		hm.put(59, "Tekirdağ");
		hm.put(59, "İstanbul");

		System.out.println("HashMap öğemiz içerisindeki veriler : " + hm);
		Set anahtarlar = hm.keySet();
		Set veriler = hm.entrySet();
		System.out.println("Anahtarlarımız : " + anahtarlar);
		System.out.println("Verilerimiz : " + veriler);
	}

}
