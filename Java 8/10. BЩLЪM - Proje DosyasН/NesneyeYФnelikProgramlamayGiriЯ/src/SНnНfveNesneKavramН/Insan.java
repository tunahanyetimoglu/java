package SýnýfveNesneKavramý;

public class Insan 
{
	String ad;
	int yas;
	
	void adYaz(String adi)
	{
		ad=adi;
	}
	
	void yasYaz(int a)
	{
		yas=a;
	}
	
	String adVer()
	{
		return ad;
	}
	
	int yasVer()
	{
		return yas;
	}
	
	public static void main(String[] args) 
	{
		Insan kisi=new Insan();
		kisi.adYaz("Ahmet");
		kisi.yasYaz(37);
		
		Insan kisi2=new Insan();
		kisi2.adYaz("Mehmet");
		kisi2.yasYaz(29);
		
		System.out.println(kisi.adVer());
		System.out.println(kisi.yasVer());
		System.out.println(kisi2.adVer());
		System.out.println(kisi2.yasVer());
	}

}
