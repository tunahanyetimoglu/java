package arayuzOrnek;


public class arayuzOrnek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isci i = new isci();
		i.bolumYazdir();
		i.ucretBelirle(912.23);
		System.out.println("Ücret :" + i.ucret());
		
		yonetici y = new yonetici();
		y.bolumYazdir();
		y.ucretBelirle(1078.28);
		System.out.println("Ücret :" + y.ucret());
		
		pazarlamaci p = new pazarlamaci();
		p.bolumYazdir();
		p.ucretBelirle(976.45);
		p.komBelirle(50);
		System.out.println("Komisyon : " + p.komisyon);
		System.out.println("Ücret :" + p.ucret());
	}

}