package Scanner;

import java.util.Scanner;

public class Scanner1 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("int tipinde bir de�er girin");
		int a=s.nextInt();
		System.out.println("byte tipinde bir de�er girin");
		byte b=s.nextByte();
		System.out.println("string tipinde bir de�er girin");
		String c=s.next();
		
		System.out.println("Girdi�iniz de�er :"+a);
		System.out.println("Girdi�iniz de�er :"+b);
		System.out.println("Girdi�iniz de�er :"+c);
	}

}
