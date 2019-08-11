/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hector.millionrandom;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Class to sort the numbers created for the generator
 * @author zhector
 */
public class SortNumbers {

    /**
     * Method to sort the numbers from the origin file
     * @param fileOrigin Name of the Original file
     * @param fileDestiny Name of the Sorted file
     * @throws IOException 
     */
    public static void sortMillionNumbers(String fileOrigin, String fileDestiny) throws IOException {

        //Path files
        Path pathOrigin = Paths.get(fileOrigin + ".csv");
        Path pathSort = Paths.get(fileDestiny + ".csv");

        //Open resources
        try (Stream<String> numStream = Files.lines(pathOrigin);
             PrintWriter pw = new PrintWriter(Files.newBufferedWriter(pathSort))) {

            //Read the file
            String numbers = numStream.collect(Collectors.joining());
            //Map to Integer
            IntStream stremNums = Arrays.stream(numbers.split(",")).mapToInt(x -> Integer.valueOf(x));
            stremNums.sorted().forEach(pw::println); //Sort and write

        }
    }
}
