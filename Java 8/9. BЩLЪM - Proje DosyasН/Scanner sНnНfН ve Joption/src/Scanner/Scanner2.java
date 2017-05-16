package Scanner;

import java.util.Scanner;

public class Scanner2 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Faktöriyeli hesaplanacak olan sayýyý girin");
		int sayi=s1.nextInt();
		long sonuc=1;
		for(int i=1;i<=sayi ;i++)
		{
			sonuc*=i;
		}
		System.out.println("sayýmýzýn faktöriyeli: "+sonuc);

	}

}
