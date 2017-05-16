package bagliListeOrnek;

import java.util.LinkedList;

public class bagliListeOrnek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		yigit yeniYigit = new yigit();
		
		yeniYigit.ekle(1);
		yeniYigit.ekle(2);
		yeniYigit.ekle(3);
		yeniYigit.ekle(4);
		yeniYigit.ekle(5);
		yeniYigit.ekle(6);
		
		System.out.println("Yigit yapýsýnýn elemanlarý : " + yeniYigit.bagliListe);
		System.out.println("Tepe Eleman : " + yeniYigit.tepeEleman());
		System.out.println("Yigit yapýmýzýn ilk elemaný : " + yeniYigit.getir());
		System.out.println("Tepe Eleman : " + yeniYigit.tepeEleman());
		System.out.println("Yigit yapýmýzýn ilk elemaný : " + yeniYigit.getir());
		System.out.println("Tepe Eleman : " + yeniYigit.tepeEleman());
		System.out.println("Yigit yapýsýnýn elemanlarý : " + yeniYigit.bagliListe);
		
	}

}

class yigit {
	public LinkedList bagliListe = new LinkedList();
	
	public void ekle(Object veri){
		bagliListe.addFirst(veri);
	}
	
	public Object getir(){
		return bagliListe.removeFirst();
	}
	
	public Object tepeEleman(){
		return bagliListe.getFirst();
	}
}