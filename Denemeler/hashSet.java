
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.LinkedList;


public class hashSet {


	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Kiraz");
		hs.add("Armut");
		hs.add("Elma");
		hs.add("Keke");
		hs.remove("Keke");
		System.out.println(hs);
		
		
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(70);
		ts.add(89);
		ts.add(1);
		System.out.println(ts);
		
		Iterator i = ts.iterator();
		while(i.hasNext()){
			System.out.println(i.next()+"");
			i.remove();
		}
		System.out.println(ts);
		
		LinkedList llist1 = new LinkedList();
		LinkedList llist2 = new LinkedList();
		llist1.add("1");
		llist1.add("10");
		llist1.add("100");
		llist1.add("1000");
		llist1.add("102");
		
		llist2.add("4");
		llist2.add("24");
		llist2.add("462");
		llist2.add("287");
		llist2.add("404");
		
		llist1.addAll(llist2);
		System.out.println(llist1);
		llist2.clear();
		System.out.println(llist2);
		System.out.println(llist1.get(llist1.size() - 1));
		llist1.set(0 , "Elma");
		System.out.println(llist1);
		System.out.println(llist1.indexOf("1"));
		System.out.println(llist1.lastIndexOf("4"));
		
	

		
		

	
	}

}
