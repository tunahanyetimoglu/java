package cokBicimlilikOrnek;

public class cokBicimlilikOrnek {

	public static void main(String[] args) {
		calisan c = new calisan("Sezer","Tanr�verdio�lu");
		isci i = new isci("Mehmet", "Kirazl�");
		pazarlama p = new pazarlama("Faruk", "Pazarl�");
		patron pa = new patron("Cemil", "Temel");
//		
//		c = i;
//		c.yaz();
//		c = p;
//		c.yaz();
		
//		if(c instanceof calisan){
//			calisan c1 = c;
//			c1.yaz();
//		}
//		else if (c instanceof isci){
//			isci i1 = (isci) c;
//			i1.yaz();
//		}
//		else if(c instanceof pazarlama){
//			pazarlama p1 = (pazarlama) c;
//			p1.yaz();
//		}
		
//		calisan[] c = new calisan[3];
//		
//		for(int i=0;i<3;i++){
//			int indis = (int) (Math.random()*3);
//			switch (indis) {
//			case 0:
//				c[indis] = new isci("Sezer", "Tanr�verdio�lu");
//				c[indis].yaz();
//				break;
//			case 1:
//				c[indis] = new pazarlama("Mehmet", "Kirazl�");
//				c[indis].yaz();
//				break;
//			case 2:
//				c[indis] = new patron("Faruk", "Pazarl�");
//				c[indis].yaz();
//				break;
//			default:
//				c[indis] = new calisan("Cemil","Temel");
//				c[indis].yaz();
//				break;
//			}
//		}
		System.out.println(c.getClass());
		System.out.println(i.getClass());
		System.out.println(p.getClass());
		System.out.println(pa.getClass());
	}

}

class calisan{
	String ad;
	String soyad;
	
	calisan(String ad,String soyad){
		this.ad = ad;
		this.soyad = soyad;
	}
	
	public void yaz(){
		System.out.println("�u an �al��an s�n�f�ndas�n�z.");
		calisanYaz();
	}
	
	public void calisanYaz(){
		System.out.println("�al��an Ad ve Soyad : " + ad + " " + soyad);
	}
}

class isci extends calisan{

	isci(String ad, String soyad) {
		super(ad, soyad);
	}
	
	public void yaz(){
		System.out.println("�u an i��i s�n�f�ndas�n�z.");
		isciYaz();
	}
	
	public void isciYaz(){
		System.out.println("���i Ad ve Soyad : " + ad + " " + soyad);
	}
}

class pazarlama extends calisan{

	pazarlama(String ad, String soyad) {
		super(ad, soyad);
	}
	
	public void yaz(){
		System.out.println("�u an pazarlama s�n�f�ndas�n�z.");
		pazarlamaYaz();
	}
	
	public void pazarlamaYaz(){
		System.out.println("pazarlama Ad ve Soyad : " + ad + " " + soyad);
	}	
}

class patron extends calisan{

	patron(String ad, String soyad) {
		super(ad, soyad);
	}
	
	public void yaz(){
		System.out.println("�u an patron s�n�f�ndas�n�z.");
		patronYaz();
	}
	
	public void patronYaz(){
		System.out.println("patron Ad ve Soyad : " + ad + " " + soyad);
	}	
}