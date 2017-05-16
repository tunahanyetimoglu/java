package isimsizSiniOrnegi;

public class isimsizSinifOrnegi {

	public static faktoriyel faktoriyelAl(final double sayi){
		return new faktoriyel() {

			@Override
			public double hesap() {
				double faktoriyel = 1;
				
				for(int i=1;i<=sayi;i++)
					faktoriyel = faktoriyel * i;
				
				return faktoriyel;
			}
		};
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		faktoriyel f = faktoriyelAl(4);
		System.out.println(f.hesap());
	}

}
