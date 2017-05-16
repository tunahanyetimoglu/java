package Kapsülleme;

public class GetterveSetter 

{
	private int sayi;
	private String ad;

	public int getSayi() {
		return sayi;
	}

	public void setSayi(int sayi) {
		this.sayi = sayi;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}
	
	
	public static void main(String[] args)
	{
		GetterveSetter nesne1=new GetterveSetter();
		nesne1.setAd("Mehmet");
		nesne1.setSayi(5);
		
		System.out.println(nesne1.getAd());
		System.out.println(nesne1.getSayi());
		
	}

}
