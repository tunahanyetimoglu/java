package Override;

class A
{

	public void islemYap(int a,int b)
	{
		System.out.println("��lem sonucu :"+(a*b));
	}
	
	public void ornekMetod()
	{
		System.out.println("�st s�n�f�n metodu");
	}
}

class B extends A
{

	
	
	public void islemYap(int a,int b)
	{
		System.out.println("��lem Sonucu :"+(a+b));
	}
	
	
	public void ornekMetod()
	{
		System.out.println("�st s�n�ftaki metod override edildi yani de�i�tirildi");
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
