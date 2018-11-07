/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ardabugravizecalisma;

/**
 *
 * @author tuhanan
 */

class Sinif2{
    static int x = 15;
    static int y = 30;
    static void yazdir(){
        System.out.println(" x ve ye değerleri : " + x + " ve " + y);
    }
}
public class StaticMethod {
    public static int x;
    static void degerVer(int a){
        x = a;       
    }
    static void yaz(){
        System.out.println("static method");
    }
    void yaznoStatic(){
        System.out.println("Static olmayan ");
    }
    public static void main(String[] args){
        
        StaticMethod nesne1 = new StaticMethod();
        StaticMethod nesne2 = new StaticMethod();
        nesne1.degerVer(15);
        nesne2.degerVer(20);
        System.out.println("nesne 1 : "+nesne1.x);
        System.out.println("nesne 2 : "+nesne2.x);
        
        Sinif2.yazdir();
        
        yaz();
      //  yazNoStatic();  hatalı
        nesne1.yaznoStatic(); // static olmayan methodlar nesne ile çalışır
    }
}


