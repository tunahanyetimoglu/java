package Kapsülleme;

public class ProtectedAnahtari 
{
	protected String gizliDeğisken="Gizli değişken";
	protected void gizlimetod()
	{
		System.out.println("Burası gizli metoddur");
	}
	
	public static void main(String[] args)
	{
		ProtectedAnahtari nesne1=new ProtectedAnahtari();
		System.out.println(nesne1.gizliDeğisken);
		nesne1.gizlimetod();
	}

}
