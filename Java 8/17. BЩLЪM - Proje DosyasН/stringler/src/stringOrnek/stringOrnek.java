package stringOrnek;

public class stringOrnek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] dizi = {'d','i','z','g','e'};
		String yeniDizge = new String(dizi);
		String yeniDizge2 = "Bu bir test cümlesidir.";
		String yeniDizge3;
		String yeniDizge4;
		boolean[] kontrol = new boolean[4];
		String isim1 = "erhan";
		String isim2 = "serkan";
		String isim3 = "erkan";
		
		
		yeniDizge3 = yeniDizge2 + " " + yeniDizge;
		yeniDizge4 = yeniDizge.concat(yeniDizge2);
		kontrol[0] = yeniDizge.equals("dizge");
		kontrol[1] = yeniDizge.equals("dizi");
		kontrol[2] = yeniDizge2.equalsIgnoreCase("BU Bir TEST cümlesiDir.");
		kontrol[3] = yeniDizge2.equalsIgnoreCase("TEST");
		
		
		System.out.println(dizi);
		System.out.println(yeniDizge);
		System.out.println(yeniDizge2);
		System.out.println(yeniDizge.length());
		System.out.println(yeniDizge2.length());
		System.out.println(yeniDizge3);
		System.out.println(yeniDizge4);
		for(int i=0; i<4; i++){
			System.out.println(kontrol[i]);
		}
		System.out.println(isim1 + " ve " + isim2 + " Karþýlaþtýrmasý : " + isim1.compareTo(isim2));
		System.out.println(isim1 +" ve " + isim3 + " Karþýlaþtýrmasý : " + isim1.compareToIgnoreCase(isim3));
		System.out.println(isim1 + " Karþýlaþtýrmasý : " + isim1.compareToIgnoreCase("ErHaN"));
		System.out.println(isim2 + " içerisinde " + isim3 + " arama sonucu : " + isim2.regionMatches(1, isim3, 0, isim3.length()));
		System.out.println(yeniDizge2 + " içerisinde aranýlacak kelime 'LeSi' :"  + yeniDizge2.regionMatches(true, 15, "DsLeSi", 2, 4) );
		System.out.println(yeniDizge2 + " baþlanýlan kelime 'Bir' mi ? " + yeniDizge2.startsWith("Bir"));
		System.out.println(yeniDizge2 + " biten kelime 'sidir.' mi ? " + yeniDizge2.endsWith("sidir."));
	}

}

/*
* + operatorü ile
* concat()
* 
*/

/*
* == operatorü yok
* equals ve equalsIgnoreCase
* compareTo ve compareToIgnoreCase()
*/

/*
* 
*/