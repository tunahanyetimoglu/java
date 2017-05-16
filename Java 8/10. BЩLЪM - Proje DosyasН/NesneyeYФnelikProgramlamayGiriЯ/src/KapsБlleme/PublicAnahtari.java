package Kapsülleme;

public class PublicAnahtari
{
	public void gizlimetod()
	{
		System.out.println("Burasý gizli metoddur");
	}
	public static void main(String[] args) 
	{
		PublicAnahtari nesne1=new PublicAnahtari();
		nesne1.gizlimetod();
	}

}
