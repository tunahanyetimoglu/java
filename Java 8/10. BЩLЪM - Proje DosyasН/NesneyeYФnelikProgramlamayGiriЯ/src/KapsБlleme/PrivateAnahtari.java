package Kaps�lleme;

public class PrivateAnahtari {

	private String gizli="Gizli de�i�ken";
	private void gizliMetod()
	{
		System.out.println("Buras� gizli metod");
	}
	public static void main(String[] args)
	{
		PrivateAnahtari nesne1=new PrivateAnahtari();
		nesne1.gizliMetod();
		System.out.println(nesne1.gizli);
	}

}
