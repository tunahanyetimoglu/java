/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
import java.util.Scanner;

/**
 *
 * @author tuhanan
 */

 class penis{
     float boy;
     float uzunluk;
     float derinlik;
     
     static float hacim(float a,float b,float c){
         float hesapHacim = a*b*c;
         return hesapHacim;
     }
     static float cevre(float a,float b,float c){
         float hesapCevre = 2*(a+b+c);
         return hesapCevre;
     }
    static float haciim(penis pen){
        float hesapHacim = pen.boy*pen.uzunluk*pen.derinlik;
        return hesapHacim;
    }
     
 }
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        penis am = new penis();
        
        am.boy = sc.nextFloat();
        am.derinlik = sc.nextFloat();
        am.uzunluk = sc.nextFloat();
        
        float cevrem = penis.cevre(am.boy, am.derinlik, am.uzunluk);
        float haciiim = penis.haciim(am);
        System.out.println("sa: " + cevrem + " km");
        System.err.println("hacim");
        
               
    }
    
}
