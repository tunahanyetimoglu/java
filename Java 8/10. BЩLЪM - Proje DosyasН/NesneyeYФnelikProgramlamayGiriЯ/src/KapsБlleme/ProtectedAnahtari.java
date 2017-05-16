package Kapsülleme;

public class ProtectedAnahtari 
{
	protected String gizliDeðisken="Gizli deðiþken";
	protected void gizlimetod()
	{
		System.out.println("Burasý gizli metoddur");
	}
	
	public static void main(String[] args)
	{
		ProtectedAnahtari nesne1=new ProtectedAnahtari();
		System.out.println(nesne1.gizliDeðisken);
		nesne1.gizlimetod();
	}

}
