package Kaps�lleme;

public class PublicAnahtari
{
	public void gizlimetod()
	{
		System.out.println("Buras� gizli metoddur");
	}
	public static void main(String[] args) 
	{
		PublicAnahtari nesne1=new PublicAnahtari();
		nesne1.gizlimetod();
	}

}
