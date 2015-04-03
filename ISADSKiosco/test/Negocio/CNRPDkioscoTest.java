/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import VO.CVORPDKiosco;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author neto
 */
public class CNRPDkioscoTest {
    
    public CNRPDkioscoTest() {
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
     * Test of getListaRPDKiosco method, of class CNRPDkiosco.
     */
    @Test
    public void testGetListaRPDKiosco() throws Exception {
        System.out.println("getListaRPDKiosco");
        CNRPDkiosco instance = new CNRPDkiosco();
        ArrayList<CVORPDKiosco> expResult = null;
        ArrayList<CVORPDKiosco> result = instance.getListaRPDKiosco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscaPRPDKiosco method, of class CNRPDkiosco.
     */
    @Test
    public void testBuscaPRPDKiosco() throws Exception {
        System.out.println("buscaPRPDKiosco");
        Long idKiosco = null;
        String fecha = "";
        CNRPDkiosco instance = new CNRPDkiosco();
        CVORPDKiosco expResult = null;
        CVORPDKiosco result = instance.buscaPRPDKiosco(idKiosco, fecha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
