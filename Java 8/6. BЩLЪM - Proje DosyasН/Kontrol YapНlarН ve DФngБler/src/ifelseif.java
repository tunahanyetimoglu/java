
public class ifelseif {

	public static void main(String[] args) 
	{
		int vize=78;
		int fnl=87;
		float ort=(float)(vize*0.3+fnl*0.7);
		
		if(ort>=85)
			System.out.println("Harf notu : AA");
		else if(ort>=70 && ort<85)
			System.out.println("Harf notu :BA");
		else if(ort>=60 && ort<70)
			System.out.println("Harf notu : BB");
		else 
			System.out.println("Dersten kaldýnýz");
	}

}
