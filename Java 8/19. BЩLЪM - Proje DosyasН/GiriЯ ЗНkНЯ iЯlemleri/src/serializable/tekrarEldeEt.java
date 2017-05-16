package serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class tekrarEldeEt
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream f2=null;
		ObjectInputStream o2=null;
		
		f2=new FileInputStream("C:\\Users\\Mehmet\\Desktop\\musteri.txt");
		o2=new ObjectInputStream(f2);
		
		musteri m2=(musteri) o2.readObject();
		System.out.println(m2.getAd() + m2.getSoyad() + m2.getYas());
		
	}

}
