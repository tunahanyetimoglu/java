package Override;

public class Ogrenci 
{
	public String ad="Mehmet";
	public String soyad="Kirazlý";
	
	public String toString()
	{
		return ad+" "+soyad;
	}
	
	public static void main(String[] args) 
	{
		Ogrenci o1=new Ogrenci();
		System.out.println(o1);
	}

}
