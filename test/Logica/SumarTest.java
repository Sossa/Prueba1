/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 15
 */
public class SumarTest {
    
    public SumarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of CalcularResultado method, of class Sumar.
     */
    @Test
    public void testCalcularResultado() {
        System.out.println("CalcularResultado");
        double valor1 = 1.0;
        double valor2 = 1.0;
        Sumar instance = new Sumar();
        double expResult = 2.0;
        double result = instance.CalcularResultado(valor1, valor2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //("The test case is a prototype.");
    }

    /**
     * Test of CalcularResta method, of class Sumar.
     */
    @Test
    public void testCalcularResta() {
        System.out.println("CalcularResta");
        double valor1 = 5.0;
        double valor2 = 1.0;
        Sumar instance = new Sumar();
        double expResult = 4.0;
        double result = instance.CalcularResta(valor1, valor2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
