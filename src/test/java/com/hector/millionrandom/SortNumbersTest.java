/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hector.millionrandom;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zhector
 */
public class SortNumbersTest {
    
    public SortNumbersTest() throws IOException {
       
    }
    
    
    
     /**
     * Test of sortMillionNumbers method, of class SortNumbers.
     */
    @Test
    public void testSortMillionNumbers() throws Exception {
        System.out.println("sortMillionNumbers");
        String fileOrigin = "testFileOrigin";        
        String fileDestiny = "testFileDestiny";
        GenerateNumbers.randomGenerator(fileOrigin);
        
        
        SortNumbers.sortMillionNumbers(fileOrigin, fileDestiny);
        
        
        File fileSorted = Paths.get(fileDestiny + ".csv").toFile();        

        //File exists
        assertTrue(fileSorted.exists());
        //Not Empty
        assertTrue(fileSorted.length() > 0 );
       
    }
    
}
