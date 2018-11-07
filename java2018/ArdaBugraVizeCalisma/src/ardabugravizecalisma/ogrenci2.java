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
class ogrenci {
    String isim ;
    double not;
    
    static void yaz(ogrenci dizi[]){
        for(ogrenci o:dizi){
            System.out.println(o);
        }
        
        
    }
    
}
public class ogrenci2 { 
    public static void main (String [] args ){
        ogrenci ogrenci1 = new ogrenci();
        ogrenci ogrenci2 = new ogrenci();
        ogrenci ogrenci3 = new ogrenci();
        
        ogrenci ogrenciler[] = new ogrenci[3];
        
        ogrenciler[0] = ogrenci1;
        ogrenciler[1] = ogrenci2;
        ogrenciler[2] = ogrenci3;
        
        ogrenci1.isim = "Alpaslan Buğra Şen" ;
        ogrenci2.isim = "Tunahan Yetimoğlu" ;
        ogrenci3.isim = "Tunca Arda Dikgöt" ;
        ogrenci1.not = 32.20;
        ogrenci2.not = 100.1;
        ogrenci3.not = 0.7511111223333333333333334;
        
        ogrenci.yaz(ogrenciler);
        
        for (int i =0; i<ogrenciler.length;i++){
                System.out.println("Adı: " + ogrenciler[i].isim + "\t "+ ogrenciler[i].not);
        }
        
         
               
           
               
        
    
}
    
}
