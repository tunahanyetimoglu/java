package stringOrnek2;

public class stringOrnek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dizge = "Bu bölümde karakter iþleme metotlarýný öðreniyoruz.";
		char[] hedef = new char[15];
		
		dizge.getChars(11, 19, hedef, 0);
		System.out.println(hedef);
		dizge.getChars(19, 26, hedef, 8);
		System.out.println(hedef);
		
		for(int i =11;i <= 18;i++){
			System.out.println(dizge.charAt(i));
		}
		
		char[] karakter = new char[dizge.length()];
		karakter = dizge.toCharArray();
		
		for(int k=0; k<=karakter.length - 1;k++){
			System.out.print(karakter[k]);
		}
		
		int ilkIndis = dizge.indexOf('a');
		int sonIndis = dizge.lastIndexOf('a');
		
		System.out.println(dizge.charAt(ilkIndis));
		System.out.println(ilkIndis + " " + sonIndis);
		System.out.println(dizge.charAt(sonIndis));
		
		System.out.println(dizge.substring(ilkIndis, sonIndis));
		System.out.println(dizge.replace('i', 'I'));
		System.out.println(dizge);
		System.out.println(dizge.trim());
		String buyuk = dizge.toUpperCase();
		System.out.println(buyuk);
		System.out.println(buyuk.toLowerCase());
		
		int i = 35;
		float f = 35.f;
		long l = 1000000000;
		boolean b = false;
		Object o = new String("deneme");
		String s;
		
		s = String.valueOf(i);
		System.out.println(s);
		s = String.valueOf(l);
		System.out.println(s);
		s = String.valueOf(f);
		System.out.println(s);
		s = String.valueOf(b);
		System.out.println(s);
		s = String.valueOf(o);
		System.out.println(s);
	}

}

/*
* getChars(baslangic,bitis,hedefDizi[],hedefIndis)
*/

/*
* subString(ilkIndis,sonIndis)
* replace(orjKar,degKar)
* trim()
* toUpperCase() ve toLowerCase()
* valueOf()
*/