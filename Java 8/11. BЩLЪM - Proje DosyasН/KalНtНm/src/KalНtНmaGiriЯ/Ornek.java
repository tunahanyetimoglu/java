package KalýtýmaGiriþ;

class Insan
{
	
}

class Hayvan
{
	private String tür="Hayvan";
	
	public Hayvan()
	{
		System.out.println("Burasý hayvan sýnýfýnýn yapýcýsý");
	}
	
	void nefesAl()
	{
		System.out.println("Hayvan nefes alýyor");
	}
}

class OmurgaliHayvan extends Hayvan
{
	public OmurgaliHayvan()
	{
		System.out.println("Burasý omurgalý hayvan sýnýfýnýn yapýcýsý");
	}
	
	void yazdir()
	{
		System.out.println("Burasý omurgalý hayvan sýnýfýdýr");
	}
}

class OmurgasizHayvan extends Hayvan
{
	public OmurgasizHayvan(String a)
	{
		System.out.println(a);
	}
}

public class Ornek 
{
	
	public static void main(String[] args)
	{
		OmurgaliHayvan o1=new OmurgaliHayvan();
		o1.nefesAl();
		Hayvan h1=new Hayvan();
		//h1.yazdir();
		//o1.tür;
		System.out.println("*********");
		
		OmurgasizHayvan o2=new OmurgasizHayvan("Burasý omurgasýz hayvan sýnýfýnýn yapýcýsý");
	}

}
