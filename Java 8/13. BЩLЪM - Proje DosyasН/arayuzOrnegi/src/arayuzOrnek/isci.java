package arayuzOrnek;

public class isci implements calisan {
	double ucret;
	
	@Override
	public void bolumYazdir() {
		System.out.println("---���i---");		
	}

	@Override
	public void ucretBelirle(double ucret) {
		this.ucret = ucret;
		
	}

	@Override
	public double ucret() {
		return ucret * calisanSabiti;
	}

}
