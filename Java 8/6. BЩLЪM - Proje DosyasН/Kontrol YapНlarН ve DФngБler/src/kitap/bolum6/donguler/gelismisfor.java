package kitap.bolum6.donguler;

public class gelismisfor 
{

	public static void main(String[] args) 
	{
		String [] isimler={"Mehmet","Ahmet","Sezer"};
		
		for(int i=0 ; i<3 ; i++)
		{
			System.out.println(isimler[i]);
		}
		
		System.out.println("********");
		
		for(String a : isimler)
		{
			System.out.println(a);
		}
		
		
	}

}
