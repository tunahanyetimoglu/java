
public class ifelse 
{
	public static void main(String[] args) 
	{
		int vize=30;
		int fnl=45;
		float ort=(float)(vize*0.3+fnl*0.7);
		
		if(ort>40)
		{
			System.out.println("Dersi geçtiniz");
			System.out.println("Notunuz :" + ort);
		}
		else
		{
		System.out.println("Dersi geçemediniz");
		System.out.println("Notunuz :" + ort);
		}
		
	}

}
