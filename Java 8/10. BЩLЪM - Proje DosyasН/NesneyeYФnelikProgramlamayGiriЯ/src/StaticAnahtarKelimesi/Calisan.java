package StaticAnahtarKelimesi;

public class Calisan 
{
	public static String bolum="Bilgi ��lem";
	public String ad,soyad,sehir;
	public double maas;
	
	public Calisan(String ad,String soyad,String sehir,double maas)
	{
		this.ad=ad;
		this.soyad=soyad;
		this.sehir=sehir;
		this.maas=maas;
	}
	
	public void bilgiVer()
	{
		System.out.println("Ad� :"+this.ad);
		System.out.println("Soyad� :"+this.soyad);
		System.out.println("�ehri :"+this.sehir);
		System.out.println("Maa�� :"+this.maas);
		System.out.println("B�l�m� :"+this.bolum);
	}
	
}
