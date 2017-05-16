package matematikOrnekleri;

import java.util.Random;

public class matematikOrnekleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0;i<=10;i++){
			System.out.println(Math.pow(2, i));
		}
		
		System.out.println("1024 karek�k� :" + Math.sqrt(1024));
		
		System.out.println("-45 mutlak de�eri : " + Math.abs(-45));
		
		System.out.println("3.55 �st de�eri : " + Math.ceil(3.55));
		
		System.out.println("3.55 alt de�eri : " + Math.floor(3.55));
		
		System.out.println("35 ve 150 aras�ndan b�y�k say� : " + Math.max(35, 150));
		
		System.out.println("35 ve 150 aras�ndan k���k say� : " + Math.min(35, 150));
		
		System.out.println("Rasgele say� : " + (int) ((Math.random())*(100)));
		
		Random r = new Random();
		
		int a = r.nextInt(100);
		float f = r.nextFloat();
		
		System.out.println("Random s�n�f�ndan rasgele say� : " + a);
		System.out.println("Random s�n�f�ndan rasgele float say� : " + f);
		
		System.out.println("1.5 radyan " + Math.toDegrees(1.5) + " derecedir.");
		System.out.println("45 derece " + Math.toRadians(45) + " radyand�r.");
		
		System.out.println("Sin 90 = " + Math.sin(Math.toRadians(90)));
		System.out.println("Cos 55 = " + Math.cos(Math.toRadians(55)));
		
		System.out.println("ArcSin 0.47 = " + Math.toDegrees(Math.asin(0.47)));
		System.out.println("ArcCos 0.57 = " + Math.toDegrees(Math.acos(0.57)));
		
		System.out.println("lne = " + Math.log(Math.E));
		System.out.println("log10(5) = " + Math.log10(5));
		System.out.println("ln(7+1) = " + Math.log1p(7));
	}

}
