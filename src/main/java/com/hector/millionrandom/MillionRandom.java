/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hector.millionrandom;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Main class to generate and sort a million random numbers.
 * @author zhector
 */
public class MillionRandom {
    
    private static final Logger LOG = Logger.getLogger(MillionRandom.class.getName());
    
    
    public static void main(String[] args) {
        
        
        //Get file names
        String originalFile = JOptionPane.showInputDialog("Name of the original file:");
        String destinyFile = JOptionPane.showInputDialog("Name of the destiny file:");
        
        
        //The names should be different
        if(originalFile.equals(destinyFile)){
            JOptionPane.showMessageDialog(null, "The origin and destiny files can´t have the same name.");
            System.exit(-1);
        }
        
        
        //Creation of numbers
        try{
            GenerateNumbers.randomGenerator(originalFile);  
        } catch (IOException ex) {
            LOG.log(Level.SEVERE, "Something went wrong, please try again later.", ex);
            JOptionPane.showMessageDialog(null, ex);
            System.exit(-1);
        }
        
        
        //Sorting numbers
        try{            
            
            SortNumbers.sortMillionNumbers(originalFile,destinyFile);
            
        }catch(NoSuchFileException ex){
            LOG.log(Level.SEVERE, "", ex); 
            JOptionPane.showMessageDialog(null, "File not found.");
            System.exit(-1);
        }catch (IOException ex) {
            LOG.log(Level.SEVERE, "", ex);     
            JOptionPane.showMessageDialog(null, "The file is being using for other process, please try again later.");
            System.exit(-1);
        }
        
        
        //Success
        JOptionPane.showMessageDialog(null, "Process succesfully completed!");
        
    }
}
