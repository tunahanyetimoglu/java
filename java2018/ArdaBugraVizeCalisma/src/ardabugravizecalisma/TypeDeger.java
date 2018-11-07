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
public class TypeDeger {
    public static void main(String[] args){
            Type a = new Type();
	    System.out.println("Varsayılan byte:" + a.ilk_byte);
	    System.out.println("Varsayılan short:" + a.ilk_short);
	    System.out.println("Varsayılan int:" + a.ilk_int);
	    System.out.println("Varsayılan long:" + a.ilk_long);
	    System.out.println("Varsayılan float:" + a.ilk_float);
	    System.out.println("Varsayılan double:" + a.ilk_double);
	    System.out.println("Varsayılan char:" + a.ilk_char);
	    System.out.println("Varsayılan boolean:" + a.ilk_boolean);
            
          
               
            int d = 5;
            double b= 5.5;
            float f = 3.5F;
            String m = "metin";
            String sm = "5";
            short s = 5;
            long l = 1000;
            char c = 'c';
            boolean bool = false;
             
            String st = Integer.toString(d);
            String st2 = Double.toString(b); 
            String st3 = Float.toString(f);
            String st4 = Short.toString(s); 
            String st5 = Long.toString(l);
            String st6 = Character.toString(c);
            String st7 = Boolean.toString(bool);
            
            int sy = (int) b;
            int sy2 = (int) f;
            int sy3 = (int) s;
            int sy4 = (int) l;
            int sy5 = (int) c;
            int sy6 = Integer.parseInt(sm);
            int sy7 = Integer.valueOf(sm);
            
             
            float f2 = (float) 25E-2;
	    double d3 = 25E-2;
	    long c3 = (long) 25E+10;
	    System.out.println(c);
             
    }

    @Override
    public String toString() {
        return "TypeDeger{" + '}';
    }
}
