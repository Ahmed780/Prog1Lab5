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
 * This  class encapsulates concepts of a team.
 * @author Uzair Ahmed 
 */

	public class Question55 {
	
/**
* @param args the command line arguments
* @throws java.io.FileNotFoundException
*/		
	
	public static void main(String[] args) {

    	Team teamA = new Team();
	teamA.setName("FCB");
		
	Team teamB = new Team();
	teamB.setName("FCB");
		
	Team teamC = new Team();
	teamC.setName("Real Madrid");

    	System.out.println(teamA.toString());
	System.out.println("Are team A and team B equal? " +teamA.equals(teamB));
	System.out.println("Are team A and team C equal? " +teamA.equals(teamC));	

    }

}

	
