package dahiliUye;

public class dahiliUye {

	int sayi = 5;
	static int sayi3 = 5;
	
	public class toplama{
		public int topla(int sayi1,int sayi2){
			return sayi1 + sayi2;
		}
	}
	
	private static class carpma{
		private static int carp(int sayi4, int sayi5){
			return sayi3 * sayi4 * sayi5;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dahiliUye.toplama t = new dahiliUye().new toplama();
		System.out.println("Toplam :" + t.topla(12, 34));
		carpma c = new carpma();
		System.out.println("Çarpým : " + c.carp(3, 2));
	}

}
