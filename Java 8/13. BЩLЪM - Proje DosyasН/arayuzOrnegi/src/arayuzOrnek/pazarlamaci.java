package arayuzOrnek;

public class pazarlamaci implements pazarlamaKom {
	double ucret;
	double komisyon;
	
	@Override
	public void bolumYazdir() {
		System.out.println("---Pazarlama---");				
	}

	@Override
	public void ucretBelirle(double ucret) {
		this.ucret = ucret;
	}
	
	public void komBelirle(int adet){
		System.out.println("Satýlan ürün adedi : " + adet);
		komisyon = komSabit*adet;
	}

	@Override
	public double ucret() {
		// TODO Auto-generated method stub
		return (ucret*calisanSabiti)+komisyon;
	}

}
