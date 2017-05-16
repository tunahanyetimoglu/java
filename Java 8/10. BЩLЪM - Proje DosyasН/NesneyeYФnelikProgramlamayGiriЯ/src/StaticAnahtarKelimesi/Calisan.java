package StaticAnahtarKelimesi;

public class Calisan 
{
	public static String bolum="Bilgi Ýþlem";
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
		System.out.println("Adý :"+this.ad);
		System.out.println("Soyadý :"+this.soyad);
		System.out.println("Þehri :"+this.sehir);
		System.out.println("Maaþý :"+this.maas);
		System.out.println("Bölümü :"+this.bolum);
	}
	
}
