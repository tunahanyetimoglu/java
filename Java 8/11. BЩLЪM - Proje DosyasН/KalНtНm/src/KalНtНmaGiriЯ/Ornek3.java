package KalýtýmaGiriþ;

class A
{
	String a;
}

class B extends A
{
	String a;
	public B(String ad,String ad2)
	{
		super.a=ad;
		this.a=ad2;
	}
	
}


public class Ornek3 
{

	public static void main(String[] args) {
		B b1= new B("Mustafa","Ahmet");
		System.out.println(b1.a);

	}

}
