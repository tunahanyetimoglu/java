package Scanner;

import java.util.Scanner;

public class Scanner3 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int toplam=0;
		while(true)
		{
			System.out.println("deðer girin");
			int sayi=s.nextInt();
			if(sayi<0)
			{
				break;
			}
			
			toplam+=sayi;
			
		}
		System.out.println("toplam :"+toplam);
		
	}

}
