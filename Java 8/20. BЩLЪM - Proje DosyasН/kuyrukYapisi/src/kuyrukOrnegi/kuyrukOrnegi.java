package kuyrukOrnegi;

import java.util.LinkedList;
import java.util.Queue;

public class kuyrukOrnegi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue kuyruk = new LinkedList();
		
		kuyruk.add("Bir");
		kuyruk.add("Ýki");
		kuyruk.add("Üç");
		kuyruk.offer("Dört");
		kuyruk.offer("Beþ");
		kuyruk.offer("Altý");
		
		System.out.println("kuruktaki elemanlar ---> " + kuyruk );
		while(!kuyruk.isEmpty()){
			System.out.println("Kuyrukta bekleyen eleman : " + kuyruk.peek());
			System.out.println("Kuyruktan çekilen eleman : " + kuyruk.poll());
		}
	}

}
