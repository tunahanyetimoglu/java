/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ardabugravizecalisma;

/**
 *
 * @author tuhanan
 * 
 * 
 */

class Ornek{
    int sayi;
    int rakam;
    String s;
    
    public static void yaz(){
        System.out.println("ben ornek sınıfına aidim");
    }
}
public class NewClass {
    public static void yaz2(){
        System.out.println("ben newclassin yazıyım");
    }
    public static void main(String[] args){
        Ornek nesne = new Ornek();
        nesne.s = "sex";
        nesne.sayi = 15;
        
       
        System.out.println();
        
        
    }
}
