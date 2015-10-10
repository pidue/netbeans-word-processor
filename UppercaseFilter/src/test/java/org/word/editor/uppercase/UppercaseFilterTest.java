/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.word.editor.uppercase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paolo
 */
public class UppercaseFilterTest {
 

    /**
     * Test of process method, of class UppercaseFilter.
     */
    @Test
    public void testProcess() {
        System.out.println("process");
        String s = "";
        UppercaseFilter instance = new UppercaseFilter();
        String expResult = "";
        String result = instance.process(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
