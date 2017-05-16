package sortedSetOrnegi;

import java.util.Iterator;
import java.util.TreeSet;

public class treeSetOrnegi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet();
		
		ts.add("JAVA");
		ts.add("Android");
		ts.add("C++");
		ts.add(".NET");
		ts.add("Windows Phone");
		ts.add("HTML5");
		
		Iterator i = ts.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
		}

	}

}
