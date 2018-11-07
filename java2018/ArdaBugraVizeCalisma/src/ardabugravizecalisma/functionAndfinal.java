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
public class functionAndfinal {
    static final double pi = 3.14;
    
    public static void main(String[] args){
        int yaricap = 5;
        double cevre = daire_cevre(yaricap);
        double alan = daire_alan(yaricap);
        System.out.printf("%d cm yarıçaplı dairenin çevresi %f cm\n",yaricap,cevre);
        System.out.printf("%d cm yarıçaplı dairenin alanı %f cm^2\n",yaricap,alan);
        
        ///////////////////////////
        
        final double avagadro;
        avagadro = 6.02E23;
	System.out.println("Pi sayısı: " + pi);
	System.out.println("Avagadro sayısı: " + avagadro);
	double yari = avagadro/100;
	System.out.println("Avagadro sayısının 100'de biri: " + yari);
       // avagadro = 5;
    
    }
    public static double daire_cevre(int r){
        final double PI = 3.1415;
        double cevre = 2 * PI * r;
        return cevre;
    }
    public static double daire_alan(int r){
        final double PI = 3.1415;
        double alan = PI * r * r;
        return alan;
    }
}

