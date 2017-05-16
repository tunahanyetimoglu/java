package yerelSinifOrnegi;

public class yerelSinifOrnegi {

	public static boolean mukemmelSayiBul(int m){
		
		class mukemmelSayi{
			public boolean mukemmelSayi(int mukemmel){
				int bolenToplam = 0;
				boolean kontrol;
				
				for(int i= 1;i<mukemmel;i++){
					if(mukemmel%i == 0)
						bolenToplam += i;
				}
				
				if(bolenToplam == mukemmel)
					kontrol = true;
				else
					kontrol = false;
				
				return kontrol;
			}
		}
		
		mukemmelSayi sayi = new mukemmelSayi();
		return sayi.mukemmelSayi(m);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mukemmelSayiBul(6));
		System.out.println(mukemmelSayiBul(12));
	}

}
