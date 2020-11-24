package com.mycompany.java.mdc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Maquina
 */
public class MathUtilTest {   

    @Test
    public void testMdcParP1() {
        final int a = 6;
        final int b = 3;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcImparP1(){
        final int a = 9;
        final int b = 3;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcParesP2(){
        final int a = 16;
        final int b = 8;
        final int divisor = 4;        
        final int obtido = MathUtil.mdc(a, b);
        assertTrue(obtido % divisor == 0);
    }
    
    @Test
    void testMdcAPositivoP3(){
        final int a = 15;
        final int b = 0;
        final int esperado = 15;        
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcANegativoP3(){
        final int a = -30;
        final int b = 0;
        final int esperado = 30;      
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcMParP4(){
        final int a = 9;
        final int b = 3;
        final int m = 2;
        final int esperado = MathUtil.mdc(a*m, b*m);
        final int obtido = m * MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcP5(){
        final int a = 7;
        final int b = 3;
        final int c = 5;
        final int esperado = MathUtil.mdc(a*b, c);
        final int obtido = MathUtil.mdc(b, c);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcP5Resultado1(){
        final int a = 7;
        final int b = 3;
        final int c = 5;
        final int esperado = 1;
        final int obtido = MathUtil.mdc(b, c);
        assertEquals(esperado,obtido);
    }
    
    @Test
    void testMdcP6(){
        final int a = 8;
        final int b = 2;
        final int esperado = MathUtil.mdc(a, b);
        final int obtido = MathUtil.mdc(b, a);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcP7TudoNegativo(){
        final int a = -12;
        final int b = -6;
        final int esperado = 6;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcP8AInteiro(){
        final int a = 10;        
        final int esperado = 10;
        final int obtido = MathUtil.mdc(a, a);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcP9(){
        final int a = 5;
        final int b = 4;
        final int c = 6;        
        final int esperado1 = MathUtil.mdc(a, MathUtil.mdc(b, c));
        final int esperado2 = MathUtil.mdc(MathUtil.mdc(a, b), c);
        final int obtido = MathUtil.mdc(esperado1, esperado2);
        assertEquals(esperado1, obtido);
    }
    
    @Test
    void testMdcP12(){
        final int a = 6;
        final int p = 7;
        final int esperado = 1;
        final int resultado = MathUtil.mdc(p, a);
        assertEquals(esperado, resultado);
    }
}
