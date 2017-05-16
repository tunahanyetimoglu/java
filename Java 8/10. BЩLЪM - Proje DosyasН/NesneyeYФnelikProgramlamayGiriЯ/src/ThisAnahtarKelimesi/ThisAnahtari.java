package ThisAnahtarKelimesi;

public class ThisAnahtari
{
	String ad;
	String soyad;
	
	public void ata(String adi,String soyadi)
	{
		ad=adi;
		soyad=soyadi;
	}
	
	public void Yazdir()
	{
		System.out.println("Ad :"+ad+" Soyad:"+soyad);
	}
	
	public static void main(String[] args) 
	{
		ThisAnahtari t1=new ThisAnahtari();
		t1.ata("Mustafa", "Þahin");
		t1.Yazdir();
	}

}
