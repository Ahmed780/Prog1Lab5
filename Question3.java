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
*This class encapsulates the concept of a book 
* @author Uzair Ahmed 
*/
public class Client {
/**
* @param args the command line arguments
* @throws java.io.FileNotFoundException
*/		

    public static void main(String[] args) {
    
	Book book1 = new Book("Java Illumminated 10th Edition","978-1284-140996");
        book1.setAuthor("Herve Franceshi");
        book1.setBookYear(2019);
        
	Book book2 = new Book("An introduction to the history and philosophy of science","978-1119-118893"); 
        book2.setAuthor("Richard Dewitt");
        book2.setBookYear(2018);
        
		
	Book book3 = new Book("Writing and Workshopping Poetry","978-155481-3087");
        book3.setAuthor("Stephen Guppy");
        book3.setBookYear(2015);
        	
        System.out.println("Book info" + "\n"    + book1);
        System.out.println("\nBook info " + "\n" + book2);
	System.out.println("\nBook info " + "\n" + book3);
		
        System.out.println("\nAre books one and two the same?: " + book1.equals(book2));
        System.out.println("\nAre books one and three the same?: " + book1.equals(book3));
	    
	System.out.println("\nTotal amount of books: "+ book1.getBookAmount());
	
        if (book1.getISBN().equals(book2.getISBN())) {
        System.out.println("\nBook one and book two have the same ISBN");
        } else {
        System.out.println("\nBook one and book two have different ISBN numbers");
        }
        
        System.out.println("\nBook one and book two have the same publisher "+ book1.equals(book2));
            
  }        
		
}
