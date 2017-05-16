package arraysmetot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraysmetot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer dizi[] = {11,2,3,6,9,3,6,2};
		List liste = new ArrayList();
		Integer dizi1[] = new Integer[8];
		
		liste = Arrays.asList(dizi);
		
		System.out.println(liste.get(4));
		System.out.println(liste);
		
//		dizi1 = Arrays.copyOf(dizi, 4);
//		
//		liste = Arrays.asList(dizi1);
//		System.out.println(liste);
		
//		dizi1 = Arrays.copyOfRange(dizi, 2, 6);
//		
//		liste = Arrays.asList(dizi1);
//		System.out.println(liste);
		
		Arrays.fill(dizi1, 1);
		liste = Arrays.asList(dizi1);
		System.out.println(liste);
		Arrays.fill(dizi, 1);
		liste = Arrays.asList(dizi);
		System.out.println(liste);
		
	}

}
