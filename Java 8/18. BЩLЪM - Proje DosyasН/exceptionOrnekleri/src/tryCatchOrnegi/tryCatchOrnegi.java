package tryCatchOrnegi;

public class tryCatchOrnegi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int dizi[] = {1};
		//	System.out.println(dizi[45]);
			int a = 5;
			int b = 0;
			int c = a/b;
			System.out.println(c);
		} 
		catch (ArithmeticException ae) {
			System.out.println("Aritmetik hata " + ae.toString());
		}
		catch (ArrayIndexOutOfBoundsException ae){
			System.out.println("Dizi Hatas� : " + ae);
		}
		finally{
			System.out.println("finally blogumuz �al��t�");
		}
	}

}

/* try{
 * 		//Kontrol yap�lacak kod
 * }
 * catch(Exception e){
 *		Hata oldu�unda yap�lacak
 * }
 * finally{
 * 		hata olsada olmasada �al���r
 * }
 */

//throw
//throws
//Exception t�r� olu�turma
