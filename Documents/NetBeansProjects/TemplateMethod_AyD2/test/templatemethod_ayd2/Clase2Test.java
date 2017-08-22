/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod_ayd2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RobertoEduardo
 */
public class Clase2Test {
    
 
    @Test
    public void testMultiplicar() {
        System.out.println("Multiplicar");
        int NumeroRec = 3;
        Clase2 instance = new Clase2();
        int expResult = 300;
        int result = instance.Multiplicar(NumeroRec);
        assertEquals(expResult, result);
        
        if(expResult!= result)
            fail("Calculo Incorrecto");
    }

    /**
     * Test of Sumar method, of class Clase2.
     */
    @Test
    public void testSumar() {
        System.out.println("Sumar");
        int NumeroRec = 10;
        Clase2 instance = new Clase2();
        int expResult = 110;
        int result = instance.Sumar(NumeroRec);
        assertEquals(expResult, result);
       
        if(expResult!= result)
            fail("Calculo Incorrecto");
    }
    
}
