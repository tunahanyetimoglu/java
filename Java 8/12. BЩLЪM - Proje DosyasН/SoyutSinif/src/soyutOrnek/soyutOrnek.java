package soyutOrnek;

public class soyutOrnek {

	public abstract class sekil{
		public String isim;
		
		public void isimBelirle(String isim){
			this.isim = isim;
		}
		
		public String isimGetir(){
			return this.isim;
		}
		
		public abstract double alan();
	}
	
	public class ucgen extends sekil{
		public int taban;
		public int yukseklik;
		
		public ucgen(int taban,int yukseklik) {
			isimBelirle("Üçgen");
			this.taban = taban;
			this.yukseklik = yukseklik;
		}
	
		@Override
		public double alan() {
			return (taban*yukseklik)/2;
		}
	}
	
	public class daire extends sekil{
		int r;
		
		daire(int r){
			isimBelirle("Daire");
			this.r = r;
		}
		
		@Override
		public double alan() {
			return Math.PI * Math.pow(r, 2);
		}
		
	}
	
	public class yamuk extends sekil{
		int alt;
		int ust;
		int h;
		
		yamuk(int alt,int ust,int h){
			isimBelirle("Yamuk");
			this.alt = alt;
			this.ust = ust;
			this.h = h;
		}
		
		@Override
		public double alan() {
			return h/2*(alt*ust);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		soyutOrnek.ucgen u = new soyutOrnek().new ucgen(3, 5);
		soyutOrnek.daire d = new soyutOrnek().new daire(5);
		soyutOrnek.yamuk y = new soyutOrnek().new yamuk(2, 8, 4);
		
		System.out.println("Sýnýf : " + u.isimGetir());
		System.out.println("Alan : " + u.alan());

		System.out.println("----------------------------------");
		
		System.out.println("Sýnýf : " + d.isimGetir());
		System.out.println("Alan : " + d.alan());
		
		System.out.println("----------------------------------");
		
		System.out.println("Sýnýf : " + y.isimGetir());
		System.out.println("Alan : " + y.alan());
		
	}

}
