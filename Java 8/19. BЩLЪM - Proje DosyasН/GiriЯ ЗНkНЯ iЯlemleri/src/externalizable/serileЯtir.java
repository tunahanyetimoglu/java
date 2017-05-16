package externalizable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class serileþtir 
{
	public static void main(String[] args) throws Exception
	{
		musteri m1=new musteri("Mehmet", "Kirazlý", 30);
		FileOutputStream f1=new FileOutputStream("C:\\Users\\Mehmet\\Desktop\\musteri2.txt");
		ObjectOutputStream o1=new ObjectOutputStream(f1);
		
		o1.writeObject(m1);
		o1.close();
		
	}

}
