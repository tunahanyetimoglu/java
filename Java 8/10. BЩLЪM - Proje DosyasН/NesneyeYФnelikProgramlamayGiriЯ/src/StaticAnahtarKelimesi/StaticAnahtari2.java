package StaticAnahtarKelimesi;
import static java.lang.Math.*;
public class StaticAnahtari2 {
	
	public static void ornek()
	{
		System.out.println("Burasý static metoddur.Sýnýf oluþturmadan da eriþebilirsiniz.");
	}
	
	public static void main(String[] args)
	{
		System.out.println(Math.pow(5,3));
		StaticAnahtari2.ornek();
		System.out.println(pow(4,2));
	}

}
