import java.util.*;
public class Iterator {

	
	private String next;

	public static void main(String[] args) {
	    
		HashSet hSet = new HashSet();
		hSet.add("Ali");
		hSet.add("Veli");
		hSet.add("Ahmet");
		Iterator i =(Iterator) hSet.iterator();
		  while (i.hasNext()){
			  System.out.println("Küme elemanı:" + i.next);
			  i.remove();
			  
		  }
		  System.out.println(hSet);
	   
	   

	}

	private void remove() {
		// TODO Auto-generated method stub
		
	}

}
