package kitap.bolum6.donguler;

public class whiledongusu 
{

	public static void main(String[] args)
	{
		int sayi=5;
		int dongu=0;
		while(sayi>0)
		{
			System.out.println("D�ng� �al��t�");
			dongu++;
			sayi-=2;
		}
		System.out.println("D�ng�m�z" + dongu + " kere �al��t�");
	}

}
