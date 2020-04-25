/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 This program reads a file with a list of names and scores. The program 
 * finds and  prints the names with highest and lowest score, the total 
 * amount of grades processed, and the average score of all processed.
 * @author Uzair Ahmed 
 */

public class Question1 {
	
/**
* @param args the command line arguments
* @throws java.io.FileNotFoundException
*/			
    	public static void main(String[] args) throws FileNotFoundException {

    	File inFile = new File("/Users/Uzair/Desktop/Grades.txt");
    	Scanner scFile = new Scanner(inFile);
                
    	int counter = 0;
    	int max = 0;
	int min = 100;
	double total = 0; 
	double average = 0;
    	String Highest = "";
    	String Lowest = "";
                               		          
    	while (scFile.hasNext()){
            
    	String name = scFile.next();
    	String space = scFile.next();
    	int mark = scFile.nextInt();
               			
	if(mark > max){
	max = mark;
    	Highest = name;
	}	
					
	if(mark < min){
	min = mark;
    	Lowest = name;
	}
					
	total += mark;
	counter++;
	average =  Math.round(total / counter);
	}
              
                
    	System.out.println("Highest score: " + Highest + " with a score of " + max);
    	System.out.println("Lowest score: " + Lowest + " with a score of " + min);
    	System.out.println("Total amount of grades processed: " + counter);
    	System.out.println("The average of all grades: " + average);				 
             
 }
			 
}

