package Override;

class A
{

	public void islemYap(int a,int b)
	{
		System.out.println("Ýþlem sonucu :"+(a*b));
	}
	
	public void ornekMetod()
	{
		System.out.println("Üst sýnýfýn metodu");
	}
}

class B extends A
{

	
	
	public void islemYap(int a,int b)
	{
		System.out.println("Ýþlem Sonucu :"+(a+b));
	}
	
	
	public void ornekMetod()
	{
		System.out.println("Üst sýnýftaki metod override edildi yani deðiþtirildi");
	}
}

public class MetodOverride
{
	
	public static void main(String[] args)
	{
		B b1=new B();
		b1.ornekMetod();
		System.out.println("**************");
		b1.islemYap(4,6);
	}

}
