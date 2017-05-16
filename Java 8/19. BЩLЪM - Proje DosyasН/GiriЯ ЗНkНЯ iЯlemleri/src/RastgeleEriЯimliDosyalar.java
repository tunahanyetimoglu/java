import java.io.*;


public class RastgeleEriþimliDosyalar
{
	public static void main(String[] args) throws IOException
	{
		File f= new File("C:\\Users\\Mehmet\\Desktop\\ornek5.txt");
		RandomAccessFile far=new RandomAccessFile(f,"rw");
		
		far.writeBytes("Random access file sýnýfý ile dosyaya veri yazdýrýyoruz");
		
		
		far.seek(6);
		far.writeBytes("Mehmet");
		far.close();
		
		File f2= new File("C:\\Users\\Mehmet\\Desktop\\ornek5.txt");
		RandomAccessFile far2=new RandomAccessFile(f2,"r");
		String satir=far2.readLine();
		System.out.println(satir);
	}

}
