/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ardabugravizecalisma;
import java.util.Scanner;
/**
 *
 * @author tuhanan
 */

 class arda{
     int yas;
     String ad;
     String soyad;
     int boy =19;
     
     static void ardayaz(){
         System.out.println("arda yazıyor");
     }
     void staticdegil(){
          System.out.println("arda static olmayan yazıyor");
     }
    
}
public class sag {
    static void yaz(){
        System.out.println("yazı yazdım");
    }
    public static void main (String [] args){
        Scanner kamas = new Scanner(System.in); 
        Scanner alpaslan = new Scanner(System.in);
        System.out.println("İki tane sayı gir arda:");
        int alpaslan1 = alpaslan.nextInt();
        int arda1 = alpaslan.nextInt();
        int carpim = alpaslan1 * arda1 ;
        System.out.printf("çarpimlari %d   ",carpim);
        
        yaz();
        
        arda tuna = new arda();
        
        tuna.ardayaz();
        arda.ardayaz();
        tuna.staticdegil();
        
        tuna.yas = 23;
        System.out.println("krdşm isim: ");
        tuna.ad = kamas.next();
        tuna.soyad = kamas.next();
        System.out.printf("%3.4s %S %d akıllı ol",tuna.ad, tuna.soyad, tuna.yas);
        
      
    }
}
