package serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class serilestirme
{
	public static void main(String[] args) throws Exception 
	{
		musteri m=new musteri("Faruk", "Kalkan", 25);
		FileOutputStream f1=null;
		ObjectOutputStream o2=null;
		
		f1=new FileOutputStream("C:\\Users\\Mehmet\\Desktop\\musteri.txt");
		o2= new ObjectOutputStream(f1);
		
		o2.writeObject(m);
		
	}

}
