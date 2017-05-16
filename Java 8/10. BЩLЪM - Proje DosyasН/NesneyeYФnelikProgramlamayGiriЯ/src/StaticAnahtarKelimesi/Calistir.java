package StaticAnahtarKelimesi;

public class Calistir {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calisan isci1=new Calisan("Mehmet","Salih","Mardin",3000);
		Calisan isci2=new Calisan("Mehmet","Kirazlý","Ýstanbul",2000);
		Calisan isci3=new Calisan("Faruk","Kalkan","Ýstanbul",3000);
		Calisan isci4=new Calisan("Yalçýn","Arslan","Ýstanbul",2500);
		isci1.bilgiVer();
		isci2.bilgiVer();
		isci3.bilgiVer();
		isci4.bilgiVer();
	}

}
