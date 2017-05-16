package arayuzOrnek;

public class isci implements calisan {
	double ucret;
	
	@Override
	public void bolumYazdir() {
		System.out.println("---Ýþçi---");		
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
