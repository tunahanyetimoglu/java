package Yap�c�lar;

public class Yapicilar
{
	String ad;
	String soyad;
	
	public Yapicilar()
	{
		System.out.println("Varsay�lan yap�c� �a��r�ld�");
	}
	
	public Yapicilar(String a,String b)
	{
		ad=a;
		soyad=b;
	}
	
	public Yapicilar(int a,int b)
	{
		carp(a,b);
	}
	
	void yazdir()
	{
		System.out.println("Ad: "+ad+" Soyad: "+soyad);
	}
	
	void carp(int x,int y)
	{
		System.out.println("�arp�m sonucu: "+(x*y));
	}
	
	public static void main(String[] args)
	{
		Yapicilar nesne1=new Yapicilar();
		Yapicilar nesne2=new Yapicilar("Faruk","Kalkan");
		Yapicilar nesne3=new Yapicilar(5,7);
		nesne2.yazdir();
	}

}
