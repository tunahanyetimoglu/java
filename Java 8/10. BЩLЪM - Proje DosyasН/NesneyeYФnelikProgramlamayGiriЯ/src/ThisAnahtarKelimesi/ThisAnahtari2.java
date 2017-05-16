package ThisAnahtarKelimesi;

public class ThisAnahtari2 
{
	
	public ThisAnahtari2(String ad)
	{
		this(ad,"Kirazlý",45);
	}
	
	public ThisAnahtari2(String ad,String soyad,int yas)
	{
		System.out.println("Adý :"+ad+" Soyadý :"+soyad+" Yaþý :"+yas);
	}
	
	
	public static void main(String[] args)
	{
		ThisAnahtari2 t1=new ThisAnahtari2("Mehmet");
	}

}
