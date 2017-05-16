package SýnýfveNesneKavramý;

public class Calisan 
{
	String ad;
	int maas;
	
	void ata(String a,int b)
	{
		ad=a;
		maas=b;
	}
	
	void yazdir()
	{
		System.out.println("Adý :"+ad+ "olan iþçinin maaþý :"+maas);
	}
	
	public static void main(String[] args) 
	{
		Calisan isci=new Calisan();
		isci.ata("Faruk", 3000);
		isci.yazdir();
		
		Calisan isci2=new Calisan();
		isci2.ata("Mustafa", 2500);
		isci2.yazdir();
		
	}

}
