package Kal�t�maGiri�;

class Otomobil
{
	public String plaka;
	public Otomobil(String plaka)
	{
		this.plaka=plaka;
		System.out.println("OTOMOB�L�N PLAKASI :"+this.plaka);
	}
	
	public Otomobil()
	{
		System.out.println("Buras� otomobil s�n�f�n�n yap�c�s�");
	}
}

class BenzinliOtomobil extends Otomobil
{
	public BenzinliOtomobil()
	{
		System.out.println("Buras� benzinliotomobil s�n�f�n�n yap�c�s�");
	}
}


class GazliOtomobil extends Otomobil
{
	public GazliOtomobil()
	{
		super("34XXX00");
		System.out.println("Buras� gazl�otomobil s�n�f�n�n yap�c�s�");
		
	}
}


public class Ornek2 
{
	public static void main(String[] args)
	{
		GazliOtomobil g1= new GazliOtomobil();
		
	}

}
