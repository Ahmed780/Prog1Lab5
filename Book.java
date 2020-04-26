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
*This class encapsulates the concept of a book such as title, author, ISBN and year of publishing 
* @author Uzair Ahmed 
*/		
class Book {
    
    private String title;
    private String author;
    private String ISBN;
    private int bookYear;
    private String publisher = "Vanier";
    private static int bookAmount = 0;
      
    public Book(String title, String ISBN){
    this.title = title;
    this.author = author;
    this.ISBN = ISBN;
    this.bookYear = bookYear;
    String publisher;
    }
    
    public String getTitle (){
    return title;
    }
    
    public String getAuthor(){
    return author;
    }
    
    public String getISBN(){
    return ISBN;
    }
    
    public int getBookYear(){
    return bookYear;
    }
    
    public int getBookAmount(){
    return bookAmount;
    }
    
    public String getPublisher(){
    return publisher;
    }
    
    public void setTitle(String newTitle){
    title = newTitle;
    }
    
    public void setAuthor(String newAuthor){
    author = newAuthor;
    bookAmount++;
    }
    
    public void setISBN(String newISBN){
    ISBN = newISBN;    
    }
    
    public void setBookYear(int newBookYear){
    bookYear = newBookYear;    
    }
    
    public void setBookAmount(int newBookAmount){
    bookAmount = newBookAmount;    
    }
    
    public void setPublisher(String newPublisher){
    publisher = newPublisher;
    }
    
    @Override
    
   
    public String toString(){
        return  "************************************"+
                "\n*Author:           "+ author     + 
                "\n*ISBN:             " + ISBN      +
                "\n*Publishing year:  " + bookYear  +
                "\n*Publisher:        " +publisher  +
                "\n**********************************"; 
    }
        
    public boolean equals(Book book2){
    if (publisher.equals(book2.publisher) && bookAmount == book2.bookAmount){
    return true;
    } 
    else {
    return false;
    }
    
   }
}
