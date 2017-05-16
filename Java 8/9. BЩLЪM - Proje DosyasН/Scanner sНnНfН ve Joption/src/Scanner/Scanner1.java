package Scanner;

import java.util.Scanner;

public class Scanner1 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("int tipinde bir deðer girin");
		int a=s.nextInt();
		System.out.println("byte tipinde bir deðer girin");
		byte b=s.nextByte();
		System.out.println("string tipinde bir deðer girin");
		String c=s.next();
		
		System.out.println("Girdiðiniz deðer :"+a);
		System.out.println("Girdiðiniz deðer :"+b);
		System.out.println("Girdiðiniz deðer :"+c);
	}

}
