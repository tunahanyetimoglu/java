import java.io.*;


public class BufferedreaderBufferedWriter 
{
	public static void main(String[] args) throws IOException 
	{
		
		try {
			File f=new File("C:\\Users\\Mehmet\\Desktop\\ornek4.txt");
			FileWriter fw=new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("Buffered Writer s�n�f� ile dosyaya veri yazd�rma\n");
			bw.write("Bu deneme dosyas�d�r");
			bw.flush();
			bw.close();
			
			FileReader fr=new FileReader(f);
			BufferedReader br= new BufferedReader(fr);
			String satir=br.readLine();
			while(satir!=null)
			{
				System.out.println(satir);
				satir=br.readLine();
			}
			
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Dosya �zerinde i�lem yaparken hata olu�tu");
		}
		
		
	}

}
