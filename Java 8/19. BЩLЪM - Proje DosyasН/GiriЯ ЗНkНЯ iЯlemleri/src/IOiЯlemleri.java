import java.io.*;


public class IOiþlemleri
{
	public static void main(String[] args) throws IOException 
	{
		
		File f=new File("C:\\Users\\Mehmet\\Desktop\\ornek2.txt");
		FileReader fr=new FileReader(f);
		char [] okunan = new char[(int) f.length()];
		
		fr.read(okunan);
		String veriler = new String(okunan);
		
		System.out.println(veriler);
		
	}

}
