package mapOrnekleri;

import java.util.HashMap;
import java.util.Set;

public class hashMapOrnegi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hm = new HashMap(10,0.5f);
		
		hm.put(17, "�anakkale");
		hm.put(22, "Edirne");
		hm.put(39, "K�rklareli");
		hm.put(59, "Tekirda�");
		hm.put(59, "�stanbul");

		System.out.println("HashMap ��emiz i�erisindeki veriler : " + hm);
		Set anahtarlar = hm.keySet();
		Set veriler = hm.entrySet();
		System.out.println("Anahtarlar�m�z : " + anahtarlar);
		System.out.println("Verilerimiz : " + veriler);
	}

}
