package Kaps�lleme;

public class ProtectedAnahtari 
{
	protected String gizliDe�isken="Gizli de�i�ken";
	protected void gizlimetod()
	{
		System.out.println("Buras� gizli metoddur");
	}
	
	public static void main(String[] args)
	{
		ProtectedAnahtari nesne1=new ProtectedAnahtari();
		System.out.println(nesne1.gizliDe�isken);
		nesne1.gizlimetod();
	}

}
