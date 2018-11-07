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
public class continueBreak {
    	    public static void main(String[] args) {  
        for(int i = 0; i< 5; i++){  
            label:  
            for(int j = 0; j< 5; j++){  
                for(int z = 0; z< 5; z++){  
                    if(z == 3){  
                        break label;  
                    }  
                    System.out.println("i :"+i+" j :"+j+" z :"+z);  
                }  
            }  
        }  
    }  
}
