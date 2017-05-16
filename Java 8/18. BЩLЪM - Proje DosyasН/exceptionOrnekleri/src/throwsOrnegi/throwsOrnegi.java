package throwsOrnegi;

public class throwsOrnegi {

	static float bolme (int a,int b) throws ArithmeticException{
		if(b==0){
			throw new ArithmeticException("Sýfýra Bölme durumu ");
		}
		
		return a/b;
	}
	
	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		try{ 
			bolme(5,0);
		}
		catch (ArithmeticException ae) {
			System.out.println("Hata :" + ae);
		}
	}

}
