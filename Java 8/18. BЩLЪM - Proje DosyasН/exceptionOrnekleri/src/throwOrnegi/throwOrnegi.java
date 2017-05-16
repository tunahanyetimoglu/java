package throwOrnegi;

public class throwOrnegi {

	static int topla(int a,int b){
		
		try {
			if(a>20 && b>20){
				throw new Exception("Ýki SAyý 20den büyük");
			}	
			a = a+ b;
		} catch (Exception e) {
			System.out.println("Hata " + e);
		}
		
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(topla(12,25));
		System.out.println(topla(20,20));
		System.out.println(topla(32,25));
	}

}
