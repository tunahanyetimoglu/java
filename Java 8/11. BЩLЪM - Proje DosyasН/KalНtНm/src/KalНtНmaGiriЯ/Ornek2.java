package KalýtýmaGiriþ;

class Otomobil
{
	public String plaka;
	public Otomobil(String plaka)
	{
		this.plaka=plaka;
		System.out.println("OTOMOBÝLÝN PLAKASI :"+this.plaka);
	}
	
	public Otomobil()
	{
		System.out.println("Burasý otomobil sýnýfýnýn yapýcýsý");
	}
}

class BenzinliOtomobil extends Otomobil
{
	public BenzinliOtomobil()
	{
		System.out.println("Burasý benzinliotomobil sýnýfýnýn yapýcýsý");
	}
}


class GazliOtomobil extends Otomobil
{
	public GazliOtomobil()
	{
		super("34XXX00");
		System.out.println("Burasý gazlýotomobil sýnýfýnýn yapýcýsý");
		
	}
}


public class Ornek2 
{
	public static void main(String[] args)
	{
		GazliOtomobil g1= new GazliOtomobil();
		
	}

}
