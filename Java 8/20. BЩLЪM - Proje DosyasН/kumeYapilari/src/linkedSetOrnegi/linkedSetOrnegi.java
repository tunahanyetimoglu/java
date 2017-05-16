package linkedSetOrnegi;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedSetOrnegi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("JAVA");
		lhs.add("Android");
		lhs.add("C++");
		lhs.add(".NET");
		lhs.add("Windows Phone");
		lhs.add("HTML5");
		
		Iterator i = lhs.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}

}
