package Kal�t�maGiri�;

class Insan
{
	
}

class Hayvan
{
	private String t�r="Hayvan";
	
	public Hayvan()
	{
		System.out.println("Buras� hayvan s�n�f�n�n yap�c�s�");
	}
	
	void nefesAl()
	{
		System.out.println("Hayvan nefes al�yor");
	}
}

class OmurgaliHayvan extends Hayvan
{
	public OmurgaliHayvan()
	{
		System.out.println("Buras� omurgal� hayvan s�n�f�n�n yap�c�s�");
	}
	
	void yazdir()
	{
		System.out.println("Buras� omurgal� hayvan s�n�f�d�r");
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
		//o1.t�r;
		System.out.println("*********");
		
		OmurgasizHayvan o2=new OmurgasizHayvan("Buras� omurgas�z hayvan s�n�f�n�n yap�c�s�");
	}

}
