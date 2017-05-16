package iteratorOrnek;

import java.util.HashSet;
import java.util.Iterator;

public class iteratorOrnek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		Iterator i = hs.iterator();
		
		while(i.hasNext()){
			i.next();
		}
	}
	
	//hasNext()
	//next()
	//remove()
}
