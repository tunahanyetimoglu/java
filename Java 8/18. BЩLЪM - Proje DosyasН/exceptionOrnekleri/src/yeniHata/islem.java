package yeniHata;

public class islem {

	static int carp(int a,int b) throws ArithmeticException,yeniHata {
		if (a>100 && b>100)
			throw new yeniHata(a,b);
		return a*b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(carp(12,50));
			System.out.println(carp(120,500));
		} catch (yeniHata yh) {
			// TODO: handle exception
			System.out.println(yh.toString());
		}
	}

}
