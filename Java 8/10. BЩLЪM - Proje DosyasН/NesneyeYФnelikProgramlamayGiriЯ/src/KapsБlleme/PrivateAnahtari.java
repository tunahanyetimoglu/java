package Kapsülleme;

public class PrivateAnahtari {

	private String gizli="Gizli deðiþken";
	private void gizliMetod()
	{
		System.out.println("Burasý gizli metod");
	}
	public static void main(String[] args)
	{
		PrivateAnahtari nesne1=new PrivateAnahtari();
		nesne1.gizliMetod();
		System.out.println(nesne1.gizli);
	}

}
