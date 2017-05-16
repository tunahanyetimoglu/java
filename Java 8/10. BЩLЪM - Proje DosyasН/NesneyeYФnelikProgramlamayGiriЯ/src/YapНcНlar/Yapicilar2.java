package Yapýcýlar;

public class Yapicilar2 
{
	static int i=0;
	public Yapicilar2()
	{
		i++;
	}
	
	
	public static void main(String[] args) 
	{
		Yapicilar2 nesneler[]=new Yapicilar2[5];
		nesneler[0]=new Yapicilar2();
		nesneler[1]=new Yapicilar2();
		nesneler[2]=new Yapicilar2();
		nesneler[3]=new Yapicilar2();
		nesneler[4]=new Yapicilar2();
		System.out.println(nesneler[0].i+" defa nesne oluþturulmuþtur");
	}

}
