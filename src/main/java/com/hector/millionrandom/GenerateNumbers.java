/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hector.millionrandom;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;


/**
 * Class to generate one million of positive random numbers in the range 0 - 1,000,000
 * @author zhector
 */
public class GenerateNumbers {   
    
    /**
     * Method to create a csv file with the random numbers
     * @param fileName Name of the file to create
     * @throws IOException 
     */
    public static void randomGenerator(String fileName) throws IOException {
            
            //Creation of million random numbers
            StringBuilder sbNumbers =  new StringBuilder();
            for(int i = 0; i < 1_000_000; i++){
                sbNumbers.append(new Random().nextInt(1_000_000));//Range 0 - 1,000,000
                sbNumbers.append(",").append("\n");
            }            
                 
            //Write the file
            Path path = Paths.get(fileName + ".csv");
            Files.write(path, sbNumbers.toString()
                              .substring(0, sbNumbers.toString().length()-2)//Remove last comma and \n
                              .getBytes());
            
    }
}
