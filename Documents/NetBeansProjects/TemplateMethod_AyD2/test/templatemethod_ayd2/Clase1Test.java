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
public class Clase1Test {
    
    @Test
    public void testMultiplicar() {
        System.out.println("Multiplicar");
        int NumeroRec = 10;
        Clase1 instance = new Clase1();
        int expResult = 100;
        int result = instance.Multiplicar(NumeroRec);
        assertEquals(expResult, result);
        if(expResult != result)
            fail("The test case is a prototype.");
    }

    /**
     * Test of Sumar method, of class Clase1.
     */
    @Test
    public void testSumar() {
        System.out.println("Sumar");
        int NumeroRec = 10;
        Clase1 instance = new Clase1();
        int expResult = 20;
        int result = instance.Sumar(NumeroRec);
        assertEquals(expResult, result);
        
        if(expResult!= result)
            fail("The test case is a prototype.");
    }
    
}
