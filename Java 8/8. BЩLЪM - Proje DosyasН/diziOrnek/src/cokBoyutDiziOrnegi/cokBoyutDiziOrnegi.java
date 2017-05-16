package cokBoyutDiziOrnegi;

public class cokBoyutDiziOrnegi {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matris[][] = {{11,16,19,2},{14,34,23,6},{22,78,21,1},{12,45,23,7}};
		int matris2[][] = {{3,17,41,12},{34,46,21,6},{19,21,11,7},{22,16,4,49}};
		matris m = new matris();
		
		m.topla(matris, matris2);
		
		int cokBoyut[][][] = new int[3][2][4];
		
		System.out.println(cokBoyut.length);
		System.out.println(cokBoyut[1].length);
		System.out.println(cokBoyut[1][1].length);

	}
	
}

class matris{
	public void topla(int[][] matris1,int matris2[][]){
		goster(matris1);
		System.out.println();
		goster(matris2);
		System.out.println();
		int toplam[][] = new int[4][4];
		
		for(int i =0;i<matris1.length;i++){
			System.out.println(i + ".Satýr toplamý");
			for(int j = 0;j<matris1[i].length;j++){
				toplam[i][j] = matris1[i][j] + matris2[i][j];
			}
		}
		
		System.out.println();
		goster(toplam);
	}
	
	public void goster(int[][] matris){
	
		for(int i= 0;i<matris.length;i++){
			System.out.print("|");
			for(int j=0;j<matris[i].length;j++){
				System.out.print(matris[i][j] + " ");
			}
			System.out.println("|");
		}
		
	}
}