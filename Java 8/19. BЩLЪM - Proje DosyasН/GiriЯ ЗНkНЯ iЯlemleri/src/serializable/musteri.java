package serializable;

import java.io.Serializable;

public class musteri implements Serializable
{
	private String ad;
	private String soyad;
	private int yas;
	
	public musteri(String ad,String soyad,int yas)
	{
		this.ad=ad;
		this.soyad=soyad;
		this.yas=yas;
	}
	
	public String getAd()
	{
		return ad;
	}
	
	public String getSoyad()
	{
		return soyad;
	}
	
	public int getYas()
	{
		return yas;
	}
	
	public static void main(String[] args)
	{

	}

}
