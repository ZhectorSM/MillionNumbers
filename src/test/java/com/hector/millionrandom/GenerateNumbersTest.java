/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hector.millionrandom;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author zhector
 */
public class GenerateNumbersTest {
    
    public GenerateNumbersTest() {
    }
    

    /**
     * Test of randomGenerator method, of class GenerateNumbers.
     * @throws Exception
     */
    @Test
    public void testRandomGenerator() throws Exception {
        
        System.out.println("randomGenerator");
        String fileName = "testFileOrigin";
        GenerateNumbers.randomGenerator(fileName);
        
        File fileOrigin = Paths.get(fileName + ".csv").toFile();      

        //File exists
        assertTrue(fileOrigin.exists());
        //Not Empty
        assertTrue(fileOrigin.length() > 0 );
        
    }
    
}
