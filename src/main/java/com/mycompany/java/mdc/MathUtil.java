package com.mycompany.java.mdc;

/**
 *
 * @author Maquina
 */
public class MathUtil {
    public static int mdc(int a, int b){
        
        //propriedade 7
        a = Math.abs(a);
        b = Math.abs(b);
       
        //propriedade 6
        final int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;
        
        //propriedade 1
        if(b > 0 && a % b == 0){
            return b;
        }
        
        //propriedade 3
        if(b == 0){
            return Math.abs(a);
        }
        
        //propriedade 5
        if(a % b != 0){
            return 1;
        }
        
        return -1;
    }
}
