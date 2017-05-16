package diziOrnegi;

import java.util.Arrays;

public class diziOrnegi {

	public static void main(String[] args) {
		int[] dizi = new int[7];
		int[] dizi1 = new int[8];
		dizi1 = new int[]{11,32,42,55,0,12,19,71};
		Object[] dizi2 = new Object[3];
		int[] dizi3 = new int[8]; 
		
		System.out.println(dizi[3]);

		System.out.println("dizi boyutu : " + dizi.length);
		System.out.println("dizi1 boyutu : " + dizi1.length);
//		System.out.println(dizi);
		for(int i = 0;i<dizi1.length;i++){
			System.out.println("Dizi " + i + " indis deðerli elemaný : " + dizi1[i]);
		}
		
		dizi[0] = 12;
		dizi[4] = 105;
		dizi[3] = 1;
		dizi[6] = 55;
		
		System.out.println("---------------------------------------------");
		
		for(int i = 0;i<dizi.length;i++){
			System.out.println("Dizi1 " + i + " indis deðerli elemaný : " + dizi[i]);
		}
		
		dizi2[0] = (int) 132;
		dizi2[1] = (String) "Sezer";
		dizi2[2] = (float) 12.1f;
		
		System.out.println("---------------------------------------------");

		for(int i = 0;i<dizi2.length;i++){
			System.out.println("Dizi2 " + i + " indis deðerli elemaný : " + dizi2[i]);
		}
		
		int a = (int) dizi2[0];
		String s = (String) dizi2[1];
		float f = (float) dizi2[2];
		
		System.arraycopy(dizi1, 0, dizi3, 0, 8);
		
		System.out.println("---------------------------------------------");

		for(int i = 0;i<dizi3.length;i++){
			System.out.println("Dizi3 " + i + " indis deðerli elemaný : " + dizi3[i]);
		}
		
		Arrays.sort(dizi1);
		
		System.out.println("---------------------------------------------");

		for(int i = 0;i<dizi1.length;i++){
			System.out.println("Dizi1 " + i + " indis deðerli elemaný : " + dizi1[i]);
		}
		
		int indis = Arrays.binarySearch(dizi1, 15);
		int indis1 = Arrays.binarySearch(dizi1, 11);
		
		if(indis<0)
			System.out.println("15 Bulunamadý.");
		else
			System.out.println("15 Bulundu, elemanýn indis deðeri = " + indis);

		if(indis1<0)
			System.out.println("11 Bulunamadý.");
		else
			System.out.println("11 Bulundu, elemanýn indis deðeri = " + indis1);
		
		Arrays.sort(dizi3);
		System.out.println(Arrays.equals(dizi3, dizi1));
	}

}
