package arayuzOrnek;

public class yonetici implements calisan {
	double ucret;
	
	@Override
	public void bolumYazdir() {
		System.out.println("---Y�netici---");				
	}

	@Override
	public void ucretBelirle(double ucret) {
		this.ucret = ucret;
	}

	@Override
	public double ucret() {
		return ucret;
	}

}
