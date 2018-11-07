/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ardabugravizecalisma;

import java.util.Arrays;

/**
 *
 * @author tuhanan
 */
public class Array {
    
    public static void main(String[] args){
        //Basic Array
        int dizi[] = {1,2,3,4,5};
        int dizi10[] = new int[10];
        dizi10[0] = 5;
        
        
        
        
        for(int i = 0; i < dizi.length ; i++){
            System.out.printf("Dizinin %d. elemanı : %d \n",i+1,dizi[i]);
        }
        //Object Array
        Object dizi2[] = new Object[]{"selami",'c',3,3.10,0.3F,'c',3213};
        
        for(Object o:dizi2){
            System.out.println(o);
        }
        
        //Dizi Kopyalama
        Object dizi3[] = new Object[10];
        System.arraycopy(dizi2,0,dizi3,0,5);
        System.out.print("\n");
        for(Object o:dizi3){
            System.out.println(o);
        }
         System.out.print("\n");
        //Dizi Sıralama
        
        int dizi4[] = {13,224,2,1,5,9};
        Arrays.sort(dizi4,0,5);
        
        for(Integer i: dizi4){
            System.out.println(i);
        }
         System.out.print("\n");
        Arrays.sort(dizi4);
        for(Integer i: dizi4){
            System.out.println(i);
        }
        
        ///Dizilerde Search
         System.out.print("\n");
        int deger = Arrays.binarySearch(dizi4,15);
        if(deger<0){
            System.out.println("Değer bulunamadı");
        }else{
            System.out.println("Bulundu ve indisi : "+deger);
        }
         System.out.print("\n");
         int deger2 = Arrays.binarySearch(dizi4,1);
        if(deger2<0){
            System.out.println("Değer bulunamadı");
        }else{
            System.out.println("Bulundu ve indisi : "+deger2);
        }
        
         System.out.print("\n");
        //Arrays Equals import java.util.Arrays
        
        System.out.println(Arrays.equals(dizi, dizi4)); // eşitse true dönecekti
        
        //Çok boyutlu diziler
        
        int cokBoyutDizi[][] = {{1,3},{2,4},{4,5}};
        
    }
}
