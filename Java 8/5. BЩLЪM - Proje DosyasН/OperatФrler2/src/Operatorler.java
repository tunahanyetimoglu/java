
public class Operatorler {

	public static void main(String[] args) 
	{
		boolean a=true;
		boolean b=false;
		
		System.out.println(true & false);
		System.out.println(a | b);
		System.out.println(a && b);
		System.out.println(a || b);
		
		String ad="Mehmet";
		int sifre=1234;
		
		if(ad=="Mehmett" || sifre==12345)
			System.out.println("Giri� yap�ld�");
		else
			System.out.println("Giri� ba�ar�s�z");
		
	}

}
