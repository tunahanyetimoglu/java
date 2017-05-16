package hashSetOrnegi;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetOrnegi {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		boolean b1,b2;
		
		b1 = hs.add("JAVA");
		hs.add("Android");
		hs.add("C++");
		hs.add(".NET");
		hs.add("Windows Phone");
		hs.add("HTML5");
		b2 = hs.add("JAVA");
		
		Iterator i = hs.iterator();
		
		System.out.println(b1 +" - "+ b2);
		
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}

}
