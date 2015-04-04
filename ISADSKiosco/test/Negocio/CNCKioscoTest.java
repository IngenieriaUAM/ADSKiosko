/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import VO.CVOCKiosco;
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
public class CNCKioscoTest {
    
    public CNCKioscoTest() {
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
     * Test of getListaClientes method, of class CNCKiosco.
     */
    @Test
    public void testGetListaClientes() throws Exception {
        System.out.println("getListaClientes");
        CNCKiosco instance = new CNCKiosco();
        ArrayList<CVOCKiosco> expResult = new ArrayList<CVOCKiosco>();
        expResult.add(new CVOCKiosco(1, "calle de las animas", 1L));
        expResult.add(new CVOCKiosco(1, "calle de las animas", 2L));
        expResult.add(new CVOCKiosco(1, "calle de las animas", 3L));
        expResult.add(new CVOCKiosco(2, "av. las torres 10 cerrada", 4L));
        expResult.add(new CVOCKiosco(2, "av. las torres 10 cerrada", 5L));

        ArrayList<CVOCKiosco> result = instance.getListaClientes();
        int i = 0;
        while(i<result.size()){
            assertTrue(instance.getListaClientes().get(i).equals(expResult.get(i)));
            i++;
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
