import java.util.Scanner;
public class scanner_array{
   int deger =0;
   void toplama(int dizi[]){
      for(int i:dizi){
        deger = deger+i;
      }
      System.out.println(deger);
   }
  public static void main(String[] args){
    Scanner a = new Scanner(System.in);
    scanner_array nesne = new scanner_array();
    int dizi[] = new int[10];
    for(int i=0;i<10;i++){
      int sayi = a.nextInt();
 			  dizi[i] = sayi;
    }
    nesne.toplama(dizi);
  }
}
